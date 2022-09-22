
public class Bloqueada extends Estado {

	public Bloqueada() {
		
	}
	
	@Override
	public void sacar(double valor, Conta c) {
		System.out.println("Conta bloqueada!");
	}

	@Override
	public void depositar(double valor, Conta c) {
		c.saldo+= valor;
		if(c.saldo>=0) {
			c.estado = new Positiva();
			System.out.println("Conta bloqueada positiva!");
			
		}else {
			c.estado = new Negativa();
			System.out.println("Conta bloqueada negativa!");
		}
	}

}
