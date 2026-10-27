public class Gato extends Animal {
    private String pelagem;

    public Gato(String nome, int idade, String pelagem) {
        super(nome, idade);
        this.pelagem = pelagem;
    }

    @Override
    public String descrever() {
        return "Gato: " + nome + ", pelagem " + pelagem;
    }
}
