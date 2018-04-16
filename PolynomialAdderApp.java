import java.util.Scanner;

public class PolynomialAdderApp {
    public static void main(String[] args) {
        Polynomial a = new Polynomial(new int[1]);
        Polynomial b = new Polynomial(new int[1]);
        Polynomial sum;
        Scanner keyboard = new Scanner(System.in);
        int coef = 0;
        int pow = 0;

        print("--------------------------------------------");
        print("Polynomial Adder");
        print("This program adds two polynomials and displays the result.");
        print("");
        print("Enter first polynomial.");
        print("Enter each term on a separate line; coefficient followed by power.");
        print("For example, 3 4 represents the term 3x^4.");
        print("Enter -1 -1 to end input for the polynomial.");

        while (!(coef == -1 && pow == -1)) {
            coef = keyboard.nextInt();
            pow = keyboard.nextInt();

            if (pow < 0 && coef != -1) {
                print("Error: cannot have negative power.");
                print("Please re-enter term and continue.");
            }
            else if (!(coef == -1 && pow == -1))
                a.changeCoefficient(coef, pow);
        }
        print("First polynomial: " + a);

        coef = 0;
        pow = 0;

        print("Enter second polynomial.");
        print("Enter each term on a separate line; coefficient followed by power.");
        print("For example, 3 4 represents the term 3x^4.");
        print("Enter -1 -1 to end input for the polynomial.");

        while (!(coef == -1 && pow == -1)) {
                coef = keyboard.nextInt();
                pow = keyboard.nextInt();

                if (pow < 0 && coef != -1) {
                    print("Error: cannot have negative power.");
                    print("Please re-enter term and continue.");
                }
                else if (!(coef == -1 && pow == -1))
                    b.changeCoefficient(coef, pow);
        }

        print("Second polynomial: " + b);
        print("");

        sum = a.add(b);
        print("First polynomial: " + a);
        print("Second polynomial: " + b);
        print("Sum: " + sum);
    }

    // method to make printing easier
    private static void print(String s) {
        System.out.println(s);
    }
}