import java.util.Scanner;

public class Lista2Ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String produtos[] = new String[] {"Notebook", "Computadores", "Tablets", "Servidores"};
		int vendas[][] = new int[7][4];
		int melhor=0, pior=0;
		String melhorProd = null, piorProd = null;
		
		for(int i=0; i<4; i++) {
			System.out.println("-------- "+(i+1)+"º Trimestre");
			for(int j=0; j<4; j++) {
				System.out.print("----- "+(produtos[j]+": "));
				vendas[i][j] = scanner.nextInt();
			}
		}
		
		//B SOMA DOS TRIMESTRES
		System.out.println("----------------------------------------");
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				vendas[4][i] += vendas[i][j];
			}
			System.out.println("----- Soma do total de produtos vendidos no "+(i+1)+"º Trimestre: "+vendas[4][i]);
		}
		//A SOMA POR LINHA
		System.out.println("----------------------------------------");
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				vendas[5][i] += vendas[j][i];
			}
			System.out.println("----- Soma do total de "+produtos[i]+": "+vendas[5][i]);
		}
		
		//C MELHOR E PIOR LINHA
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(vendas[5][i]>melhor) {
					melhor = vendas[5][i];
					melhorProd=produtos[i];
					pior = vendas[5][i];
					piorProd=produtos[i];
				}else if(vendas[5][i]<pior) {
					pior = vendas[5][i];
					piorProd=produtos[i];
				}
			}
		}
	
		System.out.println("----------------------------------------");
		System.out.println("Melhor produto: "+melhorProd+"       Quantidade: "+melhor);
		System.out.println("Melhor produto: "+piorProd+"       Quantidade: "+pior);

	}

}
