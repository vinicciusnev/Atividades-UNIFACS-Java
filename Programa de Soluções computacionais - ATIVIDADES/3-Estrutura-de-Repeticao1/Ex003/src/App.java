import java.util.Scanner;

public class App {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // NOME
        System.out.print("Informe o seu nome: ");
        String nome = sc.next();
        while (nome.length() <= 3) {
            System.out.println("ERRO! O Seu nome deve conter mais que 3 caracteres");
            System.out.println("");
            System.out.print("Informe o seu nome novamente: ");
            nome = sc.next();
        }

        // IDADE
        System.out.print("Informe a sua idade: ");
        int idade = sc.nextInt();
        while ((idade < 0) || (idade > 150)) {
            System.out.println("ERRO! Sua idade deve estar entre 0 a 150 anos.");
            System.out.println("");
            System.out.print("Informe a sua idade novamente: ");
            idade = sc.nextInt();

        }

        // SALARIO  
        System.out.print("Informe o seu Salario: ");
        float salario = sc.nextFloat();
        while(salario < 0) {
            System.out.println("ERRO! O seu salario deve ser maior do que 0 !");
            System.out.println("");
            System.out.print("Informe o seu salario novamente: ");
            salario = sc.nextFloat();
        }
        // SEXO
        System.out.print("Digite [F] para Feminino ou [M] para Masculino: ");
        String sexo = sc.next();
        while(! sexo.equalsIgnoreCase("M") && ! sexo.equalsIgnoreCase("F")) {
            System.out.print("ERRO! Digite [F] para Feminino ou [M] para Masculino: ");
            sexo = sc.next();
            }

        // ESTADO CIVIL
        System.out.print("Informe o seu Estado Civil: ");
        char estadoCivil;
        estadoCivil = sc.next().charAt(0);
        estadoCivil = Character.toUpperCase(estadoCivil);
        while((estadoCivil != 'S') && (estadoCivil != 'C') && (estadoCivil != 'V') && (estadoCivil != 'D')) {

            System.out.print("ERRO! Digite o seu estado Civil (Solteiro, Casado, Viuvo(a) ou Divorciado(a): ");
            estadoCivil = sc.next().charAt(0);
            estadoCivil = Character.toUpperCase(estadoCivil);
            }
        sc.close();
        System.out.println("-------------------------------------------");
        System.out.println("      CADASTRO CONCLUIDO COM SUCESSO!");
        System.out.println("-------------------------------------------");
        System.out.println("");
        //System.out.println(" Segue suas informações cadastradas: ");
        //System.out.println("Seu nome: " + nome+", " + "Sua idade: " + idade + ", " + "Seu Salario: R$ " + salario + ", " + "Seu Sexo: " + sexo + ", " + "Seu Estado Civil: " + estadoCivil);
        
        }   
    }
    




        
    
