package entidade;

import entidade.enums.Cargo;

public class PJ extends Funcionario{

	private double adicional;

	public PJ(String nome, Cargo cargo, double salario, double adicional) {
		super(nome, cargo, salario);
		this.adicional = adicional;
	}
	
	public double adicional() {
		return super.receber() + adicional;
	}
}
