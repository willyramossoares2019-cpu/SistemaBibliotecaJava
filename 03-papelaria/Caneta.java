public class Caneta extends Produto {
    private String cor;

    public Caneta(String nome, double preco, String cor) {
        super(nome, preco);
        this.cor = cor;
    }

    @Override
    public String descrever() {
        return "Caneta: " + nome + ", cor " + cor;
    }
}
