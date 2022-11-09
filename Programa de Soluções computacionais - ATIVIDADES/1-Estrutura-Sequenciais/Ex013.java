import java.util.Scanner;

public class Ex013 {

   public static void main(String[] args) {
      float altura;
      char genero;
      double pesoIdeal;

      Scanner sc = new Scanner(System.in);
      System.out.print("Digite a sua altura: ");
      altura = sc.nextFloat();
      System.out.print("Digite [M] para Masculino ou [F] para Feminino: ");
      genero = sc.next().charAt(0); 
      
      sc.close();

      if(genero == 'M') {
         pesoIdeal = (72.7 * altura) - 58;
         System.out.format("o Seu peso ideal é %.2f", pesoIdeal);
      } else if (genero == 'F') {
         pesoIdeal = (62.1 * altura) - 44.7;
         System.out.format("o Seu peso ideal é %.2f", pesoIdeal);
      } else {
         System.out.println("Gênero não encontrado");
      }

   }
}
