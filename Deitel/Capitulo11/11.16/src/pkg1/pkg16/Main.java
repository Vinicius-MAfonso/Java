package pkg1.pkg16;

public class Main {

    public static void main(String[] args) throws ExceptionA{
        try{
            throwExceptionC();
        }catch(ExceptionA e){
            e.printStackTrace();
        }
    }
    public static void throwExceptionC() throws ExceptionA{
        try{
            throwExceptionB();
        }catch(ExceptionA e){
            throw e;
        }
        throw new ExceptionC();
    }
    public static void throwExceptionB() throws ExceptionA{
        throw new ExceptionB();
    }
}
