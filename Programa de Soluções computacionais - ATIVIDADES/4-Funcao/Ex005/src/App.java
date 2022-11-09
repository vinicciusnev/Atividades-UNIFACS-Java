import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do Produto: ");
        double valorProduto = sc.nextDouble();
        System.out.print("Digite o percentual do imposto: ");
        double percentual = sc.nextDouble();
        sc.close();

        double valorFinal = somaImposto(percentual, valorProduto);

        System.out.println("O valor do produto somado a " + percentual + "% de imposto é R$ " + valorFinal);


    }


    public static double somaImposto(double taxaImposto, double custoItem) {
        double percentual = taxaImposto / 100;
         


        return custoItem + (percentual * custoItem);
    }
}
