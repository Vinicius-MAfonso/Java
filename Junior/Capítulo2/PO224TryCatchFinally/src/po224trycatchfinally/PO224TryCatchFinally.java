package po224trycatchfinally;

import java.io.*;

public class PO224TryCatchFinally {

    public static void main(String[] args) {
       InputStream recurso = null;
       try{
           recurso = new FileInputStream(args[0]);
           System.out.println("Arquivo "+args[0]+" Aberto");
       }catch(IOException e1){
           System.out.println(e1);
       }finally{
           if(recurso != null)try{
               recurso.close();
               System.out.println("Arquivo "+args[0]+" fechado");
           }catch(IOException e2){}
       }
               
    }
    
}
