import java.util.Scanner;

public class Exemplo03Verdadeiro {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int contPar=0, contImpar=0;
		int[] numero = new int[6];
		
		for(int i=0; i<6; i++) {
			System.out.println("Digite um n�mero: ");
			numero[i] = scanner.nextInt();
			
			if(numero[i] % 2 == 0) {
				System.out.println("N�mero Par - "+numero[i]);
				contPar++;
			}else {
				System.out.println("N�mero �mpar - "+numero[i]);
				contImpar++;
			}
			
			
		}
		System.out.println("N�meros pares: "+contPar);
		System.out.println("N�meros impares: "+contImpar);
	}

}
