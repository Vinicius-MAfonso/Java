package pkg8.pkg6;
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
    private double savingsBalance;
    private static double annualInterestRate; //Armazena a taxa de juros anual
    
    public double calculateMonthlyInterest(){//Indica a quantidade que o polpador tem em depósito
        return savingsBalance = (savingsBalance*annualInterestRate)/12;
    }
}
