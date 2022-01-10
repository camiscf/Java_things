package bancoomicron.carteiradecontas;

import java.util.ArrayList;

import bancoomicron.contas.Conta;

public class CarteiraContas implements IAuditoria{

    private ArrayList<Conta> contas;

    public void CarteiraClientes(){
        this.contas = new ArrayList<>();
    }

    public int tamanho(){
        return this.contas.size();
    }

    public void addConta(Conta c){
        this.contas.add(c);
    }

    public boolean removerConta(int numero){
        for (int i = 0; i < this.contas.size(); ++i){
            Conta c = this.contas.get(i);
            if(c.getNumero() == numero){
                this.contas.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public double somaSaldo() {
        // TODO Auto-generated method stub
        double soma = 0;
        for (int i=0; i<this.contas.size();++i){
            Conta c = this.contas.get(i);
            soma +=c.getSaldo();
        }

        return soma;
    }

    @Override
    public double qntdContas() {
        // TODO Auto-generated method stub
        return this.tamanho();
    }
}
