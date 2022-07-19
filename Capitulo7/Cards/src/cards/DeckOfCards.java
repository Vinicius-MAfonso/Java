package cards;
import java.security.SecureRandom;

public class DeckOfCards {
    //Array de objetos do tipo carta(por referência) para guardar o baralho
    private Card[] deck;
    //Variável de instância que indica a posição da carta(0 a 51)
    private int currentCard;
    //Número constante limite de cartas
    private static final int NUMBER_OF_CARDS = 52;
    //Gerador de número aleatório
    private static final SecureRandom randomNumbers = new SecureRandom();
    
    //Construtor que preenche o baralho com as cartas
    public DeckOfCards(){
        //Dois arrays com os valores e os naipes das cartas
        String[] faces = {"Às","Dois","Três","Quatro","Cinco","Seis","Sete","Oito",
            "Nove","Dez","Valete","Dama","Rei"};
        String[] suits = {"Copas","Ouro","Paus","Espadas"};
        //Atribui o tamanho do array ao array deck
        deck = new Card[NUMBER_OF_CARDS];
        //"Carta atual"
        currentCard = 0;
        //Preenche o baralho com objetos Card
        for(int count = 0;count < deck.length;count++){
            deck[count] = new Card(faces[count%13], suits[count / 13]);
        }
    }
    //Embaralha as cartas com um algoritmo de uma passagem
    public void shuffle(){
        //A próxima chamada para o método dealCard deve começar no deck[0] novamente
        currentCard = 0;
        //Para cada carta, seleciona outra aleatória e as compara
        for(int first = 0;first < deck.length; first++){
            //Seleciona um número aleatório entre 0 e 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            //Compara a carta atual com a aleatória selecionada
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp; 
        }
    }
    //Distribui uma carta
    public Card dealCard(){
        //Determina se ainda há cartas no baralho
        if(currentCard < deck.length){
            return deck[currentCard++];//Retorna a carta atual no array
        }
        else{
            return null;//Retorna nulo para indicar que todas as cartas foram distribuidas
        }
    }//Fim da classe
}
