public class Caderno extends Produto {
    private int folhas;

    public Caderno(String nome, double preco, int folhas) {
        super(nome, preco);
        this.folhas = folhas;
    }

    @Override
    public String descrever() {
        return "Caderno: " + nome + ", " + folhas + " folhas";
    }
}
