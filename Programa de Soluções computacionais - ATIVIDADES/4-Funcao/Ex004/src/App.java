import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor qualquer: ");
        int a = sc.nextInt();
        sc.close();

        String retorno = umArg(a);

        System.out.println(retorno);


    }


    public static String umArg(int a) {
        String retorno;
        
        if (a >= 0) {
            retorno = "P";
        } else {
            retorno  = "N";
        }

        return retorno;
        
        
    }
}
