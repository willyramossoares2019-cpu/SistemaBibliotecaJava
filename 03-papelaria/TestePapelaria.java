public class TestePapelaria {
    public static void main(String[] args) {
        Produto[] objetos = {
            new Caderno("Universitario", 20, 96),
            new Caneta("Bic", 5, "azul")
        };

        // Polimorfismo: executa o metodo da subclasse.
        for (Produto objeto : objetos) {
            System.out.println(objeto.descrever());
        }

        // As duas sobrecargas sao herdadas da superclasse.
        System.out.println(objetos[0].precoComDesconto(10));
        System.out.println(objetos[0].precoComDesconto(90, 8));
    }
}
