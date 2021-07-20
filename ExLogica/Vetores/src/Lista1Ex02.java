import java.util.Scanner;

public class Lista1Ex02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int salario=780, quantTotalVendida=0;
		double salarioTotal=0, valorTotalVendas=0, acrescentar=0,  objetoMaisVendido=0, valorMaisVendido=0;
		double[] valorUnit = new double[4];
		int[] quantVendida = new int[4];
		double[] valorTotalUni = new double[4];
		
		for(int i=0; i<4; i++) {
			System.out.println("Digite o valor do produto: ");
			valorUnit[i] = scanner.nextDouble();
			System.out.println("Digite a quantidade vendida: ");
			quantVendida[i] = scanner.nextInt();
			
			quantTotalVendida = quantTotalVendida + quantVendida[i];
			valorTotalUni[i] = valorUnit[i] * quantVendida[i];
			valorTotalVendas= valorTotalVendas+ valorTotalUni[i];
			
		}
		for(int i=0; i<4; i++) {
			System.out.println("--------------------------------"+(i+1)+"º PRODUTO--------------------------------");
			System.out.println("Quantidade vendida do "+(i+1)+"º produto: "+quantVendida[i]+"  Valor unitário do "+(i+1)+"º produto: "+valorUnit[i]+"  Valor total do "+(i+1)+"º produto: "+valorTotalUni[i]);
			}
		System.out.println("Valor Total: "+valorTotalVendas);
		acrescentar = valorTotalVendas * 0.05;
		salarioTotal = salario + acrescentar;
		System.out.println("Valor da comissao: "+acrescentar);
		
		for(int i=0; i<4; i++) {
			if(quantVendida[i]>(quantVendida[i])-1){
				objetoMaisVendido = quantVendida[i];
				valorMaisVendido = valorUnit[i];
			}
		}
		System.out.println("O objeto mais vendido é o: "+objetoMaisVendido+"º");
		System.out.println("Valor do objeto mais vendido: "+valorMaisVendido);
	}
	
}
