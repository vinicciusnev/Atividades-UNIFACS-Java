import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um Numero: ");
        int n = sc.nextInt();
        sc.close();

        imprimeLinha(n);

    }

    public static void imprimeLinha(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
            
        }
    }
}
