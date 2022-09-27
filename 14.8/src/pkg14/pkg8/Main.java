package pkg14.pkg8;

public class Main {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "GOODBYE";
        String s3 = "   spaces   ";
        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%n",s1,s2,s3);
        
        System.out.printf("Método replace de l por L: %s%n%n",s1.replace('l', 'L'));
        
        System.out.printf("s1.toUpperCase() = %s%n",s1.toUpperCase());
        System.out.printf("s2.toLowerCase() = %s%n%n",s2.toLowerCase());
        
        System.out.printf("s3.trim()) = %s%n%n", s3.trim());
        
        char[] charArray = s1.toCharArray();
        System.out.print("s1 as a character array = ");
        for(char currentChar : charArray){
            System.out.print(currentChar);
        }
        System.out.println("");
        
    }
    
}
