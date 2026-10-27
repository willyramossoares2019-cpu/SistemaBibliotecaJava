public class Livro extends Publicacao {
    private int paginas;

    public Livro(String titulo, int ano, int paginas) {
        super(titulo, ano);
        this.paginas = paginas;
    }

    @Override
    public String citar() {
        return titulo + " (" + ano + "), " + paginas + " paginas";
    }
}
