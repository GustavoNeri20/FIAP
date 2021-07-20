import java.util.Scanner;

public class Refazer08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String prod[] = new String[]{"prod1", "prod2", "prod3"};
		String loja[] = new String[] {"lojaA", "lojaB", "lojaC"};
		int mes1[][] = new int[3][3];
		int mes2[][] = new int[3][3];
		int bimestre[][] = new int[3][4];
		
		System.out.println("Vendas no mês 1");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("Digite a venda do produto "+prod[i]+" na loja "+loja[j]+": ");
				mes1[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Vendas no mês 2");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("Digite a venda do produto "+prod[i]+" na loja "+loja[j]+": ");
				mes2[i][j] = scanner.nextInt();
				bimestre[i][j] = mes1[i][j] + mes2[i][j];
			}
		}
		for(int i=0; i<3; i++) {
			System.out.print("Digite a meta de venda do produto "+prod[i]+": ");
			bimestre[i][3] = scanner.nextInt();
		}
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				bimestre[i][j] = mes1[i][j] + mes2[i][j];
			}
			System.out.println(bimestre[i][2]);
			System.out.println("Loja: "+loja[i]+" - Vendas: ");
		}
		

	}

}
