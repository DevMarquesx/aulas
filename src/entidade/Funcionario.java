package entidade;
import entidade.enums.Cargo;

public class Funcionario {
	private String nome;
	private Cargo cargo;
	protected double salario;
	public Funcionario(String nome, Cargo cargo, double salario) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}
	
	public double receber() {
		return salario * 0.9;
	}
}
