import java.util.Scanner;

public class ExercicioDeCasa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeros[][] = new int[4][5];
		
		for(int i=0; i < 4; i++) {
			System.out.print("Digite o código do "+(i+1)+"º cliente: ");
			numeros[i][0] = scanner.nextInt();
			
			System.out.print("Digite a quantidade de milhagem: ");
			numeros[i][1] = scanner.nextInt();
			
			System.out.println("Digite a categoria: ");
			numeros[i][2] = scanner.nextInt();
			
			while((numeros[i][2]!=1)&&(numeros[i][2]!=2)&&(numeros[i][2]!=3)) {
				System.out.println("Digite a categoria: ");
				numeros[i][2] = scanner.nextInt();
			}
			
			if(numeros[i][2]==1) {
				numeros[i][3] = 10000;
			}else {
				numeros[i][3] = 5000;
			}
			
			numeros[i][4] = numeros[i][1] + numeros[i][3];
			
			
			
		}
		for(int i=0; i < 4; i++) {
			System.out.println("Código do cliente: "+ numeros[i][0]+
					"\t Quantidade de milhagem: "+ numeros[i][1]+
					"\t Categoria: "+numeros[i][2]+
					"\t Bônus: "+numeros[i][3]+
					"\t Milhagem Atual: "+numeros[i][4]);
			
			
		}
		
		
		
	}

}
