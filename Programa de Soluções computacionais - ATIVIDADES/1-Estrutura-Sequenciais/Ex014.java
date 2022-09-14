import java.util.Scanner;

public class Ex014 {
   
   public static void main(String[] args) {
      
      float peso, excesso, multa;
      excesso = 0;
     

      Scanner sc = new Scanner(System.in);
      System.out.print("Digite o peso do peixe(KG): ");
      peso = sc.nextFloat();      
      sc.close();
      if (peso > 50) {
         excesso = peso - 50;          
      }
      multa = excesso * 4;
      System.out.format("O peixe ultrapassou %.2f KG, e você deverá pagar R$ %.2f ", excesso, multa);

      //  Peso maximo é 50kg, excedendo o limite de peso, deve pagar R$ 4,00 por kg que passou
      // peso, excesso, multa
   }
}
