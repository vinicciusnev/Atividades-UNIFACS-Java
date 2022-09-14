import java.util.Scanner;


public class Ex013 {
   
   public static void main(String[] args) {
      float altura;
      String genero; 
      double pesoIdeal;


      Scanner sc = new Scanner(System.in);
      System.out.print("Digite a sua altura: ");
      altura = sc.nextFloat();
      System.out.print("Digite [M] para Masculino ou [F] para Feminino: ");
      genero = sc.next();
      sc.close();

      switch (genero) {
         case "M":
            pesoIdeal = (72.7 * altura) - 58;
            System.out.format("o Seu peso ideal é %.2f", pesoIdeal); 
            break;
         case "F":
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.format("o Seu peso ideal é %.2f", pesoIdeal);
            break;
         default:
            System.out.println("Gênero não encontrado");

         
      }
      
      

   }
}
