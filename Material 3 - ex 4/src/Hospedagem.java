
public abstract class Hospedagem {
	
	int nroPessoas, cont=0;
	public int verNumeroDePessoas(){
		if(nroPessoas<=5) {
			cont++;
		}
		return cont;
	}
	

}
