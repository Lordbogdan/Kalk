import java.io.*;
import java.util.Scanner;

public class Kalku{

    //private static People Bogdan;

    public static void main (String [] args){
        People Bogdan = new People ("Bogdan", 23);
        Man Lord = new Man(90);
        Esle cyka = new Esle ();
        }
}

 class People {
Scanner ol = new Scanner (System.in);
    String name = ol.nextLine();

    int vvod = ol.nextInt();
    int [] myArray = new int[vvod];

     public People(String bogdan, int i) {
         System.out.println("Whats are him name?");
         System.out.println(name);
         System.out.println("Whats are him age?");
         System.out.println(myArray.length);

     }
}

   class Man {
    public Man(int o){
        int[] array = new int[1];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 3));
            System.out.println(array[i]);
        }
    }
  }

   class Esle extends Man {


       public Esle(int o) {

       }
   }