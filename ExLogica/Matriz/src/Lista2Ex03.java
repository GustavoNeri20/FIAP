import java.util.Scanner;

public class Lista2Ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numProdutoC=0, numLojaB=0, numProdutoB=0, numLojaC=0;
		double produtos[][] = new double[12][5];
		String lojas[] = new String[] {"LojaA","LojaB","LojaC","LojaD","LojaE"};
		String nomeProduto[] = new String[] {"A","B","C","D","E","F","G","H","I","J","K","L"};
		double menor=0, maior=0;
		
		for(int i=0; i<12; i++) {//1
			
			System.out.println("------------------------------- Produto: "+nomeProduto[i]+" -------------------------------");
			for(int p=0; p<5; p++) {
				System.out.println("Informe o preço na "+lojas[p]);
				// produtos[i][p] = scanner.nextDouble();
				produtos[i][p] = (double) (Math.random()*100);
				
				if(i==0 && p==0) {
					numProdutoC=i;
					numLojaC=p;
					maior=produtos[i][p];
					
					numProdutoB=i;
					numLojaB=p;
					menor=produtos[i][p];
					
				}else {
					if(produtos[i][p]>maior) {
						numProdutoC=i;
						numLojaC=p;
						maior=produtos[i][p];
					}else {
						numProdutoB=i;
						numLojaB=p;
						menor=produtos[i][p];
					}
				}
				
			}
		}//1
		System.out.println("");
		System.out.println("-------------------------------");
		System.out.println("");
		
		System.out.println(" Produto mais barato: "+produtos[numProdutoB]);
		System.out.println(" Loja: ");
		System.out.println(" Preço: "+menor);

		System.out.println(" Produto mais caro: "+ produtos[numProdutoC]);
		System.out.println(" Loja: ");
		System.out.println(" Preço: "+maior);
	}

}
