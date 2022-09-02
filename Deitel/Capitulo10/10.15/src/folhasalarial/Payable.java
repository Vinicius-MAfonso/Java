package folhasalarial;

public interface Payable {
    double getPaymentAmount();
    default double incrementPaymentAmount(double increment){
        return getPaymentAmount() + increment;
    }   
}
