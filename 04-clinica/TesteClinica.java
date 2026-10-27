public class TesteClinica {
    public static void main(String[] args) {
        Pessoa[] objetos = {
            new Paciente("Carla", "Unimed"),
            new Medico("Diego", "Clinica")
        };

        // Polimorfismo: executa o metodo da subclasse.
        for (Pessoa objeto : objetos) {
            System.out.println(objeto.ficha());
        }

        // As duas sobrecargas sao herdadas da superclasse.
        System.out.println(objetos[0].agendar("12/10/2026"));
        System.out.println(objetos[0].agendar("12/10/2026", "14:00"));
    }
}
