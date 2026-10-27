public class TesteLanchonete {
    public static void main(String[] args) {
        Item[] objetos = {
            new Lanche("X-burguer", 18, 2),
            new Bebida("Suco", 8, 300)
        };

        // Polimorfismo: executa o metodo da subclasse.
        for (Item objeto : objetos) {
            System.out.println(objeto.descrever());
        }

        // As duas sobrecargas sao herdadas da superclasse.
        System.out.println(objetos[0].total());
        System.out.println(objetos[0].total(2));
    }
}
