public class Pendente extends Locacao{
    @Override
    public void pagamento(double valor, Pagamento p) {
        p.locacao = new Pendente();
        System.out.println("Pagemento pendente!");
    }
}
