
public class BombaCobustivel {
	private String nome;
	private double precoLitro;
	private double qtdLitros;
	private double totalPagar;

	public BombaCobustivel(String nome, double precoLitro) {
		this.nome = nome;
		this.precoLitro = precoLitro;
	}

	void abastecerPorLitros(double litros) {
		this.totalPagar = (litros * precoLitro);
		this.qtdLitros = litros;
	}

	void abastecerPorValor(double valor) {
		this.qtdLitros = (valor / precoLitro);
		this.totalPagar = valor;
	}

	String exibirRecibo() {
		String resultado;
		resultado = "Recibo \n Total a Pagar R$" + this.totalPagar + "" + "\n Combustivel Colocado: " + this.nome + ""
				+ "\n Valor por litro R$" + this.precoLitro + "\n Litros Abastecidos: " + this.qtdLitros + "L";
		return resultado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoLitro() {
		return precoLitro;
	}

	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}

	public double getQtdLitros() {
		return qtdLitros;
	}

	public void setQtdLitros(double qtdLitros) {
		this.qtdLitros = qtdLitros;
	}

	public double getTotalPagar() {
		return totalPagar;
	}

	public void setTotalPagar(double totalPagar) {
		this.totalPagar = totalPagar;
	}

}
