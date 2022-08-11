package pkg8.pkg6;

import java.math.BigDecimal;

/*
para indicar a quantidade que o poupador atualmente tem em depósito. 
Forneça o método calculateMonthlyInterest para calcular
os juros mensais multiplicando o savingsBalance por annualInterestRate 
dividido por 12 — esses juros devem ser adicionados
ao savingsBalance. Forneça um método static modifyInterestRate que 
configure o annualInterestRate com um novo
valor. Escreva um programa para testar a classe SavingsAccount. 
Instancie dois objetos savingsAccount, saver1 e saver2, com
saldos de R$ 2.000,00 e R$ 3.000,00, respectivamente. 
Configure annualInterestRate como 4% e então calcule o juro mensal de cada
um dos 12 meses e imprima os novos saldos para os dois poupadores. 
Em seguida, configure annualInterestRate para 5%, calcule a
taxa do próximo mês e imprima os novos saldos para os dois poupadores.
*/
public class SavingAccount {
    private double savingsBalance; //Quantidade que cada poupador tem em depósito
    private static double annualInterestRate; //Armazena a taxa de juros anual
    
    public SavingAccount(double savingsBalance){
        if(savingsBalance < 0){
            throw new IllegalArgumentException("Só é permitido valores poisitivos!");
        }
        this.savingsBalance = savingsBalance;
    }
    public double calculateMonthlyInterest(){//Indica a quantidade que o polpador tem em depósito
        return (getSavingsBalance()*getAnnualInterestRate())/12;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double aAnnualInterestRate) {
        annualInterestRate = aAnnualInterestRate/100;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
}
