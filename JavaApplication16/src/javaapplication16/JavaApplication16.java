
package javaapplication16;
import java.util.Scanner;
public class JavaApplication16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int spelare;
        
    System.out.println("Vällk");
  
    //DINA VAL
  
    Scanner Tangentbord = new Scanner(System.in);
    System.out.print("Välj en siffra: ");
    spelare = Tangentbord.nextInt();
    System.out.println(spelare +1);
    
}}