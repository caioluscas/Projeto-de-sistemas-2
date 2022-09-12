
public class PessoaFisica extends Pessoa {
	private String rg;
	 
	/*public PessoaFisica(String n, Double rb, String rg) {
		super(n, rb);
		this.rg = rg;
	}*/
	
	public PessoaFisica() {
		
	}
	
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public Double CalcularIR() {
		Double renda = this.rendaBruta;
		if(renda<=1500) {
			return renda;
		}
		if(renda>=1501 && renda<=3000) {
			return renda*0.1;
		}
		if(renda>=3001 && renda<=10000) {
			return renda*0.2;
		}
		if(renda>10000) {
			return renda*0.27;
		}
		return renda;
	}
	
	@Override
	public String toString() {
		String s = "PessoaFisica";
		s+= super.toString();
		s+= "; RG: " + rg;
		s+= "; Imposto de renda: " + CalcularIR();
	
		return s;
	}

	
	
	
	
}
