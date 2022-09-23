package projeto.pizzaria;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
    public void gerarRelatorio(String relatorio) throws IOException {
        FileWriter arquivo = new FileWriter(new File(String.format("relatorios\\cliente_%s.txt", getNome())));
        arquivo.write(String.format("---Relatório---%n"));
        arquivo.write(String.format("Nome: %s%nTelefone: %s%nEndereço: %s%n", getNome(), getTelefone(), getEndereco()));
        arquivo.write(String.format("Pedidos:%n"));
        String[] pedidos = relatorio.split(",");
        for(String pedido : pedidos){
            arquivo.write(String.format("%s%n", pedido));
        }
        arquivo.close();
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
