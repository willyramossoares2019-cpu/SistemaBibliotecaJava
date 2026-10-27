public class Publicacao {
    protected String titulo;
    protected int ano;

    public Publicacao(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
    }

    public String citar() {
        return titulo + " (" + ano + ")";
    }

    // Sobrecarga: mesmo nome, parametros diferentes.
    public String emprestar(int dias) {
        return "Emprestimo de " + dias + " dias";
    }

    // Sobrecarga: mesmo nome, parametros diferentes.
    public String emprestar(int dias, String leitor) {
        return "Emprestimo de " + dias + " dias para " + leitor;
    }
}
