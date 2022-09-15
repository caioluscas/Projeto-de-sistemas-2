public class Pagamento{
    protected double pagamento;
    protected Locacao locacao;

    public Pagamento(){                //Construtor
        this.pagamento = pagamento;
        this.locacao = new Pendente();
    }

    public Pagamento(double valor) {
        this.locacao.pagamento(valor, this);
    }
}
