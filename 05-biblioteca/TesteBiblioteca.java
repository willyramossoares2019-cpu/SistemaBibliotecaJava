public class TesteBiblioteca {
    public static void main(String[] args) {
        Publicacao[] objetos = {
            new Livro("Dom Casmurro", 1899, 256),
            new Revista("Ciencia Hoje", 2024, 301)
        };

        // Polimorfismo: executa o metodo da subclasse.
        for (Publicacao objeto : objetos) {
            System.out.println(objeto.citar());
        }

        // As duas sobrecargas sao herdadas da superclasse.
        System.out.println(objetos[0].emprestar(7));
        System.out.println(objetos[0].emprestar(7, "Ana"));
    }
}
