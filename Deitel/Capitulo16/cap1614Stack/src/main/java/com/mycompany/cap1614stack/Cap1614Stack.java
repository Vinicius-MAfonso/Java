package com.mycompany.cap1614stack;
import java.util.Stack;
import java.util.EmptyStackException;

public class Cap1614Stack {

    public static void main(String[] args) {
        Stack<Number> stack = new Stack<>();
        
        stack.push(12L);//Insere o valor long 12L
        System.out.println("Pushed 12L");
        printStack(stack);
        stack.push(34567);//Insere o valor long 34567
        System.out.println("Pushed 34567");
        printStack(stack);
        stack.push(1.0F);//Insere o valor float 1.0F
        System.out.println("Pushed 1.0F");
        printStack(stack);
        stack.push(1234.5678);//Insere o valor long 1234.5678
        System.out.println("Pushed 1234.5678");
        printStack(stack);
        try{
            Number removedObject = null;
            
            //Remove elementos da pilha
            while(true){
                removedObject = stack.pop();
                System.out.printf("Popped %s%n",removedObject);
                printStack(stack);
            }
        }catch(EmptyStackException ese){
            ese.printStackTrace();
        }
    }
    public static void printStack(Stack<Number> stack){
        if(stack.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.printf("Stack contains: %s (top)%n", stack);
            
    }
}
