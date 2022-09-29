import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a quantidade de Habitantes do 1º País: ");
        double paisA = sc.nextDouble();
        System.out.print("Informe a quantidade de Habitantes do 2º País: ");
        double paisB = sc.nextDouble();
        System.out.print("Informe a taxa de crescimento do 1º País: ");
        double taxa1 = sc.nextDouble();
        System.out.print("Informe a taxa de crescimeento do 2 País: ");
        double taxa2 = sc.nextDouble();
        double ano = 0;


        while ( paisA <= paisB ) {
            paisA += paisA * (taxa1/100);
            paisB += paisB * (taxa2/100);
            ano += 1;
        }
        System.out.format("O pais A ultrapassa ou iguala ao Pais B em %.0f anos ! ", ano);
    }
}
