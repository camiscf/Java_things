package bancoomicron.pessoas;

import bancoomicron.carteiradecontas.CarteiraContas;
import bancoomicron.carteiradecontas.IAuditoria;
import bancoomicron.contas.Conta;

public class Cliente extends Pessoa{
 
    private CarteiraContas contas;
    private static int matricula;
    private static int gerador_matricula = 0; //variavel da classe

    public Cliente(String cpf, String nome){
        super(cpf, nome);
       this.contas = new CarteiraContas();
    }

    public Cliente (String cpf, String nome, Conta conta){
        super(cpf, nome);
        this.contas = new CarteiraContas();
        this.contas.addConta(conta);
        Cliente.matricula = Cliente.geraMatricula();
    }

    public double somaSaldos(){
        return this.contas.somaSaldo();
    }

    private static int geraMatricula(){
        this.matricula = Cliente.gerador_matricula;
        ++Cliente.gerador_matricula;
        return matricula;
    }

    public int numContas() { //N° de contas que há
        return this.contas.tamanho();
    }


    public int getMatricula(){
        return Cliente.matricula;
    }

    public void addConta(Conta c){
        this.contas.addConta(c);
    }

    public boolean removeConta(int numero_conta){
       return this.contas.removerConta(numero_conta);
    }


}
