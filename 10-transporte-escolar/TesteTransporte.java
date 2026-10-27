public class TesteTransporte {
    public static void main(String[] args) {
        Transporte[] objetos = {
            new Van("Centro", 15),
            new OnibusEscolar("Bairro", 2)
        };

        // Polimorfismo: executa o metodo da subclasse.
        for (Transporte objeto : objetos) {
            System.out.println(objeto.anunciar());
        }

        // As duas sobrecargas sao herdadas da superclasse.
        System.out.println(objetos[0].lotacao(12));
        System.out.println(objetos[0].lotacao(12, 15));
    }
}
