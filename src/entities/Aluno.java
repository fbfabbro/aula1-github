package entities;

public class Aluno {

	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	public double mediaFinal() {
		double resultado = (n1 + n2 + n3);
		return resultado;		
	}
	
	public String status(double media) {
		
		String texto;
		if (media >= 60.0) {
			texto = "PASS";
		}
		else {
			texto = "FAILED";
			
		}
		
		return texto;
	}
	
	public double difNota(double media) {
		
		double resultado = 60 - media;
		return resultado;
	}
}
