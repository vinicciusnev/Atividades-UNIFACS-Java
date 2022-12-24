import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int n = sc.nextInt();

        imprimirLinhas(n);

        sc.close();

    }

    public static void imprimirLinhas(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  ");
            }
            System.out.println(" ");
        }
    }

}