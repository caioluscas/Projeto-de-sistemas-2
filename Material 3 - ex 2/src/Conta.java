
public class Conta {
	protected double saldo;
	protected Estado estado;
	
	
	public Conta(double saldo) {
		this.saldo = saldo;
		this.estado = new Positiva();
	}
	
	
	//metodo gancho
	public void sacar(double valor) {
		this.estado.sacar(valor,this); //o this dentro do () serve para ele saber qual classe ele vai implementar
	}
	
	public void depositar(double valor) {
		this.estado = new Positiva();
		this.estado.depositar(valor, this);
	}
	
}
