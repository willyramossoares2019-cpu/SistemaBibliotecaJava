public class MeiaEntrada extends Ingresso {
    private String documento;

    public MeiaEntrada(String filme, double valor, String documento) {
        super(filme, valor);
        this.documento = documento;
    }

    @Override
    public double valorFinal() {
        return valor / 2;
    }
}
