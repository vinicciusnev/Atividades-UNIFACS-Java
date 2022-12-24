import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        pegaNumero();
    }

    public static void pegaNumero() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número a ser invertido: ");
        int numero = sc.nextInt();
        sc.close();

        inverteNumero(numero);
    }

    public static void inverteNumero(int numero) {
        int i = 0;

        while (numero > 0) {
            i *= 10;
            i += (numero % 10);
            numero /= 10;

        }
        System.out.println("O número invertido é: " + i);
    }

}
