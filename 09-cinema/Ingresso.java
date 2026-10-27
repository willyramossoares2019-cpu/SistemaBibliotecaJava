public class Ingresso {
    protected String filme;
    protected double valor;

    public Ingresso(String filme, double valor) {
        this.filme = filme;
        this.valor = valor;
    }

    public double valorFinal() {
        return valor;
    }

    // Sobrecarga: mesmo nome, parametros diferentes.
    public String resumo() {
        return filme;
    }

    // Sobrecarga: mesmo nome, parametros diferentes.
    public String resumo(boolean comValor) {
        if (comValor) {
            return filme + ", valor " + valorFinal();
        }
        return filme;
    }
}
