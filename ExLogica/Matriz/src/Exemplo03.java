import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double media=0, somaNota=0;
		double Notas[][] = new double[10][4];
		
		for(int l=0; l<10; l++) {//1�
			System.out.println("Aluno "+(l+1));
			somaNota=0;
			media =0;
			for(int c=0; c<3; c++) {//2�
				System.out.print("Digite a nota da "+(c+1)+"� Prova: ");
				Notas[l][c] = scanner.nextDouble();
				somaNota+=Notas[l][c];
				
			}//2�
			//OUOUOUOUOUOUOUO
			media += somaNota/3;
			Notas[l][3] = media;

			
		}//1�
		for(int l=0; l<10; l++) {
			System.out.println("A m�dia do aluno "+(l+1)+" �: "+Notas[l][3]); 
		}
		for(int l=0; l<10; l++) { //Primeiro for
			for(int c=0; c<4; c++) { //Segundo for
				System.out.print(Notas[l][c]+"\t");
				
			}
			System.out.println("");
		}
		
		//EUEUEUUEUEUEUEUEUEUEUEUEUUE
/*		for(int l=0; l<10; l++) {
			media=0;
			for(int c=0; c<4; c++) {
				media += Notas[l][c];
			}
			System.out.println("A m�dia do aluno "+(l+1)+" �: "+media/3); 
		} */
	}

}
