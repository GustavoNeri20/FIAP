import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	DecimalFormat fM = new DecimalFormat("##00.00");
	String resp="sim", parcela=null;
	int contador=0, contItens=0, cp=0;
	double pe=0, somaPe=0, pagamento=0,total=0;
	
	//Estrutura de repeti��o vendas (1)
	while(resp.equalsIgnoreCase("sim")) {   //resp.equalsIgnoreCase("sim") para comprar o String
		//resp=='sim' resp==("sim") se for comprar com char ou int 
		contItens=0;
		somaPe=0;
		System.out.println((contador+1)+"� Vendas");
		
		//Estrutura de repeti��o itens da venda (2)
		System.out.println("Digite o pre�o: ");
		pe = scanner.nextDouble();
		while(pe!=0){
			somaPe+=pe;
			contItens++;
			System.out.println("Digite o pre�o: ");
			pe= scanner.nextDouble();
			
		}//Fecha Itens(2)
		System.out.println("Valor da Compra: "+fM.format(somaPe));
		System.out.println("N�mero de Itens Comprados: "+ contItens);
		
		//Estrutura de sele��o pagamento (3)
		System.out.println("Digite condi��o de pagamento: ");
		System.out.println("1-- � vista em dinheiro ou cheque, com 10% de desconto");
		System.out.println("2-- � vista com cart�o de cr�dito, com 5% de desconto");
		System.out.println("3-- Em 2 vezes, pre�o normal de etiqueta sem juros");
		System.out.println("4-- Em 3 vezes, pre�o de etiqueta com acr�scimo de 10%");
		cp=scanner.nextInt();
		
		//Valida��o condi��o de pagamento
		while(cp<1 || cp>4) {
			System.out.println("Digite condi��o de pagamento corretamente: ");
			cp=scanner.nextInt();
		}
		
		
		switch(cp) {
		case 1:
			pagamento=somaPe*0.90;
			parcela = "Sem parcela";
			break;
		case 2:
			pagamento=somaPe*0.95;
			parcela = "Sem parcela";
			break;
		case 3:
			pagamento=somaPe/2;
			parcela = "Com 2 parcelas";
			total = pagamento*2;
			break;
		case 4:
			pagamento=(somaPe*1.10)/3;
			parcela = "Com 3 parcelas";
			total = pagamento*3;
			break;
		}
		if(cp == 1 || cp == 2) {
			System.out.println("Total a pagar: "+ pagamento + " "+ parcela);
		}else if(cp == 3 || cp == 4) {
			System.out.println("Total a pagar: "+ pagamento + " "+ parcela+ " o pre�o total fica: "+ total);
		}
	
		//Serve para para o loop
		System.out.println("Deseja cadastrar nova venda?");
		resp = scanner.next();
		contador++;
		
		
		while(!(resp.equalsIgnoreCase("sim"))&& (!(resp.equalsIgnoreCase("n�o")))) {
			System.out.println("Deseja cadastrar nova venda Sim/N�o");
			resp = scanner.next();
		}
		
		//Serve para digitar corretamente
//		while(numeroAula>60) {
//			System.out.println("Digite corretamente: ");
//			numeroAula=entrada.nextInt();
//		}
		
	}//Fecha vendas (1)
	
	
	
	}
	
	
	
}
