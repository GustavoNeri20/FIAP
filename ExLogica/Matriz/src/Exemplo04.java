import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int Produto[][] = new int[5][2];
		double Preco[][] = new double[5][2];
		
		for(int i=0; i<5; i++) {
			System.out.print("Digite o c�digo do produto: ");
			Produto[i][0] = scanner.nextInt();
			System.out.print("Digite o pre�o: ");
			Preco[i][0] = scanner.nextDouble();
			System.out.print("Digite a quantidade do produto: ");
			Produto[i][1] = scanner.nextInt();
		}
		for(int i=0; i<5; i++) {
			Preco[i][1] = Produto[i][1] * Preco[i][0];
			System.out.print("C�digo: "+Produto[i][0]+"\t");
			System.out.print("Pre�o: "+Preco[i][0]+"\t");
			System.out.print("Quantidade: "+Produto[i][1]+"\t");
			System.out.println("Total: "+Preco[i][1]+"\t");
			
		}
		
		
		
	}

}
