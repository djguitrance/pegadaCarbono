package br.com.unip.pegadacarbono.models;

public class Pegada {

	private Integer energia;
	private double gas;
	private Veiculo veiculo;
	private Integer km;
	
	// Funções para calcular co2 de cada atributo
	
	public double calculaCo2Energia() {
		return ((this.energia * 0.1355)/1000);
	}
	
	public double calculaCo2Gas() {
		return ((this.gas * 2.07)/1000);
	}
	
	public double calculaCo2Transp() {
		
		if (this.veiculo.toString() == "carro") {
			return ((this.km * 0.092)/1000);
		} 
		
		if (this.veiculo.toString() == "taxi") {
			return ((this.km * 0.092)/1000);
		}
		
		if (this.veiculo.toString() == "moto") {
			return ((this.km * 0.0637)/1000);
		}
		
		if (this.veiculo.toString() == "onibus") {
			return ((this.km * 0.08142)/1000);
		}
		
		if (this.veiculo.toString() == "metro") {
			return ((this.km * 0.063212)/1000);
		}
		
		if (this.veiculo.toString() == "trem") {
			return ((this.km * 0.063212)/1000);
		}
		
		return 0.0;
		
	}
	
	public String totalCo2(double resultadoEnergia, double resultadoGas, double resultadoTransp) {
		double resultado = (resultadoEnergia + resultadoGas + resultadoTransp);
		String resFormatado = String.format("%.2f", resultado);
		return resFormatado;
	}
	
	// Getters e Setters
	
	public Integer getEnergia() {
		return energia;
	}
	
	public void setEnergia(Integer energia) {
		this.energia = energia;
	}
	
	public double getGas() {
		return gas;
	}
	
	public void setGas(double gas) {
		this.gas = gas;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
	
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	public Integer getKm() {
		return km;
	}
	
	public void setKm(Integer km) {
		this.km = km;
	}
}
