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
        StringBuilder stringBuilder = new StringBuilder();
        try(FileWriter arquivo = new FileWriter(new File(String.format("relatorios\\cliente_%s.txt", getNome())))){
            stringBuilder.append("---Relatório---\n");
            stringBuilder.append(String.format("Nome: %s%nTelefone: %s%nEndereço: %s%n", getNome(), getTelefone(), getEndereco()));
            stringBuilder.append("Pedidos:\n");
            
            arquivo.write(stringBuilder.toString());
            String[] pedidos = relatorio.split(",");
            for(String pedido : pedidos)
                arquivo.write(String.format("%s%n", pedido));
        }catch(Exception e){
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
