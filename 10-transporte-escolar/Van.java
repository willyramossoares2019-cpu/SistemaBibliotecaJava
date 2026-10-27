public class Van extends Transporte {
    private int lugares;

    public Van(String linha, int lugares) {
        super(linha);
        this.lugares = lugares;
    }

    @Override
    public String anunciar() {
        return "Van da linha " + linha + ", " + lugares + " lugares";
    }
}
