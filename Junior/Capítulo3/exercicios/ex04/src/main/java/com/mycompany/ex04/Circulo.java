package com.mycompany.ex04;

public class Circulo {
   private double raio;
   public Circulo(){}
   public Circulo(double raio){
       this.raio = raio;
   }
   public void setRaio(double raio){
       this.raio = raio;
   }
   public double getArea(){
       return Math.PI * (Math.pow(raio, 2));
   }
   
}
