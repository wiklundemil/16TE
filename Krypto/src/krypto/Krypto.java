
package krypto;
import java.util.Scanner;
import java.awt.Graphics;
import javax.swing.*;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.*;


public class Krypto extends JPanel {

    int Höjdrect = 100;
    int Breddrect = 100;
    int StorlekSmall = 17;   
    static  Scanner playerInput = new Scanner(System.in);
    
   	static int krypto[][] = new int[][]{
		{1,2,3,3,3},
		{2,3,4,15,1},
		{13,4,5,1,2},
		{14,5,1,2,3},
		{5,1,2,3,4}};
        
       static  char nyckel[] = new char[26];

    
    public void paint(Graphics g) {
        
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                
                g.drawRect(x * Höjdrect, y * Breddrect, Höjdrect, Breddrect);
                g.setFont(new Font("", 0, StorlekSmall));       
                g.drawString(String.valueOf(krypto[y][x]), x * Breddrect + 3, y * Höjdrect + StorlekSmall);
                g.drawString(String.valueOf(nyckel[krypto[y][x]]), x * Breddrect +50, y * Höjdrect + 50 );   
            
        }
    }
}
    
    public static void main(String[] args) {
    JFrame frame = new JFrame();
    while(true){
    
    frame.setSize(506, 650);
    frame.setDefaultCloseOperation(3);
    frame.setTitle("Krypto");
    frame.add(new Krypto());
    frame.setResizable(false);
    frame.setVisible(true);
        
    System.out.println("Skriv in en siffra gör ett mellansslag och tryck in en bokstav.");
    System.out.println("Fortsätt deklarera bokstäver tills alla rutor är i fyllda.");
   // try {
       int bytut = playerInput.nextInt();
    /*}
    catch (Exception e) {
        System.out.println("Skriv in en siffra!");
    }*/
    char bytuttill = playerInput.nextLine().charAt(1);
    
    nyckel[bytut] = bytuttill;

    
}  
}
}