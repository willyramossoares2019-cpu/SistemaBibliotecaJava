public class Lanche extends Item {
    private int quantidade;

    public Lanche(String nome, double preco, int quantidade) {
        super(nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public String descrever() {
        return "Lanche: " + nome + ", " + quantidade + " unidades";
    }
}
