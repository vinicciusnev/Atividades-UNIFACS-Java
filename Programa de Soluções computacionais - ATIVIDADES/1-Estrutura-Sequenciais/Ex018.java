import java.util.Scanner;

public class Ex018 {
   
   public static void main(String[] args) {
      double tamanhoArquivo, velocidadeInternet;
      

      Scanner sc = new Scanner(System.in);
      System.out.print("Digite o tamanho do arquivo(MB): ");
      tamanhoArquivo = sc.nextDouble();
      System.out.print("Informe a velocidade da internet(Mbps): ");
      velocidadeInternet = sc.nextDouble();
      sc.close();

   
      tamanhoArquivo = (tamanhoArquivo/(velocidadeInternet/8)/60);
      System.out.format("O tempo aproximado de Download é: %.2f Minutos ", tamanhoArquivo);
   }
}
