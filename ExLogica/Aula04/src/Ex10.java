import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	DecimalFormat fM = new DecimalFormat("##00.00");
	String resp="sim", parcela=null;
	int contador=0, contItens=0, cp=0;
	double pe=0, somaPe=0, pagamento=0,total=0;
	
	//Estrutura de repetição vendas (1)
	while(resp.equalsIgnoreCase("sim")) {   //resp.equalsIgnoreCase("sim") para comprar o String
		//resp=='sim' resp==("sim") se for comprar com char ou int 
		contItens=0;
		somaPe=0;
		System.out.println((contador+1)+"º Vendas");
		
		//Estrutura de repetição itens da venda (2)
		System.out.println("Digite o preço: ");
		pe = scanner.nextDouble();
		while(pe!=0){
			somaPe+=pe;
			contItens++;
			System.out.println("Digite o preço: ");
			pe= scanner.nextDouble();
			
		}//Fecha Itens(2)
		System.out.println("Valor da Compra: "+fM.format(somaPe));
		System.out.println("Número de Itens Comprados: "+ contItens);
		
		//Estrutura de seleção pagamento (3)
		System.out.println("Digite condição de pagamento: ");
		System.out.println("1-- À vista em dinheiro ou cheque, com 10% de desconto");
		System.out.println("2-- À vista com cartão de crédito, com 5% de desconto");
		System.out.println("3-- Em 2 vezes, preço normal de etiqueta sem juros");
		System.out.println("4-- Em 3 vezes, preço de etiqueta com acréscimo de 10%");
		cp=scanner.nextInt();
		
		//Validação condição de pagamento
		while(cp<1 || cp>4) {
			System.out.println("Digite condição de pagamento corretamente: ");
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
			System.out.println("Total a pagar: "+ pagamento + " "+ parcela+ " o preço total fica: "+ total);
		}
	
		//Serve para para o loop
		System.out.println("Deseja cadastrar nova venda?");
		resp = scanner.next();
		contador++;
		
		
		while(!(resp.equalsIgnoreCase("sim"))&& (!(resp.equalsIgnoreCase("não")))) {
			System.out.println("Deseja cadastrar nova venda Sim/Não");
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
