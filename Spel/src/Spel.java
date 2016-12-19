    import javax.swing.*;
    import java.awt.*;

    public class Spel extends JPanel {
    Ball ball = new Ball(this);
    
    private void move(){
        ball.move(); 
    
    }
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        ball.paint(g2d);   
    }

    public static void main(String[] args) {
        
        
        
        JFrame frame = new JFrame();
        Spel spel = new Spel();

        frame.setSize(700, 800); // x y 
        frame.setLocation(300, 200);
        frame.setDefaultCloseOperation(3);
        frame.add(spel);
        frame.setTitle("Mitt Spel");
        frame.setResizable(false);
        frame.setVisible(true);

        while (true) {
            spel.move();
            spel.repaint();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
