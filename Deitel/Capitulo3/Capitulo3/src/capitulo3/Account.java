package capitulo3;

import java.math.BigDecimal;

public/*modificador de acesso*/ class /*Palavra reservada para criação de classe*/ Account/*Nome da classe*/ { //declaração da classe
    private String nome; //variável de instância
    private BigDecimal saldo = new BigDecimal("0");
    
    public Account/*O nome do construtor é o nome da classe*/(String nome, double saldo){
        this.nome = nome;//Atribui à variavel de instancia a variavel local.
        if (saldo < 0){
            throw new IllegalArgumentException("Não é permitido valores negativos");
        }else{
            this.saldo = new BigDecimal(saldo);
        }
    }
    public void retirar(BigDecimal saida){
        if (saldo.doubleValue() > saida.doubleValue() && saida.doubleValue() > 0){
            System.out.println("Retirando dinheiro...");
            saldo.subtract(saida);
        }
        else if(saldo.doubleValue() < saida.doubleValue()){
            System.out.println("Saldo insuficiente!");
        }
        else{
            System.out.println("Saldo inválido");
        }
    }
    public void deposit(BigDecimal entrada){
        saldo.add(entrada);
        System.out.println("Depositando...");
    }
    public void/*Tipo de retorno, nesse caso nenhum(void)*/ setName(String nome/*Parametros*/)/*Cabeçalho do método*/{
        this.nome = nome; //Atribui o valor do parametro a variavel de instanciamento, assim armazenando a variavel no objeto
    }
    
    public String getName(){
        return nome; //retorna o valor para o chamador
    }
    
    public BigDecimal getSaldo(){
        return saldo;
    }
    
}//Fim da classe
