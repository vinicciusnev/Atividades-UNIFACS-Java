import java.util.Scanner;

public class oop {
    public static void main(String[] args) {
        try(Scanner t = new Scanner (System.in)) {
            System.out.print("Digite um numero: ");
            int numA = t.nextInt();
            System.out.print("Digite ouro numero: ");
            int numB = t.nextInt();
            int resul = numA * numB;
            System.out.print("A multiplicação é " + resul);
        }
    }
}
