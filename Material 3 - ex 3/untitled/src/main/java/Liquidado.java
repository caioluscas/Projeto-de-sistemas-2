public class Liquidado extends Locacao{

    @Override
    public void pagamento(double valor, Pagamento p) {
        if((p.pagamento-valor)<valor){
            p.pagamento-=valor;
            p.locacao = new Liquidado();
            System.out.println("Pagamento Liquidado!");
        }else{
            p.locacao = new Pendente();
            System.out.println("Pagamento Pendente!");
        }


    }
}
