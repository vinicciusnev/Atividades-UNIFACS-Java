import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double num1, num2, operation;
        double valor = 0; 
        String parouimpar, posouneg, intoudec; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        num1 = sc.nextDouble();
        System.out.println("Digite outro número: ");
        num2 = sc.nextDouble(); 
        System.out.println("Qua operação deseja fazer? [+ (1), - (2), * (3), / (4)]");
        operation = sc.nextDouble(); 

        if (operation == 1) {
            valor = num1 + num2; 
            System.out.println("O resultado da soma é " + valor);
        } else if (operation == 2) {
            valor = num1 - num2;
            System.out.println("O resultado da subtração é " + valor);
        } else if (operation == 3) {
            valor = num1 * num2; 
            System.out.println("O resultado da multiplicação é " + valor);
        } else if (operation == 4) {
            valor = num1 / num2; 
            System.out.println("O resultado da divisão é " + valor);
        }

        if (valor % 2 == 0) {
            parouimpar = "PAR";
            System.out.println("O valor é " + parouimpar);
        } else {
            parouimpar = "IMPAR";
            System.out.println("O valor é " + parouimpar);
        } 

        if (valor > 0) {
            posouneg = "POSITIVO";
            System.out.println("O valor é " + posouneg);
        } else {
            posouneg = "NEGATIVO";
            System.out.println("O valor é " + posouneg);
        }

        if (valor / 1 == valor) {
            intoudec = "INTEIRO"; 
            System.out.println("O valor é " + intoudec);
        } else {
            intoudec = "DECIMAL";
            System.out.println("O valor é " + intoudec);
        } 
        
    }
}
