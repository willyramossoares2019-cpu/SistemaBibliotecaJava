public class Coordenador extends Funcionario {
    private String setor;

    public Coordenador(String nome, double salario, String setor) {
        super(nome, salario);
        this.setor = setor;
    }

    @Override
    public String descrever() {
        return "Coordenador: " + nome + ", setor " + setor;
    }
}
