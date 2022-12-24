import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var sc = new Scanner(System.in);

        System.out.print("Informe o 1º numero: ");
        int num1 = sc.nextInt();
        System.out.print("Informe o 2º numero: ");
        int num2 = sc.nextInt();
        System.out.print("Informe o 3º numero: ");
        int num3 = sc.nextInt();

        int n[] = {num1, num2, num3};

        Arrays.sort(n);
        
        for (int i : n) {
            System.out.println(i + " ");
        }

        
        
     
    }
}
