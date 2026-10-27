public class Item {
    protected String nome;
    protected double preco;

    public Item(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String descrever() {
        return "Item: " + nome;
    }

    // Sobrecarga: mesmo nome, parametros diferentes.
    public double total() {
        return preco;
    }

    // Sobrecarga: mesmo nome, parametros diferentes.
    public double total(int unidades) {
        return preco * unidades;
    }
}
