package addition;

import java.util.Scanner; //Utiliza a classe Scanner
        
public class Addition {


    public static void main(String[] args) { //Método main inicia a execução do Java
        
        Scanner input = new Scanner(System.in); //Cria um sacnner para obter a entrada
        
        System.out.print("Digite o primeiro número: ");
        int number1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int number2 = input.nextInt();
        boolean condicao = number1 == number2;                          
        if(condicao){
            System.out.print("Os números são iguais");
        }else{
            System.out.print("Os números são diferentes!");
        }
//Fim do Main
    
    }//Fim da classe Addition
}