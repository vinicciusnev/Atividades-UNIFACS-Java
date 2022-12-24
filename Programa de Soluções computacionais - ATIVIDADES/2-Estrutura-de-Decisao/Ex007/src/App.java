import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º numero: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o 2º numero: ");
        int num2 = sc.nextInt();
        System.out.print("Digite o 3º numero: ");
        int num3 = sc.nextInt();
        
        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("O maior número digitado foi " + num1);
        } else if((num2 > num1) && (num2 > num3)) {
            System.out.println("O maior número digitado foi " + num2);
        } else {
            System.out.println("O maior número digitado foi " + num3);
        }

        if ((num1 < num2) && (num1 < num3)) {
            System.out.println("O menor número digitado foi " + num1);
        } else if((num2 < num1) && (num2 < num3)) {
            System.out.println("O menor número digitado foi " + num2);
        } else {
            System.out.println("O menor número digitado foi " + num3);
        }
    }

}
