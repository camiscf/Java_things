package bancoomicron.contas;

public abstract class Conta {
    protected double saldo;
    protected int numero;
    protected int matricula_cliente;

    public Conta(int numero, int matricula_cliente){
        this.numero = numero;
        this.matricula_cliente = matricula_cliente;
        this.saldo = 0;
    }


    public void depositar(double valor){
        this.saldo +=valor;
    }

    public abstract boolean sacar(double valor);

    public double getSaldo(){
        return saldo;
    }

    public int getNumero(){
        return numero;
    }


    public void remove(int i) {
    }
}
