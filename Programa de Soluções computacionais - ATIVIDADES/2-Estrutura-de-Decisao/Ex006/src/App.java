import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        informeNumeros();
        
        

        
    }

    public static void informeNumeros() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o 1º numero: ");
        int a = sc.nextInt();
        System.out.print("Digite o 2º numero: ");
        int b = sc.nextInt();
        System.out.print("Digite o 3º numero: ");
        int c = sc.nextInt();
        sc.close();



        if ((a > b) && (a > c )) {
            System.out.println(a);
        } else if ((b > a) && (b > c)) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
