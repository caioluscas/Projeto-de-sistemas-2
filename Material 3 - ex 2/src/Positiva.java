
public class Positiva extends Estado{
	
	public Positiva() {
		
	}
	
	public void sacar(double valor, Conta c) {
		if((c.saldo-valor) >= -100) {         //as contas positivas podem realizar saque de ate -100
			c.saldo-=valor; 
				if(c.saldo<0) {
					c.estado = new Negativa();//a conta "c" é this
					System.out.println("Negativa!");
				}	
			}
			else {
				System.out.println("Saque não permitido!");
			}
	}

	@Override
	public void depositar(double valor, Conta c) {
		c.saldo+=valor;
		
	}

}
