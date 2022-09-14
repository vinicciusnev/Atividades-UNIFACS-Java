import java.util.Scanner;

public class Ex009 {
   
   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)) {
         System.out.print("Digite a temperatura: ");
         float tempF = t.nextFloat();
         float tempC = 5 * ((tempF - 32)/9);
         System.out.format("A temperatura em Celsius é %.2f ºC", tempC);
      }
      
   }
}
