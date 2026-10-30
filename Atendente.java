package aula_29_10;

public class Atendente extends Funcionario{
	private double ajudaDeCusto;

	public Atendente(String nome, String cpf, double salario, String cargo, String departamento, double ajudaDeCusto) {
		super(nome, cpf, salario, cargo, departamento);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
}
