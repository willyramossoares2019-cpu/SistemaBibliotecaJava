public class Professor extends Funcionario {
    private String disciplina;

    public Professor(String nome, double salario, String disciplina) {
        super(nome, salario);
        this.disciplina = disciplina;
    }

    @Override
    public String descrever() {
        return "Professor: " + nome + ", disciplina " + disciplina;
    }
}
