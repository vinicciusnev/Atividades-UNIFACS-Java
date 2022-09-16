import java.util.Scanner;

public class Ex005 {
   
   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)) {
      System.out.println("------------------------------");
      System.out.println(" Conversor de METROS para CM");
      System.out.println("------------------------------");
      System.out.print("Digite um valor em Metros: ");
      double metros = t.nextDouble();
      double cm = metros * 100;
      System.out.print("O valor em Centímetros é " + cm);
      }
      
   }
}
