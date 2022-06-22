package pkg4.pkg18;


public class Cliente {
    private int numeroConta;
    private double saldoInicio;
    private double totalItensCobrados;
    private double totalCredito;
    private double limiteAuto;
    public Cliente(int numeroConta, double saldoInicio, double totalItensCobrados, double totalCredito, double limiteAuto){
        this.numeroConta = numeroConta;
        this.saldoInicio = saldoInicio;
        this.totalItensCobrados = totalItensCobrados;
        this.totalCredito = totalCredito;
        this.limiteAuto = limiteAuto;
    }
    public double getNovoSaldo(){
        return saldoInicio + totalItensCobrados - totalCredito;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoInicio() {
        return saldoInicio;
    }

    public void setSaldoInicio(double saldoInicio) {
        this.saldoInicio = saldoInicio;
    }

    public double getTotalItensCobrados() {
        return totalItensCobrados;
    }

    public void setTotalItensCobrados(int totalItensCobrados) {
        this.totalItensCobrados = totalItensCobrados;
    }

    public double getTotalCredito() {
        return totalCredito;
    }

    public void setTotalCredito(double totalCredito) {
        this.totalCredito = totalCredito;
    }

    public double getLimiteAuto() {
        return limiteAuto;
    }

    public void setLimiteAuto(double limiteAuto) {
        this.limiteAuto = limiteAuto;
    }
    
}
