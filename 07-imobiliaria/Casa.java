public class Casa extends Imovel {
    private int quartos;

    public Casa(String endereco, double area, int quartos) {
        super(endereco, area);
        this.quartos = quartos;
    }

    @Override
    public String descrever() {
        return "Casa: " + endereco + ", " + quartos + " quartos";
    }
}
