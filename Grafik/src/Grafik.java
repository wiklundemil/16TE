
import javax.swing.*;
import java.awt.*;

public class Grafik extends JPanel {

 Ball ball = new Ball(this); FORTSÄTT PÅ 5:00 I VIDEON
    
    public void paint(Graphics g) {
        super.paint(g);
       
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Grafik grafik = new Grafik();

        frame.setSize(700, 800); // x y 
        frame.setLocation(300, 200);
        frame.setDefaultCloseOperation(3);
        frame.add(grafik);
        frame.setTitle("Mitt Spel");
        frame.setResizable(false);
        frame.setVisible(true);

        while (true) {
            grafik.moveBall();
            grafik.repaint();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
