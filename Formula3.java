// mohamed saada
// lab1c
// jgrasp
// javac 1.8.0_121
// windows 10

public class Formula3{
   public static int power3 (int z) {
      int x = 4;
      
      if (z > 0)
         return x * power3(z - 1);
      else
         return 1;
   }
   
   public static void main (String[] args) {
      System.out.println(power3(9));
   }
}