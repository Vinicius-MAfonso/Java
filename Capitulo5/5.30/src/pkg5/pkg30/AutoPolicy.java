package pkg5.pkg30;

public class AutoPolicy {
    private int accountNumber;
    private String makeAndModel;
    private String state;
    
    public AutoPolicy(int accountNumber, String makeAndModel, String state){
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {        
        this.state = state;
        if(state != "CT" | state != "MA" | state != "ME" | state != "NH" |
                state != "NJ" | state != "NY" | state != "PA" | state != "VT"){
            System.out.println("Estado inválido");
        }else{
            System.out.println("Estado recebido");
        }
    }
    public boolean isNotFaultState(){
        boolean noFaultState;
        noFaultState = switch (getState()) {
            case "MA", "NJ", "NY", "PA" -> true;
            default -> false;
        };
        return noFaultState;
    }
}
