package po214switch;

public class PO214Switch {

    public static void main(String[] args) {
        if(args.length > 0){
            switch(args[0].charAt(0)){
                case 'a', 'A' -> {
                    System.out.println("Letra 'A' maiuscula ou minuscula");
                }
                case 'e', 'E' -> {
                    System.out.println("Letra 'E' maiuscula ou minuscula");
                }
                case 'i', 'I' -> {
                    System.out.println("Letra 'I' maiuscula ou minuscula");
                }
                case 'o', 'O' -> {
                    System.out.println("Letra 'O' maiuscula ou minuscula");
                }
                case 'u', 'U' -> {
                    System.out.println("Letra 'U' maiuscula ou minuscula");
                }
                default -> {
                System.out.println("Não é uma vogal");
                } 
            }
        }else{
            System.out.println("Não há argumentos");
        }
    }
    
}
