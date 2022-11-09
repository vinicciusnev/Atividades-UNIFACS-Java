import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = sc.nextInt();
        sc.close();

        int somaAbc = tresArgs(a,b,c);

        System.out.println(somaAbc);

        
    }

    public static int tresArgs(int a, int b, int c) {

        int soma = a + b + c;
        
        return soma;
    }

}
