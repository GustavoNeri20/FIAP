import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double valLocacao=0, valTotalLocacao=0, desconto=0;
		int codCliente=0, codDvd=0, contador=1, contLocacao=0, quantDvd=0;
		char tipoDvd;
		
		while(contador>0) {//1ª
			
			System.out.println((contLocacao+1)+"ª Locação");
			contLocacao++;
			System.out.println("Digite o código do cliente:");
			codCliente= scanner.nextInt();
			
			System.out.println("Digite o código do DVD (1 até 20): ");
			codDvd= scanner.nextInt();
			while(codDvd<1 || codDvd>20) {
				System.out.println("Digite o código do DVD (1 até 20) corretamente: ");
				codDvd=scanner.nextInt();
			}
			System.out.println("Digite o tipo de DVD (A, C ou D): ");
			tipoDvd= scanner.next().charAt(0);
			tipoDvd = Character.toUpperCase(tipoDvd);
			while((tipoDvd!='A')&&(tipoDvd!='C')&&(tipoDvd!='D')) {
				System.out.println("Digite o tipo do DVD (A, C ou D) corretamente: ");
				tipoDvd=scanner.next().charAt(0);
			}
			
			if (codDvd<=10) {//Inicio if
				switch(tipoDvd) {
				case 'A':
					valLocacao= 8.00;
					quantDvd++;
					valTotalLocacao+= valLocacao;
					break;
				case 'C':
					valLocacao= 12.00;
					quantDvd++;
					valTotalLocacao+= valLocacao;
					break;
				case 'D':
					valLocacao= 10.00;
					quantDvd++;
					valTotalLocacao+= valLocacao;
					break;
				}
				codDvd=0;
			}else if(codDvd>=11) {
				switch(tipoDvd) {
				case 'A':
					valLocacao= 5.00;
					quantDvd++;
					valTotalLocacao+= valLocacao;
					break;
				case 'C':
					valLocacao= 7.00;
					quantDvd++;
					valTotalLocacao+= valLocacao;
					break;
				case 'D':
					valLocacao= 9.00;
					quantDvd++;
					valTotalLocacao+= valLocacao;
					break;
				}
				codDvd=0;
			}//Final if
			
			
			//Promoção Locação
			while(quantDvd>=4) {
				desconto+= (valTotalLocacao*0.05);
				quantDvd=0;
			}
			
			
			
			System.out.println(valLocacao);
			System.out.println(quantDvd);
			System.out.println(desconto);

			
			System.out.println("Deseja repetir a operação? 1- Sim 0- Não");
			contador= scanner.nextInt();
			
		}//1ª
		System.out.println("Número de Locações realizadas: "+ contador);
		System.out.println("Valor total das locações: "+ valTotalLocacao);
		System.out.println(desconto);
		
	}

	

}
