public class Transporte {
    protected String linha;

    public Transporte(String linha) {
        this.linha = linha;
    }

    public String anunciar() {
        return "Linha " + linha;
    }

    // Sobrecarga: mesmo nome, parametros diferentes.
    public String lotacao(int ocupantes) {
        return "Ocupantes: " + ocupantes;
    }

    // Sobrecarga: mesmo nome, parametros diferentes.
    public String lotacao(int ocupantes, int capacidade) {
        if (ocupantes <= capacidade) {
            return "Viagem liberada";
        }
        return "Lotacao excedida";
    }
}
