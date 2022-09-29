import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String usuario, senha;

        
        System.out.print("Digite seu nome de Usuario: ");
        usuario = sc.next();
        System.out.print("Digite uma senha: ");
        senha = sc.next();
        
 
        while(usuario.equals(senha)) { 
            System.out.println("Usuario não deve ser igual a senha. Tente novamente!");

            System.out.print("Digite novamente o Usuario: ");
            usuario = sc.next();
            System.out.print("Digite novamente a senha: ");
            senha = sc.next();

        } 
        
     
        System.out.println("Usuario Cadastrado com Successo! ");
        sc.close();
        }
    }

