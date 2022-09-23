import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double n1, n2, media;

        System.out.print("Digite a 1ª Nota: ");
        n1 = sc.nextDouble();
        System.out.print("Digite a 2ª Nota: ");
        n2 = sc.nextDouble();

        media = (n1 + n2)/2;
        System.out.println("Sua média foi " + media);
        sc.close();
        
        if(media == 10) {
            System.out.println("APROVADO COM DISTINÇÃO");
        } else if (media >= 7 && media <=9) {
            System.out.println("APROVADO");;
        } else {
            System.out.println("REPROVADO");
        }
        
        
    }
}
