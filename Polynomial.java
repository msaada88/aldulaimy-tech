public class Polynomial {
    private int degree;
    int[] numbers; // to store the coefficients of the polynomial

    // Make the polynomial from an array
    public Polynomial(int[] newNumbers) {
        numbers = newNumbers;
        degree = newNumbers.length - 1; // because degree 0 is item 0 in array so degree is length - 1
    }

    // Returns the degree of the polynomial.
    // The degree of the polynomial is always equal to
    // the highest non-negative exponent of x in the polynomial.
    public int degree() {
        return degree;
    }

    // Returns the coefficient of the x^power term.
    public int getCoefficient(int power) {
        if (power < 0)
            throw new InvalidPowerException("Power cannot be negative");
        else
            return numbers[power];
    }

    // Replaces the coefficient of the x^power term with newCoef
    public void changeCoefficient(int newCoef, int power) {
        if (power < 0)
            throw new InvalidPowerException("Power cannot be negative");
        else if (power >= numbers.length) { // must make array bigger
            Polynomial temp = new Polynomial(new int[power + 1]); // smallest size array that will fit everything
            temp = this.add(temp); // temp will be the old polynomial jst in a bigger array
            numbers = temp.numbers; // replace numbers with the expanded
        }
        numbers[power] = newCoef;
    }

    // Returns the sum of the given polynomial object and the polynomial argument
    public Polynomial add (Polynomial addend) {
        int[] array;
        if (numbers.length > addend.numbers.length) // make result array of bigger size
            array = new int[numbers.length];
        else
            array = new int[addend.numbers.length];

        for (int i = 0; i < numbers.length; i++) { // add first polynomial coeffs
            array[i] = numbers[i];
        }

        for (int j = 0; j < addend.numbers.length; j++) { // second first polynomial coeffs
            array[j] += addend.numbers[j];
        }

        Polynomial sum = new Polynomial(array); // put results array in new polynomial

        return sum;
    }

    // Takes the polynomial whose toString method is being called and
    // represents the polynomial as a string
    // Note that this overrides Object.toString
    public String toString() {
        String s = "";

        for (int pow = numbers.length - 1; pow >= 0; pow--) {
            int curr = numbers[pow]; //store current coef

            if (curr != 0) { // skip zero terms
                if (curr > 0)
                    s += "+"; // + for positives
                else
                    s += "-"; // - for negatives

                if (curr != 1 && curr != -1 && pow != 0)
                    s += Math.abs(curr); // +1, -1 coefficients don't display the 1 (unless power is 0)

                if (pow > 1)
                    s += "x^" + pow;
                else if (pow == 1) //power 1 don't display ^1
                    s += "x";
                else // power 0 don't display x^0
                    s += Math.abs(curr);
            }
        }

        // first term don't display a preceding +
        if (s.charAt(0) == '+')
            s = s.substring(1, s.length());

        return s;
    }
}
