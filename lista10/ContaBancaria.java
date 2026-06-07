public class ContaBancaria {
    public int numero;
    public double saldo;
    public int agencia;
    public String titular;

    public ContaBancaria(int numero, double saldo, int agencia, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.agencia = agencia;
        this.titular = titular;
    }

    public void depositar() {}
    public void sacar() {}
    public void transferir() {}
    public void consultarSaldo() {}
}