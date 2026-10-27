public class TesteCinema {
    public static void main(String[] args) {
        Ingresso[] objetos = {
            new MeiaEntrada("Divertida Mente", 40, "carteira 123"),
            new Vip("Duna", 40, "A")
        };

        // Polimorfismo: executa o metodo da subclasse.
        for (Ingresso objeto : objetos) {
            System.out.println(objeto.valorFinal());
        }

        // As duas sobrecargas sao herdadas da superclasse.
        System.out.println(objetos[0].resumo());
        System.out.println(objetos[0].resumo(true));
    }
}
