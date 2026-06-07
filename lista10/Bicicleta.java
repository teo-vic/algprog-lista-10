public class Bicicleta {
    public String cor;
    public String marca;
    public int tamanho;
    public int marchas;

    public Bicicleta(String cor, String marca, int tamanho, int marchas) {
        this.cor = cor;
        this.marca = marca;
        this.tamanho = tamanho;
        this.marchas = marchas;
    }

    public void pedalar() {}
    public void frear() {}
    public void virar() {}
    public void estacionar() {}
}