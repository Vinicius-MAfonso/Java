package pkg14.pkg11;

public class Main {

    public static void main(String[] args) {
        StringBuilder buffer = new StringBuilder("Hello, how are you?");
        System.out.printf("buffer = %s%nlength = %d%ncapacity = %d%n",
                buffer.toString(),buffer.length(),buffer.capacity());
        buffer.ensureCapacity(75);
        buffer.setLength(10);
        System.out.printf("New capacity = %d%nNew length = %d%n",
                buffer.capacity(),buffer.length());
    }
    
}
