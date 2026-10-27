public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String descrever() {
        return "Funcionario: " + nome;
    }

    // Sobrecarga: mesmo nome, parametros diferentes.
    public double bonificacao() {
        return salario * 10 / 100;
    }

    // Sobrecarga: mesmo nome, parametros diferentes.
    public double bonificacao(double percentual) {
        return salario * percentual / 100;
    }
}
