package po216switchexpression;
import java.util.*;
public class PO216SwitchExpression {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite nº do mês");
        int mes = s.nextInt();
        //Switch expression
        int ndias = switch(mes){
            case 1,3,5,7,10,12 -> 31;
            case 4,6,9,11 -> 30;
            default -> 28 + (Calendar.getInstance().get(Calendar.YEAR)%4 == 0?1 : 0);
        };
        System.out.printf("Mes # %d tem %d dias.%n",mes,ndias);
        //Uso yield
        String descricao = "fem";
        var sexo = switch(descricao.toUpperCase()){
            case "F","FEM","FEMININO" -> {
                yield 1;
            }
            case "M","MASC","MASCULINO" -> {
                yield 2;
            }
            default ->{
                throw new RuntimeException("Fora do padrão");   
            }
        };
        
    }
    
}
