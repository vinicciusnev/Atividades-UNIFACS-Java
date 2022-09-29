import java.util.Arrays;
import java.util.Scanner;

public class Ex021 {
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int[] listaDeNumeros = new int[4];
           
           // Preenche o Array a partir da posição 1
           for (int i = 1; i < listaDeNumeros.length; i++) 
           {
	           System.out.print("Digite o "+ i + "° numero: "); 
	           listaDeNumeros[i] = (sc.nextInt());
	         }
           
           // Coloca o Array em ordem crescente
           Arrays.sort(listaDeNumeros);
           
           // Lista o Array em ordem crescente
         System.out.print("Ordem crescente: "); 
       	  for (int j = 1; j < listaDeNumeros.length; j++) 
       	  {
       		System.out.print(listaDeNumeros[j]+ "  ");       		
		      }  
         sc.close();
       	           
        	 
   }
}

