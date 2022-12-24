import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();
        sc.close();

        int qtdDigitos = InformeNumero(num);

        System.out.println("O numero " + num + " tem " + qtdDigitos + " digitos");

    }

    public static int InformeNumero(int a) {

        String s = Integer.toString(a);

        return s.length();
    }
}
