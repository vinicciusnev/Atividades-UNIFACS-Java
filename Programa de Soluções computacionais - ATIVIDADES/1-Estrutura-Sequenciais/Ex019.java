import java.util.Scanner;

public class Ex019 {
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite o valor de A: ");
      int A = sc.nextInt();
      System.out.print("Digite o valor de B: ");
      int B = sc.nextInt();
      System.out.print("Digite o valor de C: ");
      int C = sc.nextInt();
      sc.close();

      int soma = A + B;
      System.out.println("O resultado da soma é " + soma);
      System.out.println("");

      if (soma > C) {
         System.out.println("A soma entre A e B, é maior do que C");

      } else if (soma < C) {
         System.out.println("A soma entre A e B é menor do que C ");
      } else {
         System.out.println("A soma entre A e B é igual a C ");
      }
      
   }
}
