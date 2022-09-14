import java.util.Scanner;

public class Ex006 {
   
   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)) {
         System.out.print("Digite o raio do Círculo: ");
         double raioC = t.nextDouble();
         double result =  3.14 * Math.pow(raioC,2);
         System.out.print("A area do Círculo é " + result + " CM²");
      }
   }
}
