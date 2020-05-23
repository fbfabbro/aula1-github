package entities;

public class ContaCorrente {
	
	private int contaNumero;
	private String contaNome;
	private double contaSaldo;
	
	public ContaCorrente(int contaNumero, String contaNome, double contaSaldo) {
		this.contaNumero = contaNumero;
		this.contaNome = contaNome;
		this.contaSaldo = contaSaldo;
	}

	public ContaCorrente(int contaNumero, String contaNome) {
		this.contaNumero = contaNumero;
		this.contaNome = contaNome;
	}

	public int getContaNumero() {
		return contaNumero;
	}

	public String getContaNome() {
		return contaNome;
	}

	public void setContaNome(String contaNome) {
		this.contaNome = contaNome;
	}

	public double getContaSaldo() {
		return contaSaldo;
	}

	public void deposito(double valor) {
		this.contaSaldo += valor;
		
	}
	
	public void saque(double valor) {
		this.contaSaldo -= valor;
		this.contaSaldo -= 5.00;
	}
	
	public String toString() {
		return "Account " 
				+ contaNumero
				+  ", Holder "
				+ contaNome
				+ ", Balance: $ " 
				+ String.format("%.2f\n", contaSaldo);

	}

}
