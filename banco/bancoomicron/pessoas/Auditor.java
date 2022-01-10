package bancoomicron.pessoas;

import bancoomicron.carteiradecontas.IAuditoria;

public class Auditor extends Pessoa {
    
    public Auditor(String cpf, String nome){
        super(cpf, nome);
    }

    public Boolean auditar(IAuditoria auditado){
        return (auditado.somaSaldo()/auditado.qntdContas()) > 500; 
    }

    


    @Override
    public void fazerDepois() {
        // TODO Auto-generated method stub
        
    }

}
