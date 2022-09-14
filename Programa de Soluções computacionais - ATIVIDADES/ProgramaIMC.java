import java.util.Scanner;

public class ProgramaIMC {

   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)) {
         System.out.print("Digite o seu peso(KG): ");
         double peso = t.nextDouble();
         System.out.print("Digite a sua altura(M): ");
         double alt = t.nextDouble();
         double imc = ((double) peso / Math.pow(alt,2));
         System.out.format("O seu IMC é %.2f || ", imc);
         
         if (imc < 18.5) {

            System.out.println("Abaixo do peso");
         } 

         if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Peso Normal");
            
         }

         if (imc >= 25 && imc <= 29.9) {
            System.out.println("SobrePeso");

         }

         if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesidade grau 1");
         }

         if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade grau 2");
         }

         if (imc > 40) {
            System.out.println("Obesidade grau 3");
         }


            

         
      }
   }


}

/* Usuario digitar o peso em KG
 * Usuario digitar a altura em M
 * Calcular o IMC > peso / altura ²
 * Imprimir o IMC do Usuario
 * Imprimir resultados dos indices de massa corporal
 */