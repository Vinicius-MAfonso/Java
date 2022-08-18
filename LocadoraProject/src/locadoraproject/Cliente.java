package locadoraproject;

public class Cliente {
    private final String nome;
    private final String cpf;
    private final int idade;
    public Cliente(String nome,String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public int getIdade() {
        return idade;
    }
}
