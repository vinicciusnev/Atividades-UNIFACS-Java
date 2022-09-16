import java.util.Scanner;

public class Ex012 {
   
   public static void main(String[] args) {
      try(Scanner sc = new Scanner(System.in)) {
         System.out.print("Digite a sua Altura(MT): ");
         double alt = sc.nextFloat();
         double resul = ((72.7*alt) - 58);
         System.out.printf("O seu peso ideal deveria ser %.2f KG ", resul);
      }
   }
}
