// mohamed saada
// lab1b
// jgrasp
// javac 1.8.0_121
// windows 10

public class TripleCallCounter {
   public static int solveTripleCounter(int n) {
      if (n == 0)
         return 0;
      if (n == 1)
         return 1;
      else
         return solveTripleCounter(n - 1) + solveTripleCounter(1) + solveTripleCounter(n - 1);      
   }
   public static void main (String[] args) {
      System.out.println(solveTripleCounter(6));
   }
}

// t(n) = 2^n - 1