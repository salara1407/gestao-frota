package moveMais;

public class Caminhao extends Veiculo{

	public Caminhao(String placa, String modelo, String marca, double valorDiaria, CategoriasVeiculos categoria,
			EstadoVeiculo estado) {
		super(placa, modelo, marca, valorDiaria, categoria, estado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fichaTecnica() {
		System.out.println("Caminhao [getPlaca()=" + getPlaca() + ", getModelo()=" + getModelo() + ", getMarca()=" + getMarca()
		+ ", getValorDiaria()=" + getValorDiaria() + ", getCategoria()=" + getCategoria() + ", getEstado()="
		+ getEstado() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
		+ hashCode() + "]");		
	}

	@Override
	public String toString() {
		return "Caminhao [getPlaca()=" + getPlaca() + ", getModelo()=" + getModelo() + ", getMarca()=" + getMarca()
				+ ", getValorDiaria()=" + getValorDiaria() + ", getCategoria()=" + getCategoria() + ", getEstado()="
				+ getEstado() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	
	
}