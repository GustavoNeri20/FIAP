import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] arrayNomes = new String[3];
		int[] arrayIdades = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("Digite o nome do "+(i+1)+"º Atleta:");
			arrayNomes[i] = scanner.next();
			System.out.println("Digite a idade do "+(i+1)+"º Atleta:");
			arrayIdades[i] = scanner.nextInt();
			
		}
		for(int i=0; i<3; i++) {
			if(arrayIdades[i]>21) {
				System.out.println((i+1)+"º Atleta: "+arrayNomes[i]+"/ Idade: "+arrayIdades[i]);
			}
	}

	}}
