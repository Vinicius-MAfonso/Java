package pkg14.pkg6;

public class Main {

    public static void main(String[] args) {
       String letters = "abcdefghijklmabcdefghijklm";
        System.out.printf("Substring from index 20 to end is \"%s\"%n",
                letters.substring(20));
        System.out.printf("%s \"%s\"%n", "Substring from index 3 up to,"
                + "but not including 6",letters.substring(3,6));
    }
}
