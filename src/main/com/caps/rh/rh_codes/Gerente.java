package rh_codes;
public class Gerente extends Funcionario{

	// Atributos Específicos
	
	private double bonusAnual;
	
	// Construtor
	public Gerente(String nome, String cpf, double salario, double bonus) {
		super(nome, cpf, salario);
	}
	
	// Regra de Negócio

	double calcularRemuneracaoTotal() {
		return super.getSalario() + this.bonusAnual;
	}
	
	// Getters e Setters
	public double getBonusAnual() {
		return bonusAnual;
	}

	public void setBonusAnual(double bonusAnual) {
		this.bonusAnual = bonusAnual;
	}
	
	
}