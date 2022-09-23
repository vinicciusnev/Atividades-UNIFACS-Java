import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite [F] para Feminino e [M] para Masculino: ");
        char sexo;
        sexo = sc.next().charAt(0); // Pegar a primeira Posição
        sexo = Character.toUpperCase(sexo); // Colocar o Caracter maiusculo 
        sc.close();

        if (sexo == 'F')  {
            System.out.print("F - Feminino");

        } else if (sexo == 'M')  {
            System.out.print("M - Masculino");
        } else {
            System.out.print("Sexo Invalido");
        }
         
        }

    }

