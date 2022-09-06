package folhasalarial;

public class PieceWorker extends Employee implements Payable{
    private double wage;
    private int pieces;
    public PieceWorker(String firstName, String lastName, 
            String socialSecurityNumber, double wage, int pieces, Date birthDate){
        super(firstName, lastName, socialSecurityNumber, birthDate);
        if(pieces < 0 || wage < 0.0)
            throw new IllegalArgumentException("Peças ou valor por peças não pode ser menor que 0");
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }
    @Override
    public double earnings() {
       return pieces * wage;
    }

    @Override
    public double incrementPaymentAmount(double increment) {
        return getPaymentAmount() + increment;
    }
    
}
