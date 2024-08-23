package Entidade;

public class Contapoupanca extends Conta{
	
	public Contapoupanca(String nome, int numero, double saldo) {
		super(nome, numero, saldo);
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public String toString() {
		return "ContaPoupanca "  + mostrar();
	}
}