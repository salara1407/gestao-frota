package moveMais;

public abstract class Veiculo {

	private String placa;
	private String modelo;
	private String marca;
	private double valorDiaria;
	private static int totalVeiculos = 0;
	private CategoriasVeiculos categoria;
	private EstadoVeiculo estado;
	private int id;

	public Veiculo(String placa, String modelo, String marca, double valorDiaria, CategoriasVeiculos categoria,
			EstadoVeiculo estado) {
		super();
		setPlaca(placa);
		this.modelo = modelo;
		this.marca = marca;
		setValorDiaria(valorDiaria);
		this.categoria = categoria;
		this.estado = estado;
		totalVeiculos++;
		id = getTotalVeiculos();
	}
	
	public int getId() {
		return id;
	}

	public String formatarMoeda(double valor) {
		return String.format("R$ .2f", valor);
	}
	
	public abstract void fichaTecnica();
	
	public static int getTotalVeiculos() {
		return totalVeiculos;
	}
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		if (placa == null || placa.isEmpty()) {
			throw new IllegalArgumentException("Placa Nulo ou vazio!");
		} else {
			this.placa = placa;
		}
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		if (valorDiaria > 0) {
			this.valorDiaria = valorDiaria;
		}else {
			throw new IllegalArgumentException("Valor Da diária é inválido");			
		}
	}

	public CategoriasVeiculos getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriasVeiculos categoria) {
		this.categoria = categoria;
	}

	public EstadoVeiculo getEstado() {
		return estado;
	}

	public void setEstado(EstadoVeiculo estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Veiculo [placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", valorDiaria=" + valorDiaria
				+ ", categoria=" + categoria + ", estado=" + estado + "]";
	}
}

