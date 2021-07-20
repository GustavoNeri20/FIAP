import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] par= new int[6];
		int[] arrayNum = new int[6];
		
		for(int i=0; i<6; i++) {
			System.out.println("Digite um número: ");
			arrayNum[i] = scanner.nextInt();
			par[i] = (arrayNum[i] % 2);
			
			
			
		}
		
		for(int i=0; i<6; i++) {
			if(par[i]==0) {
				System.out.println(arrayNum[i]);
			}
			
			
		}
		
	}

}
