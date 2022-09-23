import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma VOGAL ou CONSOANTE: ");
        //String N = sc.next();
        char letra = sc.next().charAt(0);
        //letra = Character.toUpperCase(letra);
        sc.close();
        

        if ((letra == 'a' || (letra == 'A')) || (letra == 'e'|| (letra == 'E')) || ((letra == 'i') || (letra == 'I')) || ((letra == 'o') || (letra == 'O')) || ((letra == 'u') || (letra == 'U'))) {
            System.out.print("A letra " +letra+ " é uma Vogal");

        } else {
            System.out.print("A letra " +letra+ " é uma Consoante");
        }
        
    }
}
