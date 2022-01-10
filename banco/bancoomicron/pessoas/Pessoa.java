package bancoomicron.pessoas;

public abstract class Pessoa {
    protected String cpf; //consegue acessar estando no mesmo pacote ou não
    protected String nome;


    public Pessoa(String cpf, String nome){ //Construtor
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void fazerDepois(); //quando é abstrato n coloca implementação, é um de não acesso, todo mundo que extender a classe precisa definir esse metodoo



}
