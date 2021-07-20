import java.util.Scanner;

public class Lista1Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] temperatura = new int[7];
		double tempTotal=0, tempMedia=0;
		int quantDias=0;
		
		for(int i=0; i<7; i++) {
			System.out.println("Digite a temperadura do "+(i+1)+"º dia: ");
			temperatura[i] = scanner.nextInt();
			tempTotal=tempTotal+temperatura[i];
		}
		tempMedia=tempTotal/7;
		System.out.println("A média da temperatura é: "+tempMedia);
		
		for(int i=0; i<7; i++) {
			if(temperatura[i]>tempMedia) {
				quantDias++;
			}
		}
		
		System.out.println("A quantidade de dias com temperatura acima da média: "+quantDias);

	}

}
