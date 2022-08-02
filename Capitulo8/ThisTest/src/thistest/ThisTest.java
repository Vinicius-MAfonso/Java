package thistest;
//this utilizado implicita e explicitamente para referencia a membros do objeto
public class ThisTest {

    public static void main(String[] args) {
        SimpleTime time = new SimpleTime(15,30,19);
        System.out.println(time.buildString());
    }
}//Fim da classe thisTest
class SimpleTime{
        private int hour;
        private int minute;
        private int second;
        //Se o construtor utilizar nomes de parametros identicos
        //a nomes de variáveis de instância a refêrencia "this" será exigirda
        //para distinguir entre os nomes
        public SimpleTime(int hour, int minute, int second){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        //Utilizam "this" explicito e implicito para chamar toUniversalString
        public String buildString(){
            return String.format("%24s: %s%n%24s: %s",
                    "this.toUniversalString()",this.toUniversalString(),
                    "toUniversalString()",toUniversalString());
        }
        //Converte em String no formato de data/hora universal(hh:mm:ss)
        public String toUniversalString(){
            //"this" não é requerido aqui para acessar variáveis de instancia,
            //porque o método não tem variáveis locais com os mesmos nomes
            //que as variáveis de instância
            return String.format("%02d:%02d:%02d", this.hour,this.minute,this.second);
        }
}//Fim da classe
