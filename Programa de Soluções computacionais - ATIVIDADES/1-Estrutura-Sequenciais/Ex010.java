import java.util.Scanner;

public class Ex010 {
   
   public static void main(String[] args) {
      try(Scanner t = new Scanner(System.in)) {
         System.out.print("Digite a temperatura: ");
         float tempC = t.nextFloat();
         float tempF = (float) ((tempC * 1.8) + 32);
         System.out.format("A temperatura em Fahrenheit é %.2f ºC", tempF);
      }
   }
}
