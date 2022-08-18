package locadoraproject;

public class Contrato {
    private final Veiculo veiculoLocado;
    private final Cliente cliente;
    private final double valorContrato;
    private final int tempoContrato;
    public Contrato(Veiculo veiculo, Cliente cliente, int tempoContrato){
        this.veiculoLocado = veiculo;
        this.cliente = cliente;
        this.tempoContrato = tempoContrato;
        this.valorContrato = (veiculoLocado.getValorVeiculo()+25)*tempoContrato;
    }

    public Veiculo getVeiculoLocado() {
        return veiculoLocado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValorContrato() {
        return valorContrato;
    }

    public int getTempoContrato() {
        return tempoContrato;
    }
    @Override
    public String toString(){
        return String.format("Sr. %s, CPF. %s %nconvenciona e contrata a locação "
                + "de um veiculo modelo %s%npor %d meses no valor de %.2f reais!",
                getCliente().getNome(),getCliente().getCpf(), getVeiculoLocado(), getTempoContrato(), getValorContrato());
    }
}
