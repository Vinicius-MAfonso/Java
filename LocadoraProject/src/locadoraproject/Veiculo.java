package locadoraproject;

public class Veiculo {
    //Atributos da classe veiculo
    private final String tipoVeiculo;
    private final String marca;
    private final String modelo;
    private final String emplacamento;//Tem como usar um Regex para validar
    private final double valorVeiculo;
    private boolean alugado = false;
    public Veiculo(String tipoVeiculo, String marca, String modelo,
            String emplacamento, double valorVeiculo){
        //Construtor constrói a classe referenciando os argumentos dele nos atributos
        this.tipoVeiculo = tipoVeiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.emplacamento = emplacamento;
        if(valorVeiculo <= 0.0){
            throw new IllegalArgumentException("Valor menor ou igual a 0");
        }
        this.valorVeiculo = valorVeiculo;
    }
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getEmplacamento(){
        return emplacamento;
    }
    public double getValorVeiculo(){
        return valorVeiculo;
    }
    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }
    @Override
    public String toString(){
        return String.format("%s - %s",  getMarca(),getModelo());
    }
}
