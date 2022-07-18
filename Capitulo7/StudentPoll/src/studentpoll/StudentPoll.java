package studentpoll;

public class StudentPoll {
    
    public static void main(String[] args) {
    int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3 ,15, 2, 14};   
    int[] frequency = new int[6]; // Array de contadores de frequencia
    
        for (int answer = 0; answer < responses.length; answer++) {
            try{
                ++frequency[responses[answer]];
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.printf("Responses[%d] = %d%n%n", answer,responses[answer]);
            }
        }
        System.out.printf("%s%10s%n", "Rating","Frequency");
        for (int i = 0; i < frequency.length; i++) {
            System.out.printf("%6d%10d%n",i,frequency[i]);
        }
    
    }
    
}
