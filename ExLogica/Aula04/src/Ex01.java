import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade=0, tot1=0, tot2=0, tot3=0, tot4=0, tot5=0;
		
		
		for(int contador=0;contador<5;contador++) {
			System.out.println("Digite a idade");
			idade=scanner.nextInt();
		
		if (idade<15) {
			tot1++;
		}else if(idade>=16 && idade<=30){
			tot2++;
		}else if(idade>=31 && idade<=45) {
			tot3++;
		}else if(idade>=45 && idade<=60) {
			tot4++;
		}else {
			tot5++;
		}
			
		}
		double porcent=(tot1*100)/5;
		System.out.println("1ª Faixa Etária: "+ tot1);
		System.out.println("2ª Faixa Etária: "+ tot2);
		System.out.println("3ª Faixa Etária: "+ tot3);
		System.out.println("4ª Faixa Etária: "+ tot4);
		System.out.println("5ª Faixa Etária: "+ tot5);
		
		System.out.println("A porcentagem da 1ª Faixa é: "+ porcent+"%");
			
		
	}
}
