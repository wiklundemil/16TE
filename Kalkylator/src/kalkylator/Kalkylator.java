
package kalkylator;

import java.util.Scanner;
public class Kalkylator {
       public static void main(String args[]){
           Scanner Tangentbord = new Scanner(System.in);
           double tal1, tal2, answer;
           System.out.println("skriv en siffra: ");
           tal1 = Tangentbord.nextDouble();
           System.out.println("skriv en till siffra: ");
           tal2 = Tangentbord.nextDouble();
           answer = tal1 + tal2;
           System.out.println(answer);
    }
}
