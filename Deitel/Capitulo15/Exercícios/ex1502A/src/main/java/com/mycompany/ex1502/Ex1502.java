package com.mycompany.ex1502;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Formatter;
public class Ex1502 {
    private static Scanner inOldMaster;
    private static Formatter outNewMaster;
    public static void main(String[] args) throws IOException {
        openFileOldMaster();
        closeFileOldMaster();
        openFileNewMast();
        closeFileNewMast();
    }
    private static void openFileOldMaster(){
        try{
            inOldMaster = new Scanner(Paths.get("oldmast.txt")); 
            System.out.println("Arquivo aberto com sucesso");
        }catch(IOException ioe){
            System.err.println(ioe);
        }
    }
    private static void closeFileOldMaster(){
        try{
            inOldMaster.close();
            System.out.println("Arquivo fechado");
        }catch(Exception e){
            System.err.println(e);
        }
    }
    private static void openFileNewMast(){
        try {
            outNewMaster = new Formatter("newmast.txt");
            System.out.println("Arquivo aberto com sucesso");
        } catch (FileNotFoundException ex) {
            System.err.println(ex);
        }
    }
    private static void closeFileNewMast(){
         try{
            outNewMaster.close();
            System.out.println("Arquivo fechado");
        }catch(Exception e){
            System.err.println(e);
        }
    }
}
