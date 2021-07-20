import java.util.Scanner;

public class Lista2Ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] loja = new String[] {"Loja A", "Loja B", "Loja C"};
		String[] produto = new String[] {"Prod 1", "Prod 2", "Prod 3"};
		int[][] mes1 = new int[3][3];
		int[][] mes2 = new int[3][3];
		int[][] bimestre = new int[3][4];
		int somaProduto[] = new int[3];
		int somaLoja=0, maiorLoja=0;
		String lojaMaior = null;
		
		//CARREGAR MES1
		System.out.println("-----------------------------------------");
		System.out.println("Vendas no mês 1");
		for(int produtos=0; produtos<3; produtos++) {
			
			for(int lojas=0; lojas<3; lojas++) {
				System.out.print("Digite a venda do produto "+produto[produtos]+" na "+loja[lojas]+":");
				mes1[produtos][lojas] = scanner.nextInt();
			}
		}
		
		//CARREGAR MES2
		System.out.println("-----------------------------------------");
		System.out.println("Vendas no mês 2");
		for(int produtos=0; produtos<3; produtos++) {
			
			for(int lojas=0; lojas<3; lojas++) {
				System.out.print("Digite a venda do produto "+produto[produtos]+" na "+loja[lojas]+":");
				mes2[produtos][lojas] = scanner.nextInt();
			}
		}
			
		//SOMAR
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				bimestre[i][j] = mes1[i][j] + mes2[i][j];
			}
		}
		
		//CARREGAR META DE VENDAS
		System.out.println("-----------------------------------------");
		System.out.println("Vendas de cada produto por loja no bimestre:");
		for(int i=0; i<3; i++) {
			System.out.print("Digite a meta de venda do "+produto[i]+": ");
			bimestre[i][3] = scanner.nextInt();
		}
		
		//MOSTRA O TOTAL DE VENDAS DE CADA LOJA NO BIMESTRE
		System.out.println("-----------------------------------------");
		System.out.println("Vendas de cada loja no bimestre: ");
		for(int lojas=0; lojas<3; lojas++) {
			somaLoja=0;
			for(int produtos=0; produtos<3; produtos++) {
				somaLoja+= bimestre[produtos][lojas];
			}
			System.out.println("Total Loja "+loja[lojas]+": "+somaLoja);
			//DESCOBRIR O MAIOR
			if(somaLoja>maiorLoja) {
				maiorLoja = somaLoja;
				lojaMaior = loja[lojas];
			}
		}
		System.out.println("-----------------------------------------");
		System.out.println("Maior Loja:"+maiorLoja+" nome: "+lojaMaior);
		
		//LOJA COM MAIS VENDAS NO BIMESTRE
		System.out.println("-----------------------------------------");
		System.out.println("Lojas com mais vendas no bimestre: ");
		for(int produtos=0; produtos<3; produtos++) {
			for(int lojas=0; lojas<3; lojas++) {
				somaProduto[produtos] += bimestre[produtos][lojas];
			}
			System.out.println("Produto: "+produto[produtos]+ " - Vendas: "+somaProduto[produtos]);
		}
		//PRODUTOS QUE ATINGIRAM A META
		System.out.println("-----------------------------------------");
		System.out.println("Produtos que atingiram a meta: ");
		for(int i=0; i<3;i++) {
			if(bimestre[i][3]<=somaProduto[i]) {
				System.out.println(produto[i]);
			}
		}
		
		
	}

}
