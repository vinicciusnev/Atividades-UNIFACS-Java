import java.util.Scanner;

public class Ex006 {
   
   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)) {
         System.out.print("Digite o raio do Círculo: ");
         double raioC = t.nextDouble();
         double result =  Math.PI * Math.pow(raioC,2);
         System.out.printf("A área do Círculo é %.2f Centimetros", result);
      }
   }
}
