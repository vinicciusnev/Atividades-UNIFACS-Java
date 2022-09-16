import java.util.Scanner;

public class Ex002 {
   
   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)) {
         System.out.print("Digite um numero: ");
         int num = t.nextInt();
         System.out.println("O numero informado foi " + num);
      }
   }
}
