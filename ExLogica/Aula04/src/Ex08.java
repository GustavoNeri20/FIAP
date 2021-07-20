import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat formata = new DecimalFormat ("#0.00");
		
		double total=0, juros=0, valParc=0, valInicial=0, valJuros=0;
		int numParc=0;
		
		System.out.println("Digite o valor da dívida");
		valInicial=scanner.nextDouble();
		
		numParc=1;
		total=valInicial;
		valParc=valInicial;
		
		System.out.println("Total: "+ total+ " Juros: "+ 
		juros + " Número de parcelas: "+numParc+
		" Valor da Parcela: "+ valParc);
//		Atualizar Variáveis
		juros+= 10;
		numParc=3;

		
		//Repetição para segunda linha da tabela
		for(int c=0; c<5; c++) {
			valJuros=(valInicial*juros)/100;
			total=valInicial+valJuros;
			valParc=total/numParc;
			
			numParc= numParc+3;
			juros= juros+5;
			System.out.println("Total: "+ total+ " Juros: "+ 
					juros + " Número de parcelas: "+numParc+
					" Valor da Parcela: "+ formata.format(valParc));
		}
	}
}
