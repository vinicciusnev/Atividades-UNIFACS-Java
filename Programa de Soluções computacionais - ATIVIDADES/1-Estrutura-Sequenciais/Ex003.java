import java.util.Scanner;

public class Ex003 {
   
   public static void main(String[] args) {
      double num1, num2, resultado;

      Scanner sc = new Scanner(System.in);
      System.out.print("Digite o primeiro número: ");
      num1 = sc.nextDouble();
      System.out.print("Digite o segundo número: ");
      num2 = sc.nextDouble();
      sc.close();

      resultado = num1 + num2;
      System.out.println("O resultado é " + resultado);
   }
}

