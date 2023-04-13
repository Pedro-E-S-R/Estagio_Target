

public class questao_4 {

	public static void main(String[] args) {
		double carro = 110;
		double caminhao = 80;
		double distancia = 100;
		double tPedagio = 0.05;
		
		double Camcal = distancia/caminhao;
		tPedagio = (tPedagio * 2)/0.6;
		Camcal = Camcal + tPedagio;
		double resultado = (carro * distancia)/(carro + (distancia/Camcal));
		System.out.printf("%.2f", resultado);
		System.out.println();
		System.out.printf("O CAMINHAO E O CARRO ESTÃO A MESMA DISTANCIA DE "
				+ "RIBEIRAO JA QUE É UM PONTO DE ENCONTRO, O CAMINHÃO "
				+ "ESTA %.2f DE DISTANCIA PARA CHEGAR EM RIBEIRAO"
				+ " PRETO E O CARRO SE DISTANCIOU %.2f DE RIBEIRÃO",resultado,resultado);
		
	}
	
}
