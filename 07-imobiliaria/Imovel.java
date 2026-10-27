public class Imovel {
    protected String endereco;
    protected double area;

    public Imovel(String endereco, double area) {
        this.endereco = endereco;
        this.area = area;
    }

    public String descrever() {
        return "Imovel: " + endereco;
    }

    // Sobrecarga: mesmo nome, parametros diferentes.
    public double valorEstimado(double precoM2) {
        return area * precoM2;
    }

    // Sobrecarga: mesmo nome, parametros diferentes.
    public double valorEstimado(double precoM2, double taxa) {
        return area * precoM2 + taxa;
    }
}
