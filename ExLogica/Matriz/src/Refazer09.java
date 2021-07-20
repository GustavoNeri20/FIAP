import java.util.Scanner;

public class Refazer09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String produtos[] = new String[] {"Camisa", "Blusa", "Calça", "Vestido", "Meia"};
		int transporte[] = new int[5];
		int precos[][] = new int[5][4];
		double imposto[][] = new double[5][4];
		
		for(int i=0; i<5; i++) {
			System.out.print("Informe o custo de transporte do produto "+(i+1)+": ");
			transporte[i] = scanner.nextInt();
		}
		System.out.println("--------------------------------------------");
		for(int i=0; i<5; i++) {
			System.out.println("Informe o preço do produto "+produtos[i]);
			for(int j=0; j<4; j++) {
				System.out.print("---- Preço do produto na loja "+(j+1)+": ");
				precos[i][j] = scanner.nextInt();
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				if(precos[i][j]<=50) {
					imposto[i][j] = precos[i][j] * 0.05;
				}else if(precos[i][j]<=100) {
					imposto[i][j] = precos[i][j] * 0.10;
				}else if(precos[i][j]<100) {
					imposto[i][j] = precos[i][j] * 0.20;
				}
			}
		}
		System.out.println("--------------------------------------------");
		for(int i=0; i<5; i++) {
			System.out.println("Nome do produto: "+produtos[i]+" - Custo de transporte: "+transporte[i]+"R$");
			for(int j=0; j<4; j++) {
				System.out.println("---- Loja: "+(j+1)+" ----");
				System.out.println("---- Imposto: R$"+imposto[i][j]);
				System.out.println("---- Preço: R$"+precos[i][j]);
				System.out.println("---- Preço Final: R$"+(precos[i][j]+imposto[i][j]+transporte[i]));
			}
		}
		
		
		
		
		

	}

}
