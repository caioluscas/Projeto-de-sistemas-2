
public abstract class Pessoa {

	protected String nome;
	protected Double rendaBruta;
	
	/*public Pessoa(String n, Double rb) {
		super();
		this.nome = n;
		this.rendaBruta = rb;
	} */
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(Double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	
	public abstract Double CalcularIR();
	
	@Override
	public String toString() {   // += é concatenação
		String s = " Nome: " + nome;
		s += "; rendaBruta: " + this.rendaBruta;
		return s;
	}
	
	
	

}
