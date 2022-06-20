package Invoice;


public class Invoice {
    private String numero;
    private String descricao;
    private int quantComprada;
    private double precoPorItem;
    public Invoice(String numero,String descricao,int quantComprada, double precoPorItem){
      this.numero = numero;
      this.descricao = descricao;
      this.quantComprada = quantComprada;
      this.precoPorItem = precoPorItem;
      System.out.println("Instanciado classe");
    }
    public double getInvoiceAmount(){
        if(quantComprada < 0){
            quantComprada = 0;
        }
        if(precoPorItem < 0){
            precoPorItem = 0.0;
        }
        return quantComprada*precoPorItem;
    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantComprada() {
        return quantComprada;
    }

    public void setQuantComprada(int quantComprada) {
        this.quantComprada = quantComprada;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }
    
    
}
