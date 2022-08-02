package capitulo3;

public/*modificador de acesso*/ class /*Palavra reservada para criação de classe*/ Account/*Nome da classe*/ { //declaração da classe
    private String nome; //variável de instância
    private double saldo;
    
    public Account/*O nome do construtor é o nome da classe*/(String nome, double saldo){
        this.nome = nome;//Atribui à variavel de instancia a variavel local.
        if (saldo < 0){
            this.saldo = 0;
        }else{
            this.saldo = saldo;
        }
    }
    public void retirar(double saida){
        if (saldo > saida && saida > 0){
            System.out.println("Retirando dinheiro...");
            saldo -= saida;
        }
        else if(saldo < saida){
            System.out.println("Saldo insuficiente!");
        }
        else{
            System.out.println("Saldo inválido");
        }
    }
    public void deposit(double entrada){
        this.saldo += entrada;
        System.out.println("Depositando...");
    }
    public void/*Tipo de retorno, nesse caso nenhum(void)*/ setName(String nome/*Parametros*/)/*Cabeçalho do método*/{
        this.nome = nome; //Atribui o valor do parametro a variavel de instanciamento, assim armazenando a variavel no objeto
    }
    
    public String getName(){
        return nome; //retorna o valor para o chamador
    }
    
    public double getSaldo(){
        return saldo;
    }
    
}//Fim da classe
