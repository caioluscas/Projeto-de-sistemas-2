public class Agendada extends Locacao{
    @Override
    public void pagamento(double valor, Pagamento p) {
            if((p.pagamento-valor)<valor){
                p.locacao = new Agendada();
                System.out.println("Agendado!");
            }

    }
}
