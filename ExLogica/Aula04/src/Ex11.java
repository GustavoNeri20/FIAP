import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		int num=0, numMin=0, numMax=0;
		
		System.out.println("Digite um número: ");
		num = scanner.nextInt();
		numMin=num; //numMin recebe num
		numMax=num; //numMax recebe num
		
		
		for(int c=0; c<9; c++) { //enquanto c for menor que 9, a cada rodada do programa aumenta 1
			num = scanner.nextInt(); //lê o num
			
			if (num < numMin) { //se num for menor que numMin
				numMin = num; //numMin recebe num
			} else if (num > numMax) { //se num for maior que numMax
				numMax = num; //numMax recebe num
			}
		}
		System.out.println("Maior: "+numMax);
		System.out.println("Menor: "+ numMin);
		
		
	}
}
