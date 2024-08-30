package entidade;

import entidade.enums.Cargo;

public class CLT extends Funcionario{
	
	private double convenio;

	public CLT(String nome, Cargo cargo, double salario, double convenio) {
		super(nome, cargo, salario);
		this.convenio = convenio;
	}
	public double convenio() {
			return super.receber() - convenio;	
	}
}
