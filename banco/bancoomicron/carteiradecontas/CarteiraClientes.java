package bancoomicron.carteiradecontas;

import java.util.ArrayList;

import bancoomicron.pessoas.Cliente;

public class  CarteiraClientes implements IAuditoria{

    private ArrayList<Cliente> clientes;

    public CarteiraClientes(){
        this.clientes = new ArrayList<>();
    }
 
    public void addCliente (Cliente c){
        this.clientes.add(c);
    }

    public boolean removeCliente(String cpf){
        int i = this.getIndicePorCPF(cpf);    
        if (i < 0){
            return false;
        } else {
            this.clientes.remove(i);
            return true;
        }
    }

    public int removeCliente(String [] cpf){
        int cnt = 0;
        for (int i=0; i < cpf.length;++i){
            if(removeCliente(cpf[i])){
                cnt +=1;
            }
        }
        return cnt;
    }

    private int getIndicePorCPF(String cpf){
        for (int i=0; i <this.clientes.size();i++){
            Cliente c = this.clientes.get(i);
            if (c.getCpf().equals(cpf)){

                return i;
            }
        }
        return -1;
    }

    public Cliente buscaCPF(String cpf){
        int i = this.getIndicePorCPF(cpf);    
        if (i >= 0){
            return this.clientes.get(i);

        }else {
            return null;
        }
    }

    @Override
    public double somaSaldo() {
        // TODO Auto-generated method stub
        double soma = 0;
        for (int i=0; i<this.clientes.size();++i){
            Cliente c = this.clientes.get(i);
            soma +=c.somaSaldos();
        }

        return soma;
    }

    @Override
    public double qntdContas() {
        // TODO Auto-generated method stub
        int cnt = 0;
        for (int i =0; i < this.clientes.size();++i){
            Cliente c = this.clientes.get(i);
            cnt += c.numContas();
        }
        return cnt;
    }
}
