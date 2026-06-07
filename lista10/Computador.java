public class Computador {
    public String processador;
    public int memoriaRam;
    public int armazenamento;
    public String sistema;

    public Computador(String processador, int memoriaRam, int armazenamento, String sistema) {
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
        this.sistema = sistema;
    }

    public void ligar() {}
    public void desligar() {}
    public void executarPrograma() {}
    public void salvarArquivo() {}
}