import java.text.DecimalFormat;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatPorc = new DecimalFormat("##00.00");
		
		int c=1, voto=0, candidato1=0, candidato2=0, candidato3=0, candidato4=0, nulo=0, branco=0, cont=0;
		double porcNulo=0, porcBranco=0;
		
		while(c != 0) {
			cont++;
			System.out.println("Digite o seu voto:");
			voto = entrada.nextInt();
			System.out.println("Deseja continuar? 1-Sim 2-Não");
			c = entrada.nextInt();
			if (c!=1) {
				System.exit(0);
			}
			switch (voto){
			case 1:
			candidato1++;
			break;
			case 2:
			candidato2++;
			case 3:
			candidato3++;
			break;
			case 4:
			candidato4++;
			break;
			case 5:
			nulo++;
			break;
			case 6:
			branco++;
			break;
			}
		}
		porcNulo=(double) (nulo/cont)*100;
		porcBranco=(double) (branco/cont)*100;
		System.out.println("O candidato 1 recebeu "+ candidato1+ "votos");
		System.out.println("O candidato 2 recebeu "+ candidato2+ "votos");
		System.out.println("O candidato 3 recebeu "+ candidato3+ "votos");
		System.out.println("O candidato 4 recebeu "+ candidato4+ "votos");
		System.out.println("Total de votos nulos: "+ nulo);
		System.out.println("Total de votos em branco: "+ branco);
		System.out.println("Porcentagem em votos nulos: "+porcNulo+"%");
		System.out.println("Porcentagem em votos em branco: "+porcBranco+"%");
		
	}
 
}
