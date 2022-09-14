import java.util.Scanner;

public class Ex012 {
   
   public static void main(String[] args) {
      try(Scanner sc = new Scanner(System.in)) {
         System.out.print("Digite a sua Altura(MT): ");
         float alt = sc.nextFloat();
         float resul = (float) ((72.7*alt) - 58);
         System.out.print(resul);
      }
   }
}
