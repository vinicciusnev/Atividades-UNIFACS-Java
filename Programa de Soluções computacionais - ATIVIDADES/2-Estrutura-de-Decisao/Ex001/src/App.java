import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();
        sc.close();
        
        if (num1 > num2) {
            System.out.println("O maior número digitado foi " + num1);
        } else {
            System.out.println("O maior número digitado foi " + num2);
        }
        
    }
}
