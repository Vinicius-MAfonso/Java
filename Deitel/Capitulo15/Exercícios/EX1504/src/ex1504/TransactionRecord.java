package ex1504;

public class TransactionRecord {
    private int account;
    private double ammount;
    
    public TransactionRecord(int _account, int _ammount){
        this.account = _account;
        if(_ammount < 0)
            throw new IllegalArgumentException("Valor monetário não pode ser menor que 0");
        this.ammount = _ammount;
    }
    public TransactionRecord(){
        this(0,0);
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }
}
