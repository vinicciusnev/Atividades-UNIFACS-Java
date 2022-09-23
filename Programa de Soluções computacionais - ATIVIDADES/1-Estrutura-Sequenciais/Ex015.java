import java.util.Scanner;

public class Ex015 {
   
   public static void main(String[] args) {
      double salarioPorHora, salarioBruto, impostodeRenda, inss, sindicato;
      float salarioLiquido;
      int horasTrabalhadas;


      Scanner sc = new Scanner(System.in);
      System.out.print("Quanto você ganha por hora ? ");
      salarioPorHora = sc.nextFloat();
      System.out.print("Quantas horas você trabalha por mês ? ");
      horasTrabalhadas = sc.nextInt();
      salarioBruto = salarioPorHora * horasTrabalhadas;
      impostodeRenda = salarioBruto * 0.11;
      inss = salarioBruto * 0.08;
      sindicato = salarioBruto * 0.05;
      salarioLiquido = (float) (salarioBruto - impostodeRenda - inss - sindicato);
      sc.close();
      System.out.println("+ Salário Bruto: R$ " + salarioBruto);
      System.out.println(" - IR(11%): R$ " + impostodeRenda);
      System.out.println(" - INSS(8%): R$ " + inss);
      System.out.println(" - Sindicato(5%): R$ " + sindicato);
      System.out.println("= Salário Liquido: R$ " + salarioLiquido);
      



   }
}
