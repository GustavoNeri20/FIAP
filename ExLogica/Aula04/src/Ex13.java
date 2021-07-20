import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nome="não foi registrado", nomeMin, nomeMax;
		double precoComputador=0.0, valorCompra=0.0, desconto=0.0, pagAVista=0.0, pagAPrazo=0.0,valorMin=0, valorMax=0, pagAPrazoParcela=0.0;
		int tipoComputador=0, quantidade=0, comprarMais=1, quantComprada=0, parcela=0, contTotal=0, valorCont=1;
		char  novaVenda='S', cp;
		String modeloComputador;
		
		valorMin= valorCont;
		valorMax= valorCont;
		nomeMin= nome;
		nomeMax= nome;
		while(novaVenda=='S') { //PRIMEIRA
			quantidade=0;
			//1
			System.out.println("Digite o nome do cliente: ");
			nome = scanner.next();
			
			
			//4
			comprarMais=1;
			while(comprarMais==1) {//While 0
				//2
				System.out.println("Digite o tipo de computador: 1- Desktop 2- Notebook");
				tipoComputador = scanner.nextInt();
				while((tipoComputador!=1)&&(tipoComputador!=2)) {
					System.out.println("Digite o tipo de computador: 1- Desktop 2- Notebook (Digite Corretamente)");
					tipoComputador = scanner.nextInt();
				}
				
				//3
				System.out.println("Digite o modelo do computador: I3-- Processador i3 I5-- Processador i5 I7-- Processador i7");
				modeloComputador = scanner.next().toUpperCase();
				while((!modeloComputador.equalsIgnoreCase("I3"))&&(!modeloComputador.equalsIgnoreCase("I5")&&(!modeloComputador.equalsIgnoreCase("I7")))) {
					System.out.println("Digite o modelo do computador: I3-- Processador I3 | I5-- Processador I5 | I7-- Processador I7(Digite Corretamente)");
					modeloComputador = scanner.next();
				}	
			System.out.println("Digite a quantidade de computadores: ");
			quantidade = scanner.nextInt();
			quantComprada += quantidade;
			
			if(tipoComputador==1) {
				switch (modeloComputador) {
				case "I3":
					precoComputador = 1801.00 * quantidade;
					break;
				case "I5":
					precoComputador = 2429.00 * quantidade;
					break;
				case "I7":
					precoComputador = 3150.00 * quantidade;
					break;
				}
			}else {
				switch (modeloComputador) {
				case "I3":
					precoComputador = 1899.00 * quantidade;
					break;
				case "I5":
					precoComputador = 2799.00 * quantidade;
					break;
				case "I7":
					precoComputador = 3199.00 * quantidade;
					break;
			}
			}
			
			valorCompra += precoComputador;
			
			
			System.out.println("Deseja comprar mais? 1- Sim 0- Não");
			comprarMais = scanner.nextInt();
			
			
			while((comprarMais!=1)&&(comprarMais!=0)) {
				comprarMais = scanner.nextInt();
			}
			}//Fecha While 0
			
			//5
			System.out.println("Valor Total: "+ valorCompra);
			System.out.println("Quantidade de itens: "+ quantComprada);
			
			//6
			desconto= 0.0;
			System.out.println("Digite a forma de pagamento: V- À vista  P- À prazo");
			cp = scanner.next().toUpperCase().charAt(0);
			while((cp!='V')&&(cp!='P')) {
				System.out.println("Digite uma forma de pagamento válida: V- À vista  P- À prazo");
				cp= scanner.next().toUpperCase().charAt(0);
			}
			contTotal=0;
			pagAPrazo=0.0;
			pagAVista=0.0;
			if((cp=='V')&&(quantComprada>=2)) {
				desconto= 0.2;
				pagAVista= valorCompra-(valorCompra*0.2);
				contTotal= 1;
			}else if((cp=='V')||(quantComprada<2)) {
				desconto= 0.1;
				pagAVista= valorCompra-(valorCompra*0.1);
				contTotal= 1;
			}else if(cp=='P'){
				desconto= 1.1;
				System.out.println("Digite a quantidade de parcelas: ");
				parcela= scanner.nextInt();
				pagAPrazo= valorCompra*desconto;
				pagAPrazoParcela= pagAPrazo/parcela;
				contTotal= 2;
			}
			//7
			if(cp=='V') {
				System.out.println("A forma de pagamento escolhida foi à vista!");
			}else {
				System.out.println("A forma de pagamento escolhida foi à prazo!");
			}
			if(cp=='V') {
				System.out.println("Valor final da compra: "+pagAVista);
			}else if(cp=='P'){
				System.out.println("Valor de cada parcela: "+pagAPrazoParcela);
				System.out.println("Valor final da compra: "+pagAPrazo);
			}
			//9
			System.out.println("clever");
			
			quantComprada=0;
			valorCompra=0;
			
			if(valorMax == 0 && valorMin == 0) {
				valorMax = valorCompra;
				valorMin = valorCompra;
			} else {
				if (valorCompra > valorMax) {
					valorMax = valorCompra;
					
				}
				if(valorCompra < valorMin) {
					valorMin = valorCompra;
				}
			}
			System.out.println("Locacao maior: "+ valorMax);
			System.out.println("Locacao menor: "+ valorMin);
			//8
			System.out.println("Deseja Cadastrar nova venda? S- Sim N- Não");
			novaVenda= scanner.next().toUpperCase().charAt(0);
			while((novaVenda!='S')&&(novaVenda!='N')) {
				System.out.println("Deseja Cadastrar nova venda? S- Sim N- Não(Digite Corretamente)");
				novaVenda=scanner.next().toUpperCase().charAt(0);
			}
			
			
		}//PRIMEIRA
		
		
		
	}

	}

