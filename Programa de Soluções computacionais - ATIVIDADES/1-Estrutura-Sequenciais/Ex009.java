import java.util.Scanner;


public class Ex009 {
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite a temperatura(F): ");
      float tempF = sc.nextFloat();
      sc.close();

      float tempC = 5 * ((tempF - 32)/9);
      System.out.printf("A temperatura em Celsius é %.2f ºC", tempC);     
   }
}
