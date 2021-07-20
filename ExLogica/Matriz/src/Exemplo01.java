import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int arrayNumeros[][] = new int[3][3];
		
		for(int indLinha=0; indLinha<3; indLinha++) { //Primeiro for
			
			
			for(int indColuna=0; indColuna<3; indColuna++) { //Segundo for
				System.out.print("Informe o elemento da matriz - Linha: "+indLinha+" - Coluna: "+indColuna+" - ");
				arrayNumeros[indLinha][indColuna] = entrada.nextInt();
			} //Segundo for
			
		}//Primeiro for
		//MOSTRAR
		for(int indLinha=0; indLinha<3; indLinha++) { //Primeiro for
			
			
			for(int indColuna=0; indColuna<3; indColuna++) { //Segundo for
				System.out.println("Matriz Números ["+indLinha+", "+indColuna+"]: "+arrayNumeros[indLinha][indColuna]);
				
			}
		}
		
		for(int indLinha=0; indLinha<3; indLinha++) { //Primeiro for
			for(int indColuna=0; indColuna<3; indColuna++) { //Segundo for
				System.out.print(arrayNumeros[indLinha][indColuna]+"\t");
				
			}
			System.out.println("");
			
		}
		
		
	}

}
