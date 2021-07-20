import java.util.Scanner;

public class Lista2Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m[][] = new int[2][2];
		int r[][] = new int[2][2];
		int maiorElemento=0;
		
		for(int indLinha=0; indLinha<2; indLinha++){//1
			
			for(int indColuna=0; indColuna<2; indColuna++) { 
				System.out.print("Informe um número M ["+(indLinha+1)+","+(indColuna+1)+"]= ");
				m[indLinha][indColuna] = scanner.nextInt();
				
				//GUARDAR O MAIOR
				if(m[indLinha][indColuna]>maiorElemento) {
					maiorElemento = m[indLinha][indColuna];
				}
				
			}	
		}//1
		for(int indLinha=0; indLinha<2; indLinha++) {//2
			for(int indColuna=0; indColuna<2; indColuna++) { 
				r[indLinha][indColuna] = maiorElemento*m[indLinha][indColuna];
				System.out.println("Informe um número M ["+(indLinha+1)+","+(indColuna+1)+"]= "+(r[indLinha][indColuna]));

				
				
				
		}
	}//2

}
}
