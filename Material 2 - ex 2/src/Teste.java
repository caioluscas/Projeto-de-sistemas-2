
public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Isac");
		p1.setRendaBruta(3902.00);
		p1.setRg("11.961.499-6");
		
		PessoaJuridica p2 = new PessoaJuridica();
		p2.setNome("Caio Lucas");
		p2.setRendaBruta(100000.00);
		p2.SetCnpj("11.109.750/0001-12");
		
		PessoaJuridica p3 = new PessoaJuridica();
		p3.setNome("Gabrielle");
		p3.setRendaBruta(70000.00);
		p3.SetCnpj("06.642.329/0001-32");
		
		
		
		Pessoa[] pessoa = new Pessoa[3];
		pessoa[0] = p1;
		pessoa[1] = p2;
		pessoa[2] = p3;
		
		for(Pessoa p: pessoa) {
			System.out.println(p.toString());
		}
		

	}

}
