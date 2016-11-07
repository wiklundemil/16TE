import java.awt.*;

public class Ball {
    
    private int d = 50;
    private int x = 0;
    private int y = 0;
    private int moveX = 1;
    private int moveY = 1;
    Color ballColor = new Color(0xE7AC0);
    Spel spel;
    
        public Ball(Spel spel){
            this.spel = spel; 
        }
    
    private void moveBall() {
        if(x + moveX <= 0)
            moveX = 1;
        if( x + moveX > spel.getWidth()-d)
            moveX = -1;
        if(y + moveY <=0)
            moveY = 1;
        if(y + moveY > 800 - 85)
            moveY = -1;
        
        x += moveX;
        y += moveY;
    }
    public void paint (Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d = (Graphics2D) g;
        g2d.setColor(ballColor);
        g2d.fillOval(x, y, d, d);
    }
        
        
}
 
    
    
    


