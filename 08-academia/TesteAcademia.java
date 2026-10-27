public class TesteAcademia {
    public static void main(String[] args) {
        Atleta[] objetos = {
            new Corredor("Lia", 10),
            new Nadador("Paulo", "crawl")
        };

        // Polimorfismo: executa o metodo da subclasse.
        for (Atleta objeto : objetos) {
            System.out.println(objeto.apresentar());
        }

        // As duas sobrecargas sao herdadas da superclasse.
        System.out.println(objetos[0].registrarTempo(55.2));
        System.out.println(objetos[0].registrarTempo(58, "100m"));
    }
}
