package pkg14.pkg2;

public class Main {

    public static void main(String[] args) {
        String s1 = "hello there";
        char[] charArray = new char[5];
        
        System.out.printf("s1: %s%n",s1);
        
        System.out.println("Length of s1: "+s1.length());
        System.out.println("The String reversed is: ");
        for (int i = s1.length() - 1; i >= 0; i--) {
            System.out.print(s1.charAt(i));
        }
        System.out.println("");
        s1.getChars(0, 5, charArray, 0);
        System.out.println("The character array is: ");
        for(char character : charArray)
            System.out.print(character);
        System.out.println("");
    }
    
}
