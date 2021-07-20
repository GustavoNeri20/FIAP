import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[] arrayTimes = new String[5];
		
		//Captar vetor
		for(int i=0; i<5; i++) {
			System.out.println("Digite o "+(i+1)+"º Time:");
			arrayTimes[i] = entrada.next();
		}
		//Exibir times
		for(int i=0; i<5; i++) {
			System.out.println("Time "+(i+1)+" :"+arrayTimes[i]);
		}
		
	}

}
