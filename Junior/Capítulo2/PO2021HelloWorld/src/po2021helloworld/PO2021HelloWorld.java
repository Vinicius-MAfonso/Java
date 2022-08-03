package po2021helloworld;

public class PO2021HelloWorld {

    public static void main(String[] args) {
        float k = 19.5f;//Variavel float iniciada com valor apropriado
        /*
        Declaração de duas variáveis.
        Uma é inicializada com um valor arbitrário e a outra recebe
        o dobro da primeira
        */
        double a = 10.3;
        double b = 2*a;
        /*
        Comentário de documentação
        **/
        String multiLine = """
                           Se ela disser que me ama, eu vou mudar de vida
                           Me chama de vida pra tu ver
                           Se eu não te faço feliz como ninguém fez
                           Ainda, bebê (bebê)
                           """;
        System.out.println(multiLine);
        System.out.println("Hello world!");
        int i = 5;
        {
            int j = 0;
            System.out.println(i);
            j = 5 * i;
            System.out.println(j);
        }
        System.out.println(i);
//        System.out.println(j);//não funcioa pois está fora do escopo
    }
    
}
