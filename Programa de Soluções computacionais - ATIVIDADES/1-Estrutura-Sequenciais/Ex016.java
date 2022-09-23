import java.util.Scanner;

public class Ex016 {
   
   public static void main(String[] args) {
      double areaM, qtdLatas, totalValor, LtDaLata, CoberturaTinta;
      int precoLata;

      LtDaLata = 18;
      CoberturaTinta = 3;
      precoLata = 80;

      Scanner sc = new Scanner(System.in);
      System.out.print("Digite o tamanho da área a ser pintada(M): ");
      areaM = sc.nextFloat();
       
      qtdLatas = Math.ceil(areaM / (LtDaLata * CoberturaTinta)); 
      
      totalValor = precoLata * qtdLatas;
      sc.close();

      System.out.format("Você irá precisar de %.0f Latas de tinta, dando um total de %.2f ", qtdLatas, totalValor);
       
      // 1 litro para cada 3m
      // latas 18 lt
      // custa R$ 80,00
      // informar ao usuario a quantidade de latas a serem comparadas e o preço total
   }
}
