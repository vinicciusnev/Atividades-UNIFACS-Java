import java.util.Scanner;
public class Ex017 {
   
   public static void main(String[] args) {
      double areaM, qtdLatas, precoGaloes, qtdGaloes, precoTotalLata, qtdMLatas, qtdRestoGaloes, precoRestoGaloes, precoRestoLatas, totalResto, areaFolga, ltPorGaloes, metroPorGaloes, precoLata, precoTotalGaloes;

      int ltPorLatas, ltPorMetro, metrosPorLata;
      
      ltPorLatas = 18;
      ltPorGaloes = 3.6;
      ltPorMetro = 6;
      precoLata = 80;
      precoGaloes = 25;
      
      metroPorGaloes = ltPorGaloes * ltPorMetro;
      metrosPorLata = ltPorLatas * ltPorMetro;
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite a area a ser pintada(M): ");
      areaM = sc.nextFloat();
      areaFolga = areaM * 1.1; // Acrescentou folga de 10% na Area
      
      
      qtdLatas = Math.ceil(areaFolga / metrosPorLata);
      precoTotalLata = precoLata * qtdLatas;

      qtdGaloes = Math.ceil(areaFolga / metroPorGaloes);
      precoTotalGaloes = precoGaloes * qtdGaloes;

      qtdMLatas =  Math.floor(areaFolga / metrosPorLata);
      qtdRestoGaloes = Math.ceil((areaFolga - qtdMLatas  * metrosPorLata) / metroPorGaloes);
      precoRestoLatas = qtdMLatas * precoLata;
      precoRestoGaloes = qtdRestoGaloes * precoGaloes;
      totalResto = precoRestoGaloes + precoRestoLatas;
      sc.close();
      
      System.out.format("Qtd Latas de tinta(18lt): %.0f Latas | Total: R$ %.2f OU\nQtd Galões(3,6LT): %.0f Galões | Total: R$ %.2f \n", qtdLatas, precoTotalLata, qtdGaloes, precoTotalGaloes); 
      System.out.println("\n-------------------------------------------------------");
      System.out.println("            Misturando Latas e Galões                  ");
      System.out.println("-------------------------------------------------------");
      System.out.format("Qtd Latas de tinta(18LT): %.0f e Qtd Galões(3,6LT): %.0f | Total: R$ %.2f ", qtdMLatas, qtdRestoGaloes, totalResto);

      
   }
}


