public class Main {

    public static void main(String[] args) {
        int soma = 0;
            for(int i = 0;i < args.length;i++){
                try {
                    soma += (Double.parseDouble(args[i]));
                }catch (Exception e){
                }
            }
        System.out.println(soma);
    }
}