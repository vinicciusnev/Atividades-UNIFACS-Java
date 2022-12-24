import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do 1º Produto: ");
        double produto1 = sc.nextDouble();
        System.out.print("Digite o preço do 2º Produto: ");
        double produto2 = sc.nextDouble();
        System.out.print("Digite o preço do 3º Produto: ");
        double produto3 = sc.nextDouble();
        sc.close();

        if ((produto1 < produto2) && (produto1 < produto3)) {
            System.out.println("O produto mais em conta, é o do valor de R$ " + produto1);
        } else if((produto2 < produto1) && (produto2 < produto3)) {
            System.out.println("O produto mais em conta, é o do valor de R$ " + produto2);
        } else {
            System.out.println("O produto mais em conta, é o do valor de R$ " + produto3);
        }

    }
}
