public class TesteEscola {
    public static void main(String[] args) {
        Funcionario[] objetos = {
            new Professor("Ana", 3000, "POO"),
            new Coordenador("Bruno", 4500, "Pedagogico")
        };

        // Polimorfismo: executa o metodo da subclasse.
        for (Funcionario objeto : objetos) {
            System.out.println(objeto.descrever());
        }

        // As duas sobrecargas sao herdadas da superclasse.
        System.out.println(objetos[0].bonificacao());
        System.out.println(objetos[0].bonificacao(20));
    }
}
