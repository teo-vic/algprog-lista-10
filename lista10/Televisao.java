public class Televisao {
    public String marca;
    public int tamanho;
    public String resolucao;
    public String cor;

    public Televisao(String marca, int tamanho, String resolucao, String cor) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.resolucao = resolucao;
        this.cor = cor;
    }

    public void ligar() {}
    public void desligar() {}
    public void trocarCanal() {}
    public void ajustarVolume() {}
}