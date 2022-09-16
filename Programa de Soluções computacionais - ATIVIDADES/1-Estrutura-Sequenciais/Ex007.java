import java.util.Scanner;

public class Ex007 {
   
   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)) {
         System.out.print("Digite o lado do Quadrado: ");
         float ladoQ = t.nextFloat();
         float areaQ = (ladoQ * ladoQ) * 2;
         System.out.print("O dobro da Área do quadrado é " + areaQ);
         
      }
   }
}
