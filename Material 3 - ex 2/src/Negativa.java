
public class Negativa extends Estado{

	public Negativa() {
		
	}
	
	@Override
	public void sacar(double valor, Conta c) {
		if((c.saldo-= valor) < -100) {
			c.estado = new Bloqueada();
			System.out.println("Bloqueado!");
		}
		
	}

	@Override
	public void depositar(double valor, Conta c) {
		c.saldo+= valor;
		if(c.saldo > 0) {
			System.out.println("Positivo!");
			c.estado = new Positiva();
		}
		else {
			System.out.println("Negativo");
			c.estado = new Negativa();
		}
	}

	

}
