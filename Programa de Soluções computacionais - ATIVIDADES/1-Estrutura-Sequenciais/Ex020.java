import java.util.Scanner;


public class Ex020 {
   
  
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite o valor de A: ");
      int A = sc.nextInt();
      System.out.print("Digite o valor de B: ");
      int B = sc.nextInt();
      System.out.print("Digite o valor de C: ");
      int C = sc.nextInt();
      sc.close();

      if (A <= B && B <= C)
      {
         System.out.format("A ordem crescente: %d %d %d", A, B, C);
      }
      else if (A <= C && C <= B)
      {
         System.out.format("A ordem crescente: %d %d %d", A, C, B);
      }
      else if (B <= A && A <= C)
      {
         System.out.format("A ordem crescente: %d %d %d", B, A, C);
      }
      else if (B <= C && C <= A) 
      {
         System.out.format("A ordem crescente: %d %d %d", B, C, A);
      }
      else if (C <= A && A <= B) 
      {
        System.out.format("A ordem crescente: %d %d %d", C, A, B);
      }
      else /* n3 <= n2 && n2 < n1 */
      {
         System.out.format("A ordem crescente: %d %d %d", C, B, A);
      }
   }

}