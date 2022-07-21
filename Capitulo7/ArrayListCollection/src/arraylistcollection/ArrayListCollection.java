package arraylistcollection;
import java.util.ArrayList;

public class ArrayListCollection {
    public static void main(String[] args) {
        //Cria um arraylist de strings com uma capacidade inicial de 10
        ArrayList<String> items = new ArrayList<String>();
        
        items.add("red");//Anexa um item na lista
        items.add(0,"yellow");//Insere "Yellow" no indice 0
        
        //Cabeçalho
        System.out.print("Display list contents with counter-controlled loop:");
        
        //Exibe as cores na lista
        for(int i = 0; i < items.size(); i++){
            System.out.printf(" %s", items.get(i));
        }
        //Exibe as cores usando for aprimorada no método display
        display(items, "%nDisplay list contents with enhanced for statement:"); 
        
        items.add("green");//Adiciona "green" ao fim da lista
        items.add("yellow");//Adiciona "yellow" ao fim da lista
        display(items, "List with two new elements:");
        
        items.remove(1);// Remove o item no indice 1
        display(items, "Remove secont list element(green):");
        //Verifica se um valor está na lista
        System.out.printf("\"red\" is %sin the list%n",
        items.contains("red") ? "": "not ");
        //Exibe o número de elementos na List
        System.out.printf("Size %s%n", items.size());  
    }
    //Exibe os elementos do ArrayList no console
    public static void display(ArrayList<String> items, String header){
        System.out.printf(header);//Exibe o cabeçalho
        //Exibe cada elemento em itens
        for(String item: items){
            System.out.printf(" %s", item);
        }
        System.out.println();
    }
}
