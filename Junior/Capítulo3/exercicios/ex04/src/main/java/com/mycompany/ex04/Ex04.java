package com.mycompany.ex04;

public class Ex04 {

    public static void main(String[] args) {
        Quadrado q1 = new Quadrado();
        q1.setLado(1.5);
        Quadrado q2 = new Quadrado(1.5);
        
        System.out.printf("A área de q1 é %.2f%n", q1.area());
        System.out.printf("A área de q2 é %.2f%n", q1.area());
        
        Circulo c1 = new Circulo();
        c1.setRaio(1.5);
        Circulo c2 = new Circulo(1.5);
        
        System.out.printf("A área de c1 é %.2f%n", c1.getArea());
        System.out.printf("A área de c2 é %.2f%n", c2.getArea());
        
    }
}
