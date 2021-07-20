import java.util.Scanner;

public class Lista2Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String produtos[] = new String[] {"AA","BB","CC","DD"};
		String loja[] = new String[] {"A","B","C","D","E","F","G","H"};
		double arrayPrecos[][] = new double[4][8];
		
		for(int i=0; i<4; i++) {//1
			
			System.out.println("----------------------------- Preços do Produto "+produtos[i]+" Por Loja -----------------------------");
			for(int j=0; j<8; j++) {
				System.out.println("Digite o preço da loja "+loja[j]);
				arrayPrecos[i][j] = (double) (Math.random()*190);
				
			}
			
			
		}//1
		System.out.println("----------------------------- Produtos que custam menos de R$120,00 -----------------------------");
		
		for(int i=0; i<4; i++) {
			System.out.println(" ---- Produto: "+produtos[i]);
			for(int j=0; j<8; j++) {
				
				if(arrayPrecos[i][j]>120) {
					System.out.println(" ---- Loja: "+loja[j]+
							" Preço: "+arrayPrecos[i][j]);
					
				}
			}
			
			
		}
		

	}

}
