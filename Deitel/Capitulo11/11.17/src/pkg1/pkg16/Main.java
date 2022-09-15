package pkg1.pkg16;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ExceptionA{
       try{
           throw new ExceptionA();
       }catch(Exception e){
           e.printStackTrace();
       }
       try{
           throw new ExceptionB();
       }catch(Exception e){
           e.printStackTrace();
       }
       try{
           throw new NullPointerException();
       }catch(Exception e){
           e.printStackTrace();
       }
       try{
           throw new IOException();
       }catch(Exception e){
        e.printStackTrace();
       }
    }
}
