import java.util.Scanner;

public class Lista2Ex09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int transporte[] = new int[] {10,15,20,10,5};
		String produtos[] = new String[] {"Camisa", "Blusa", "Calça", "Vestido", "Meia"};
		int lojas[][] = new int[5][4];
		double imposto[][] = new double[5][4];
		double precoFinal=0;
		
		for(int i=0; i<5; i++) {
			System.out.println("Informe o preço do produto: "+produtos[i]);
			for(int j=0; j<4; j++) {
				System.out.print("---- Preço do produto na loja "+(j+1)+": ");
				lojas[i][j] = scanner.nextInt();
				if(lojas[i][j]<= 50) {
					imposto[i][j] = lojas[i][j]*0.05;
				}else if(lojas[i][j]<=100) {
					imposto[i][j] = lojas[i][j]*0.10;
				}else {
					imposto[i][j] = lojas[i][j]*0.20;
				}
			}
			System.out.println(lojas[2][0]);
		}
		System.out.println("----------------------------------------------------");
		for(int i=0; i<5; i++) {
			System.out.println("Nome do produto: "+produtos[i]+" - Custo do transporte R$"+transporte[i]);
			for(int j=4; j<4; j++) {
				precoFinal = lojas[i][j] + imposto[i][j] +transporte[i];
				System.out.println("----- Loja: "+(j+1)+" -----");
				System.out.println("----- Imposto: R$"+imposto[i][j]);
				System.out.println("----- Preço: R$"+lojas[i][j]);
				System.out.println("----- Preço Final: R$"+precoFinal);
			}
			
		}
		
		
	}

}
