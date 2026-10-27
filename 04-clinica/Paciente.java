public class Paciente extends Pessoa {
    private String convenio;

    public Paciente(String nome, String convenio) {
        super(nome);
        this.convenio = convenio;
    }

    @Override
    public String ficha() {
        return "Paciente: " + nome + ", convenio " + convenio;
    }
}
