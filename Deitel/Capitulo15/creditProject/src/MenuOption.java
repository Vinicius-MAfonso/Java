//Opções do programa de consulta de crédito
public enum MenuOption {
    ZERO_BALANCE(1), //Exibe as contas com saldo ZERO
    CREDIT_BALANCE(2), //Exibe as contas com saldos credores
    DEBIT_BALANCE(3), //Exibe as contas com saldos devedores
    END(4); //Encerra a execução do programa
    private final int value;//Opção atual do menu
    private MenuOption(int i) {
        this.value = i;
    }
}
