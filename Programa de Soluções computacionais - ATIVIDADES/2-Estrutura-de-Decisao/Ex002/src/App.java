import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        double num = sc.nextDouble();
        sc.close();

        if (num < 0) {
            System.out.format("O numero %.0f é negativo. ", num);
        } else {
            System.out.format("O numero %.0f é positivo. ", num);
        } 
        
    }
}
