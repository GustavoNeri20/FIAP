import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int somaLinha=0, somaTotal=0, somaColuna=0;
		int arrayNumeros[][] = new int[4][4];
		
		for(int l=0; l<4; l++) {
			for(int c=0; c<4; c++) {
				System.out.print("Linha: "+l+" Coluna: "+c+": ");
				arrayNumeros[l][c] = scanner.nextInt();
				somaTotal = somaTotal + arrayNumeros[l][c];
			}
			
		}
		for(int l=0; l<4; l++) {
			somaLinha = 0;
			somaColuna =0;
			for(int c=0; c<4; c++) {
				
				somaLinha += arrayNumeros[l][c];
				somaColuna += arrayNumeros[c][l];
			}
			System.out.println("Soma das colunas é: "+somaColuna);
			System.out.println("Soma das linhas é: "+somaLinha);
		}
		
		
		
		
		System.out.println("Soma Total: "+somaTotal);
	}

}
