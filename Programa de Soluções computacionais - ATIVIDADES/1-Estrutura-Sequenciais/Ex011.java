import java.util.Scanner;
import java.lang.Math;

public class Ex011 {
   


   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)) {
         System.out.print("Digite um numero Inteiro: ");
         int num1 = t.nextInt();
         System.out.print("Digite outro numero Inteiro: ");
         int num2 = t.nextInt();
         System.out.print("Digite um numero Real: ");
         double num3 = t.nextFloat();
         int a = (num1*2) * (num2/2);
         double b =  ((num1*3) + num3);
         double c =  Math.pow(num3,3);
         System.out.println(a);
         System.out.println(b);
         System.out.print(c);
      }
   }
}
