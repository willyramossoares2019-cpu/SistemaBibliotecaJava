public class Revista extends Publicacao {
    private int edicao;

    public Revista(String titulo, int ano, int edicao) {
        super(titulo, ano);
        this.edicao = edicao;
    }

    @Override
    public String citar() {
        return titulo + " (" + ano + "), edicao " + edicao;
    }
}
