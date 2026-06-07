public class Animal {
    public String especie;
    public int idade;
    public double peso;
    public String cor;

    public Animal(String especie, int idade, double peso, String cor) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
        this.cor = cor;
    }

    public void correr() {}
    public void comer() {}
    public void dormir() {}
    public void emitirSom() {}
}