public class TesteImobiliaria {
    public static void main(String[] args) {
        Imovel[] objetos = {
            new Casa("Rua A, 10", 80, 3),
            new Apartamento("Rua B, 200", 60, 5)
        };

        // Polimorfismo: executa o metodo da subclasse.
        for (Imovel objeto : objetos) {
            System.out.println(objeto.descrever());
        }

        // As duas sobrecargas sao herdadas da superclasse.
        System.out.println(objetos[0].valorEstimado(3000));
        System.out.println(objetos[0].valorEstimado(3000, 2000));
    }
}
