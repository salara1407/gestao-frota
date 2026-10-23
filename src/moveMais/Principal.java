package moveMais;

public class Principal {

	public static void main(String[] args) {

		Gestaofrota gt = new Gestaofrota();
		
		System.out.println(Veiculo.getTotalVeiculos());
		
		Carro carro = new Carro("OUS2830", "Dolphin", "BYD", 15, CategoriasVeiculos.CARRO,
				EstadoVeiculo.DISPONIVEL);
		Carro carro1 = new Carro("ABC132", "500", "Fiat", 20, CategoriasVeiculos.CARRO,
				EstadoVeiculo.EM_MANUTENCAO);
		Caminhao caminhao = new Caminhao("ZAZ987", "F4000", "Ford", 900, CategoriasVeiculos.CAMINHAO,
				EstadoVeiculo.EM_TRANSITO);

		gt.adicionarVeiculo(carro);
		gt.adicionarVeiculo(carro1);
		gt.adicionarVeiculo(caminhao);
		System.out.println(Veiculo.getTotalVeiculos());
		gt.listarVeiculos();
	}

}
