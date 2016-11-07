
import javax.swing.*;
import java.awt.*;


public class Spel extends JPanel {

    private int width = 100;
    private int heigth = 100;
    private int d = 50;
    private int x = 0;
    private int y = 0;
    private int moveX = 1;
    private int moveY = 1;
    Color ballColor = new Color(0xE7AC0);

    private void moveBall() {
        if(x + moveX <= 0)
            moveX = 1;
        if( x + moveX > getWidth()-d)
            moveX = -1;
        if(y + moveY <=0)
            moveY = 1;
        if(y + moveY > 800 - 85)
            moveY = -1;
        
        x += moveX;
        y += moveY;
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d = (Graphics2D) g;
        g2d.setColor(ballColor);
        g2d.fillOval(x, y, d, d);
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
            spel.moveBall();
            spel.repaint();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
