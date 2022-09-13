package pkg11.pkg6;

public class Main {

    public static void main(String[] args) {
        try{
            method1();
        }catch(Exception exception){//Captura a exceção lançada em method1();
            System.err.printf("%s%n%n",exception.getMessage());
            
            //Obtém informações de rastreamento da pilha
            StackTraceElement[] traceElements = exception.getStackTrace();
            System.out.printf("%nStack trace from getStackTrace: %n");
            System.out.println("Class\t\tFile\t\t\tLine\tMethod");
            //faz um loop por traceElements para obter a descrição da exceção
            for(StackTraceElement element : traceElements){
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf("%s%n", element.getMethodName());
            }
        }
    }
    public static void method1() throws Exception{
        method2();
    }
    public static void method2() throws Exception{
        method3();
    }
    public static void method3() throws Exception{
        throw new Exception("Exception thrown in method3");//Não está no bloco try, então ocorre o desempilhamento
        //em seguida o controle retorna ao método 2, que por desempilhamento retorna ao método 1
    }
    
    
}
