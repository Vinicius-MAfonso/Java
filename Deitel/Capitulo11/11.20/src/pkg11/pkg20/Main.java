package pkg11.pkg20;

public class Main {
    
    public static void main(String[] args) {
        try{
            someMethod();
        }catch(Exception e){
            StackTraceElement[] stackTraceElements = e.getStackTrace();
            for(StackTraceElement indice : stackTraceElements){
                System.err.println(indice);
            }
        }
    }
    public static void someMethod() throws Exception{
        try{
            someMethod2();
        }catch(Exception e){
            throw e;
        }
    }
    public static void someMethod2() throws Exception{
        throw new Exception();
    }
}
