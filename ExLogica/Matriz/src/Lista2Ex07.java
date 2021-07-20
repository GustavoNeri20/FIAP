
public class Lista2Ex07 {

	public static void main(String[] args) {
		String cidades[] = new String[]{"Campinas, Bauru, Sorocaba, Atibaia, Santos"};
		
		
		
		System.out.println("-------------- Distância entre as cidades --------------");
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("Informe a distância entre a cidade ("+(cidades[i])+") e a cidade ("+cidades[i]+") = ");
			}
		}
		

	}

}
