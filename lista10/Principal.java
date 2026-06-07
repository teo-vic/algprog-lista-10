public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("João", 20, "123", "joao@email.com");
        Carro carro = new Carro("Toyota", "Corolla", "Prata", 2022);
        Animal animal = new Animal("Cachorro", 5, 15, "Marrom");
        Celular celular = new Celular("Samsung", "A54", 128, "Preto");
        Televisao tv = new Televisao("LG", 50, "4K", "Preta");
        Livro livro = new Livro("Dom Casmurro", "Machado", 250, "Romance");
        Bicicleta bike = new Bicicleta("Azul", "Caloi", 29, 21);
        Computador pc = new Computador("i5", 16, 512, "Windows");
        ContaBancaria conta = new ContaBancaria(1234, 1000, 100, "João");
        Aluno aluno = new Aluno("Maria", 12345, "ADS", 19);

        pessoa.falar();
        carro.ligar();
        animal.emitirSom();
        celular.tirarFoto();
        tv.ligar();
        livro.abrir();
        bike.pedalar();
        pc.ligar();
        conta.consultarSaldo();
        aluno.estudar();
    }
}