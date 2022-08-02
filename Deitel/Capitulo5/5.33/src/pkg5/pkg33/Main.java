package pkg5.pkg33;
//M = C(1+i)^t
//C = 1Bilhão
//M = 500 Mi
//I = 0.04
//T = ?
public class Main {


    public static void main(String[] args) {
      double usuarios = 1;
      double montante;
      double taxa = 0.04;
      int tempo = 0;

      
      while(usuarios <= 2){
        montante = usuarios * taxa;
        usuarios += montante;
        tempo++;
        System.out.printf("%5s %27s%n","Mês","Usuarios");
        System.out.printf("%5d%25.2f Bi%n",tempo,usuarios);
      }
    }
}
