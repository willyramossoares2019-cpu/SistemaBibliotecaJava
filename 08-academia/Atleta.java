public class Atleta {
    protected String nome;

    public Atleta(String nome) {
        this.nome = nome;
    }

    public String apresentar() {
        return "Atleta: " + nome;
    }

    // Sobrecarga: mesmo nome, parametros diferentes.
    public String registrarTempo(double segundos) {
        return "Tempo: " + segundos + " s";
    }

    // Sobrecarga: mesmo nome, parametros diferentes.
    public String registrarTempo(double segundos, String prova) {
        return "Tempo na prova " + prova + ": " + segundos + " s";
    }
}
