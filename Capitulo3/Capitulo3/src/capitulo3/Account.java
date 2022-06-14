package capitulo3;

public/*modificador de acesso*/ class /*Palavra reservada para criação de classe*/ Account/*Nome da classe*/ { //declaração da classe
    private String nome; //variável de instância
    
    public void setName(String nome){
        this.nome = nome; //armazena o nome
    }
    
    public String getName(){
        return nome; //retorna o valor para o chamador
    }
}//Fim da classe

