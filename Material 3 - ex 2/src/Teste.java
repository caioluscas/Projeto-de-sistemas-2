
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c = new Conta(10);
		//c.depositar(10);
		c.sacar(100);
		c.sacar(100);
		c.sacar(90);
		System.out.println("Saldo: "+c.saldo);
	}

}
