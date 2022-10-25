package projeto.pizzaria;

import java.util.Formatter;
import java.io.IOException;
import java.util.Arrays;

public class Cliente {
    private final int nPedido;
    private final String nome;
    private final String telefone;
    private final String endereco;
    public Cliente(String nome, String telefone, String endereco,int nPedido){
        this.nome = nome;
        this.endereco = endereco;
        this.nPedido = nPedido;
        this.telefone = telefone;
    }
    public void gerarRelatorio(String relatorio){
        StringBuilder builder = new StringBuilder();
        try(Formatter arquivo = new Formatter(String.format("relatorios\\cliente_%s.txt", getNome()))){
            arquivo.format("---Relatório---\n");
            arquivo.format(String.format("Nome: %s%nTelefone: %s%nEndereço: %s%n", getNome(), getTelefone(), getEndereco()));
            arquivo.format("Pedidos:\n");
            String[] pedidos = relatorio.split(",\\d*");
            System.out.println(Arrays.toString(pedidos));
            for(String pedido : pedidos){
                arquivo.format("%s%n", pedido);
            }
        }catch(IOException e){
            System.err.println(e);
        }
    }

    public int getnPedido() {
        return nPedido;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }
    
}
