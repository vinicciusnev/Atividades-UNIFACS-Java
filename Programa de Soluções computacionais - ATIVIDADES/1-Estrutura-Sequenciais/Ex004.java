import java.util.Scanner;

public class Ex004 {
   
   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)) {
         System.out.print("Digite a primeira nota: ");
         float nota1 = t.nextFloat();
         System.out.print("Digite a segunda nota: ");
         float nota2 = t.nextFloat();
         System.out.print("Digite a terceira nota: ");
         float nota3 = t.nextFloat();
         System.out.print("Digite a quarta nota: ");
         float nota4 = t.nextFloat();
         float media = (nota1 + nota2 + nota3 + nota4) / 4;
         System.out.print("A media é " + media);
      }
   }
}
