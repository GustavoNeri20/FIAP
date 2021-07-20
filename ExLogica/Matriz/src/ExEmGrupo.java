import java.util.Scanner;

public class ExEmGrupo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrayProdutos[][] = new int[5][3];
		int maiorEstoq=0, estoque=0, maiorEstoque2=0;
		
		for(int i=0; i<4; i++) {//PRIMEIRA
			
			System.out.println("--- Estoque no armazém ("+(i+1)+(") ---"));
			//A
			for(int j=0; j<3; j++) {
				System.out.print("--- Informe a quantidade em estoque do produto ("+(j+1)+("): "));
				arrayProdutos[i][j] = scanner.nextInt();			
			}//A				
		}//PRIMEIRA
		
		//D
		System.out.println("---------- CUSTO DE CADA PRODUTO ---------");
		for(int j=0; j<3; j++) {
			System.out.print("Informe o custo do Produto ("+(j+1)+"): ");
			arrayProdutos[4][j] = scanner.nextInt();
		}//D
		
		System.out.println("---------- QUANTIDADE DE ITENS EM CADA ARMAZÉM ---------");
		for(int i=0; i<4; i++) {
			estoque=0;
			for(int j=0; j<3; j++) {
				estoque += arrayProdutos[i][j];
			}
			System.out.println("--- Estoque no Armazém ("+(i+1)+"): "+estoque);	
		}
		
		
		
		System.out.println("---------- ARMAZÉM COM MAIOR ESTOQUE DO PRODUTO 2 ---------");
			for(int j=0; j<3; j++) {	
			
				if(arrayProdutos[j][1]>maiorEstoq) {
					maiorEstoq = arrayProdutos[j][1];	
					maiorEstoque2 = j+1;
				}
			}
			System.out.println("--- Armazém ("+(maiorEstoque2)+") - Quantidade em estoque: ");
}
}
