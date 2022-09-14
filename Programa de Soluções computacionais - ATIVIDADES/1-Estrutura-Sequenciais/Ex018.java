import java.util.Scanner;

public class Ex018 {
   
   public static void main(String[] args) {
      float tamanhoArquivo, velocidadeInternet;
      //float tamanhoEmKb, valorEmBits1, valoremBits2, valorDaConexao, valoremKb;
      double tempoDownloadEmMin;

      Scanner sc = new Scanner(System.in);
      System.out.print("Digite o tamanho do arquivo(MB): ");
      tamanhoArquivo = sc.nextFloat();
      System.out.print("Informe a velocidade da internet(Mbps): ");
      velocidadeInternet = sc.nextFloat();
      sc.close();

      // Valor em Bits
      //valorEmBits1 = velocidadeInternet * 1024;
      //valoremBits2 = valorEmBits1 * 1000;

      // Valor em KB
      //valoremKb = 1024 * 8;

      //valorDaConexao = valoremBits2 / valoremKb;

      // Descobrindo tempo

      //tamanhoEmKb = tamanhoArquivo * 1024;

      //tempoDownloadEmMin = tamanhoEmKb / valorDaConexao / 60;
      tempoDownloadEmMin = (tamanhoArquivo/(velocidadeInternet/8)/60);
      System.out.format("O tempo aproximado de Download é: %.0f Minutos ", tempoDownloadEmMin);
   }
}
