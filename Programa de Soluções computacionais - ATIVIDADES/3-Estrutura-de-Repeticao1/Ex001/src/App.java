import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma nota entre 0 e 10: ");
        int nota = sc.nextInt();
        
        
        if(nota >= 0 && nota <= 10) {
            System.out.println("Nota Cadastrada com sucesso! ");
           // nota = sc.nextInt();
        }

        while (nota < 0 || nota > 10) {
            System.out.print("Nota Invalida. Digite novamente: ");
            nota = sc.nextInt();
            
        }
        System.out.println("Nota Cadastrada com sucesso! ");        
        sc.close();    
    }
}
