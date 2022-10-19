package com.mycompany.ex1502f;
import java.io.FileNotFoundException;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Formatter;
import java.util.Scanner;

//f) Escreva uma instrução que gera a saída de um registro para o arquivo 
//"newmast.txt". O registro é um objeto do tipo Account — utilize a variável Formatter outNewMaster.
public class Ex1502F {
private static Scanner input = new Scanner(System.in);
private static Formatter outNewMaster;
    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();
    }
    private static void openFile(){
        try{
            outNewMaster = new Formatter("newmast.txt");
        }catch(SecurityException securityException){
            System.err.println("Write permission denied. terminating.");
            System.exit(1);
        }
        catch (FileNotFoundException fileNotFoundException){
            System.err.println("Error opening file. Terminating.");
            System.exit(1);
        }
    }
    private static void addRecords(){
        try{
            while(input.hasNext()){
                System.out.println("Insira um nome, e um digito da conta");
                System.out.print("Nome:");
                outNewMaster.format("Nome: %s%n", input.next());
                System.out.print("Digito:");
                outNewMaster.format("Digito: %d", input.nextInt());
            }
            System.out.println("-=-=-=-=-=-=-");
        }catch(FormatterClosedException | NoSuchElementException closedException){
            System.err.println(closedException);
            System.exit(1);
        }
    }
    private static void closeFile(){
        try{
            outNewMaster.close();
        }catch(Exception e){
            System.err.println(e);
            System.exit(1);
        }
    }
}
