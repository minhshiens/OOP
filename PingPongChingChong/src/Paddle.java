import java.awt.*;
import java.awt.event.*;

public class Paddle extends Rectangle{

    int id;
    int Yvelocity;
    int speed = 10;

    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id){
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
        this.id=id;
    }

    public void Keypressed(KeyEvent e) {
        switch(id) {
            case 1:
                if(e.getKeyCode()==KeyEvent.VK_W) {
                    setYDir(-speed);
                }
                if(e.getKeyCode()==KeyEvent.VK_S) {
                    setYDir(speed);
                }
                break;
            case 2:
                if(e.getKeyCode()==KeyEvent.VK_UP) {
                    setYDir(-speed);
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN) {
                    setYDir(speed);
                }
                break;
        }
    }
    public void KeyReleased(KeyEvent e) {
        switch(id) {
            case 1:
                if(e.getKeyCode()==KeyEvent.VK_W) {
                    setYDir(0);
                }
                if(e.getKeyCode()==KeyEvent.VK_S) {
                    setYDir(0);
                }
                break;
            case 2:
                if(e.getKeyCode()==KeyEvent.VK_UP) {
                    setYDir(0);
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN) {
                    setYDir(0);
                }
                break;
        }
    }
    public void setYDir(int yDir) {
        Yvelocity = yDir;
    }
    public void move() {
        y= y + Yvelocity;
    }
    public void draw(Graphics g) {
        if(id==1)
            g.setColor(Color.blue);
        else
            g.setColor(Color.red);
        g.fillRect(x, y, width, height);
    }
}