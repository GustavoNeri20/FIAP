import java.util.Scanner;

public class Lista2Ex06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrayPrimeira[][] = new int[5][3];
		int arraySegunda[][] = new int[5][3];
		int arrayMedia[][] = new int[5][3];
		
		
		System.out.println("----------- 1º Semestre -----------");
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("Digite o número de inscritos no 1ºSemestre do curso "+(i+1)+" na unidade "+(j+1)+": ");
				arrayPrimeira[i][j] = scanner.nextInt();
				
				
			}
		}
		System.out.println("----------- 2º Semestre -----------");
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("Digite o número de inscritos no 2ºSemestre do curso "+(i+1)+" na unidade "+(j+1)+": ");
				arrayPrimeira[i][j] = scanner.nextInt();
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				arrayMedia[i][j] = arrayPrimeira[i][j] + arraySegunda[i][j];
			}
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Quantidade de Alunos por Curso e Unidade no ano");
		System.out.println("---------------------------------------------------");
		for(int i=0; i<5; i++) {
			System.out.println("Curso "+(i+1));
			for(int j=0; j<3; j++) {
				System.out.println("Quantidade de matrículas unidade ");
				arrayMedia[i][j] = arrayPrimeira[i][j] + arraySegunda[i][j];
			}
		}
		
	}

}
