import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String a = "Você ganhou, parabéns\n";
        String b = "\n\n\t*****  Craps! *****\n\nVocê perdeu!!!\tTente de novo\n";
        String c = "Ponto\n";

        System.out.println("*****Jogo de Craps*****\n SEJA BEM VINDO E BOA SORTE\n");

        while (true) {
            System.out.println("Girar os dados ? [S] ou [N] ");
            String jogar = sc.next();

            if (jogar.equalsIgnoreCase("n")) {
                break;
            } else {
                int resultado = randomDados();
                if (resultado == 7 || resultado == 11) {
                    System.out.println(a);
                    break;
                } else if (resultado == 2 || resultado == 3 || resultado == 12) {
                    System.out.println(b);
                    break;
                } else {
                    System.out.println(c);
                }
                while (true) {
                    System.out.println("Girar os dados novamente ? S ou N: ");
                    String jogar2 = sc.next();

                    if (jogar2.equalsIgnoreCase("N")) {
                        break;
                    } else {
                        int resultado2 = randomDados();
                        if (resultado == resultado2) {
                            System.out.println(a);
                            break;
                        } else if (resultado2 == 7) {
                            System.out.println(b);
                            break;
                        } else {
                            System.out.println("Ainda não foi dessa vez!\nSEGUE O JOGO!!!\n");
                        }
                    }

                }
            }
        }

    }

    public static int randomDados() {
        int dado1 = (int) (1 + Math.random() * (7 - 1));
        int dado2 = (int) (1 + Math.random() * (7 - 1));

        int soma = dado1 + dado2;
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("A soma dos dados foi: " + soma);

        return soma;

    }

}