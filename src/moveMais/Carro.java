package moveMais;

public class Carro extends Veiculo {

	private double portaMalas;
	private TipoCombustivel tipoCombustivel;

	public Carro(String placa, String modelo, String marca, double valorDiaria, CategoriasVeiculos categoria,
			EstadoVeiculo estado) {
		super(placa, modelo, marca, valorDiaria, categoria, estado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fichaTecnica() {
		System.out.println("Carro "+ getId() +"\nPlaca = "+ getPlaca() + "\nModelo = " + getModelo() + "\nMarca = " + getMarca() + "\nValorDiaria = "
				+ getValorDiaria() + " " + getCategoria() + "\nEstado = " + getEstado()+ "\n");
	}

	@Override
	public String toString() {
		return "Carro [portaMalas=" + portaMalas + ", tipoCombustivel=" + tipoCombustivel + ", getPlaca()=" + getPlaca()
				+ ", getModelo()=" + getModelo() + ", getMarca()=" + getMarca() + ", getValorDiaria()="
				+ getValorDiaria() + ", getCategoria()=" + getCategoria() + ", getEstado()=" + getEstado()
				+ ", toString()=" + super.toString() + "]";
	}

}


