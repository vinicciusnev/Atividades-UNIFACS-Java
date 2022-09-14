import java.util.Scanner;

public class Ex007 {
   
   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)) {
         System.out.print("Digite a base do Quadrado: ");
         float baseQ = t.nextFloat();
         System.out.print("Digite a altura do Quadrado: ");
         float altQ = t.nextFloat();
         float a = baseQ * altQ * 2;
         System.out.print("O dobro da área do Quadrado é " + a + " CM²");

         
      }
   }
}
