import java.util.Scanner;

public class Refazer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String produtos[] = new String[] {"Notebook", "Computadores", "Tablets", "Servidores"};
		int vendas[][] = new int[7][4];
		int melhor=0, pior=0, melhorVenda=0, piorVenda=0;
		String melhorNome = null, piorNome = null, melhorVendaNome=null, piorVendaNome=null;
		
		System.out.println("--------------------------------------------");
		for(int i=0; i<4; i++) {
			System.out.println("------- "+(i+1)+"º Trimestre");
			for(int j=0; j<4; j++) {
				System.out.print("----- "+produtos[j]+": ");
				vendas[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("--------------------------------------------");
		for(int i=0; i<4; i++) {
			System.out.print("----- Digite a meta de "+produtos[i]+": ");
			vendas[6][i] = scanner.nextInt();
		}
		
		System.out.println("--------------------------------------------");
		for(int i=0; i<4; i++) {//B
			for(int j=0; j<4; j++) {
				vendas[4][i] += vendas[i][j];
			}
			System.out.println("----- Soma do total de produtos vendidos no "+(i+1)+"º Trimestre: "+vendas[4][i]);
		}
		System.out.println("--------------------------------------------");
		for(int i=0; i<4; i++) { //A
			for(int j=0; j<4; j++) {
				vendas[5][i] += vendas[j][i];
			}
			System.out.println("----- Soma do total de "+(produtos[i])+": "+vendas[5][i]);
		}
		//C
		pior = vendas[5][0];
		piorNome = produtos[0];
		for(int i=0; i<4; i++) {
				if(vendas[5][i]>melhor) {
					melhor = vendas[5][i];
					melhorNome = produtos[i];
				}
				if(vendas[5][i]<pior) {
					pior = vendas[5][i];
					piorNome = produtos[i];
				}
		}
		
		System.out.println("--------------------------------------------");
		System.out.println("Melhor linha de produtos: ");
		System.out.println("Melhor Produto: "+melhorNome+" - Quantidade vendida: "+melhor);
		System.out.println("--------------------------------------------");
		System.out.println("Pior linha de produtos: ");
		System.out.println("Pior Produto: "+piorNome+" - Quantidade vendida: "+pior);
		
		//D
		System.out.println("--------------------------------------------");
		System.out.println("Trimestres que atingiram a meta");
		for(int i=0; i<4; i++) {
			if(vendas[6][i]<=vendas[4][i]) {
				System.out.println((i+1)+"º Trimestre");
			}
		}
		
		//E
		System.out.println("--------------------------------------------");
		System.out.println("Por Trimestre melhor linha de produto");
		for(int i=0; i<4; i++) {
			melhorVenda=0;
			melhorVendaNome = produtos[0];
			for(int j=0; j<4; j++) {
				if(vendas[i][j]>melhorVenda) {
					melhorVenda = vendas[i][j];
					melhorVendaNome = produtos[j];
				}
				
				
			}
			System.out.println((i+1)+"º trimestre: "+melhorVendaNome+" - Quantidade: "+melhorVenda);

		}

	}

}
