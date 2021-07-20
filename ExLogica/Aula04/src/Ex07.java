import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade=0, idadeSuperior=0, idadeMedia=0, corAzul=0, ruiva=0, pessoasAnalisadas=0;
		double peso=0, pesoInferior=0, altura=0, alturaInferior=0, mediaIdade=0, mediaIdadeTotal=0, porcentAzul=0, contAzul=0;
		char corOlho, corCabelo;
		
		for(int contador=0;contador<3;contador++) {
			pessoasAnalisadas++;
			System.out.println("Digite a idade: ");
			idade = scanner.nextInt();
			System.out.println("Digite o peso: ");
			peso = scanner.nextDouble();
			System.out.println("Digite a altura: ");
			altura = scanner.nextDouble();
			System.out.println("Digite a cor dos olhos A-Azul, P-Preto, V-Verde e C-Castanho");
			corOlho = scanner.next().charAt(0);
			corOlho = Character.toUpperCase(corOlho);
			while(corOlho != 'A' && corOlho != 'P' && corOlho != 'V' && corOlho != 'C') {
				System.out.println("Digite corretamente: ");
				corOlho=scanner.next().charAt(0);
				corOlho = Character.toUpperCase(corOlho);
			}
			System.out.println("Digite a cor do cabelo P-Preto, C-Castanho, L-Louro e R-Ruivo");
			corCabelo = scanner.next().charAt(0);
			corCabelo = Character.toUpperCase(corCabelo);
			while(corCabelo != 'P' && corCabelo != 'C' && corCabelo != 'L' && corCabelo != 'R') {
				System.out.println("Digite corretamente: ");
				corCabelo=scanner.next().charAt(0);
				corCabelo = Character.toUpperCase(corCabelo);
			}
			//A
			if(idade>50 && peso<60) {
				idadeSuperior++;
				pesoInferior++;
			}
	
			//B
			if(altura<1.50) {
				alturaInferior++;
				mediaIdade = mediaIdade+idade;
			}
			//C
			if(corOlho == 'A') {
				corAzul++;
			}
			//D
			if(corCabelo =='R' && corOlho != 'A') {
				ruiva++;
			}
			
		}
		mediaIdadeTotal=mediaIdade/alturaInferior;
//		porcentAzul=corAzul/pessoasAnalisadas;
		contAzul= corAzul/pessoasAnalisadas*100;
		System.out.println("Quantidade de pessoas com idade supeior a 50 anos e peso inferior a 60 quilos: "+ idadeSuperior);
		System.out.println("Média das idades das pessoas com altura inferior a 1.50: "+ mediaIdadeTotal);
		System.out.println("A porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas: "+ contAzul);
		System.out.println("A quantidade de pessoas ruivas e que não possuem olhos azuis: "+ruiva);
		
		
	}
}
