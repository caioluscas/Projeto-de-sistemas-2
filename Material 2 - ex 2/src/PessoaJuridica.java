
public class PessoaJuridica extends Pessoa{

private String cnpj;

//	public PessoaJuridica(String n, Double rb, String cnpj) {
//		super(n, rb);
//		this.cnpj = cnpj;
//		}

	public String getCnpj() {
		return cnpj;
	}
	
	public void SetCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public Double CalcularIR() {
		Double renda = this.rendaBruta;
		if(renda<=30000) {
			return renda;
		}
		if(renda>=30001 && renda<=50000) {
			return renda*0.1;
		}
		if(renda>=50001 && renda<=90000) {
			return renda*0.2;
		}
		if(renda>90000) {
			return renda*0.27;
		}
		return renda;
	}

	
	
	
	@Override
		public String toString() {
			String s = "Pessoa Jurídica";
			s+= super.toString();
			s+=  "; CNPJ: " + cnpj;
			s+= "; Imposto de Renda: " + CalcularIR();
			
			return s;
			
		}
	
	
	
}
