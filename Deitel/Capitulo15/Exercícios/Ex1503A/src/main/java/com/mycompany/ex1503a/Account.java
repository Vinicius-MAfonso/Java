package com.mycompany.ex1503a;

public class Account {
  private String nome;
  private int conta;
  public Account(String _nome, int _conta){
      this.nome = _nome;
      this.conta = _conta;
  }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }
  
}
