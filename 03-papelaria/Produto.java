public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String descrever() {
        return "Produto: " + nome;
    }

    // Sobrecarga: mesmo nome, parametros diferentes.
    public double precoComDesconto(double percentual) {
        return preco * (1 - percentual / 100);
    }

    // Sobrecarga: mesmo nome, parametros diferentes.
    public double precoComDesconto(double percentual, double minimo) {
        double resultado = precoComDesconto(percentual);
        if (resultado < minimo) {
            return minimo;
        }
        return resultado;
    }
}
