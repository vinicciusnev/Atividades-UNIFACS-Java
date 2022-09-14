import java.util.Scanner;

public class Ex008 {
   
   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)) {
         System.out.print("Qual valor você ganha por hora ? ");
         float salarioH = t.nextFloat();
         System.out.print("Quantas horas você trabalha por mês ? ");
         float horasT = t.nextFloat();
         float salarioMes = salarioH * horasT;
         System.out.print("Seu salario mensal é R$ " + salarioMes);
      }
   }
}
