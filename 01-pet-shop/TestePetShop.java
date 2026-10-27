public class TestePetShop {
    public static void main(String[] args) {
        Animal[] objetos = {
            new Cachorro("Rex", 3, "Labrador"),
            new Gato("Mia", 2, "curta")
        };

        // Polimorfismo: executa o metodo da subclasse.
        for (Animal objeto : objetos) {
            System.out.println(objeto.descrever());
        }

        // As duas sobrecargas sao herdadas da superclasse.
        System.out.println(objetos[0].idadeEmMeses());
        System.out.println(objetos[0].idadeEmMeses(6));
    }
}
