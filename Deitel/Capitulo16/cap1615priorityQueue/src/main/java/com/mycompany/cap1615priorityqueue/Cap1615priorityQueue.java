package com.mycompany.cap1615priorityqueue;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
public class Cap1615priorityQueue {

    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());//capacidade 11(padrão)
        
        //Insere elementos na fila
        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);
        
        System.out.print("Polling from queue: ");
        //Exibe os elementos na fila
        while(queue.size() > 0){
            System.out.printf("%.1f ", queue.peek());// Visualiza o elemento superior
            queue.poll();
        }
    }
}
