public class Vip extends Ingresso {
    private String setor;

    public Vip(String filme, double valor, String setor) {
        super(filme, valor);
        this.setor = setor;
    }

    @Override
    public double valorFinal() {
        return valor + 15;
    }
}
