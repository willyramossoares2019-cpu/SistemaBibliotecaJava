public class Medico extends Pessoa {
    private String especialidade;

    public Medico(String nome, String especialidade) {
        super(nome);
        this.especialidade = especialidade;
    }

    @Override
    public String ficha() {
        return "Medico: " + nome + ", especialidade " + especialidade;
    }
}
