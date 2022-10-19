package com.mycompany.ex1502e;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
O registro é um objeto da classe TransactionRecord
— utilize a variável Scanner inTransaction. 
Suponha que essa classe TransactionRecord contenha o método setAccount
(que recebe um int) para configurar o número de conta e o método setAmount (que recebe um double) 
a fim de estabelecer o valor monetário da transação.
*/
public class Ex1502E {
private static Scanner inTransaction;
private static TransationRecord record = new TransationRecord(0, 0);
    public static void main(String[] args) {
        openFile();
        readFile();
        closeFile();
        System.out.println(record);
        
    }
    private static void openFile(){
        try{
            inTransaction = new Scanner(Paths.get("trans.txt"));
        }catch(IOException ioe){
            System.err.println(ioe);
            System.exit(1);
        }
    }
    private static void readFile(){
        try{
            record.setAccount(inTransaction.nextInt());
            record.setAmount(inTransaction.nextDouble());
        }catch(InputMismatchException exception){
            System.err.println(exception);
            System.exit(1);
        }
        
        
    }
    private static void closeFile(){
        try{
            inTransaction.close();
        }catch(Exception e){
            System.err.println(e);
            System.exit(1);
        }
    }
}
