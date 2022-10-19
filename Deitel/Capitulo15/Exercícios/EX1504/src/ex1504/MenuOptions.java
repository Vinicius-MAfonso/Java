package ex1504;

public enum MenuOptions {
    TRANSACTION_RECORD(1),
    ACCOUNT_RECORD(2),
    END(3);
    private final int value;
    private MenuOptions(int option){
       this.value = option;
    }
}
