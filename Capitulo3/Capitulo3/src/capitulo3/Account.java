package capitulo3;

public/*modificador de acesso*/ class /*Palavra reservada para criação de classe*/ Account/*Nome da classe*/ { //declaração da classe
    private String nome; //variável de instância
    
    public void/*Tipo de retorno, nesse caso nenhum(void)*/ setName(String nome/*Parametros*/)/*Cabeçalho do método*/{
        this.nome = nome; //Atribui o valor do parametro a variavel de instanciamento, assim armazenando a variavel no objeto
    }
    
    public String getName(){
        return nome; //retorna o valor para o chamador
    }
}//Fim da classe

