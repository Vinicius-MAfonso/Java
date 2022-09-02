package folhasalarial;

public class ComissionEmployee extends Employee{
    private double grossSales;//Quantia de vendas
    private double comissionRate;//Taxa de comissão
    
    public ComissionEmployee(String firstName, String lastName, 
            String socialSecurityNumber,double grossSales, double comissionRate,
            Date birthDate){
        super(firstName, lastName, socialSecurityNumber,birthDate);
        setGrossSales(grossSales);
        setComissionRate(comissionRate);
    }

    public double getGrossSales() {
        return grossSales;
    }

    private void setGrossSales(double grossSales) {
        if(grossSales < 0)
            throw new IllegalArgumentException("Ganho deve ser maior que 0.0");
        this.grossSales = grossSales;
    }

    public double getComissionRate() {
        return comissionRate;
    }

    private void setComissionRate(double comissionRate) {
        if(comissionRate <= 0.0 || comissionRate >= 1)
            throw new IllegalArgumentException("Taxa de comissão deve estar entre 0 e 1");
        this.comissionRate = comissionRate;
    }
    @Override
    public double getPaymentAmount(){
        return getGrossSales()*getComissionRate();
    }
    @Override
    public String toString(){
        return String.format(super.toString()+"%nTaxa de comissão: %.2f"
                + "%nGanho bruto: R$%.2f", getComissionRate(),getGrossSales());
    }
}
