import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formata = new DecimalFormat ("#0.00");
		
		int contador=0, matricula=0, numeroAula=0, contRe=0, contAp=0, contRepF=0;
		double nota=0, somaNota=0, media=0;
		String situacao;
		
		//repeti��o alunos
		while(contador<3) {
			numeroAula=0;
			contador++;
			System.out.println(contador+"� Aluno");
			System.out.print("Digite o n�mero de matr�cula: ");
			matricula=entrada.nextInt();
			
			//repeticao notas
			
			for(int c=0;c<3;c++) {
				
				System.out.print("Digite "+(c+1)+ " nota: ");
				nota=entrada.nextDouble();
				somaNota+= nota;
			}
			media=somaNota/3;
			System.out.println("N�mero de aulas frequentadas: ");
			numeroAula=entrada.nextInt();
			
			//validacao de numero
			while(numeroAula>60) {
				System.out.println("Digite corretamente: ");
				numeroAula=entrada.nextInt();
			}
			
			//Alunos aprovados com m�dia e frequ�ncia
			//&& significa E
			if(media>5 && numeroAula>40) {
				situacao="Aprovado";
				contAp++;
			}else {
				situacao="Reprovado";
				contRe++;
			}
			
			//Reprovado por falta
			if(numeroAula<40) {
				contRepF++;
			}
			//exibir resulta ao aluno
			System.out.println("Matr�cula: "+matricula+ " - M�dia: "
					+ formata.format(media)+ " - Situa��o: "+ situacao);
		
	}
		System.out.println("__________________________________________________");
		System.out.println("N�mero de Aprovados: "+contAp);
		System.out.println("N�mero de Reprovados: "+contRe);
		System.out.println("N�mero de Reprovados por Falta: "+contRepF);
	}
}
