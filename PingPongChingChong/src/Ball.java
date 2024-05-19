import java.awt.*;
import java.util.Random;

public class Ball extends Rectangle {
    Random random;
    int Xvelocity; //toc do trai - phai
    int Yvelocity; // toc do len - xuong
    int initSpeed = -2;
    Ball(int x, int y, int width,int height){
        super(x,y,width,height);
        random = new Random();
        int randXDir = random.nextInt(2);
        if(randXDir == 0){
            randXDir --;
        }
        setXDir(randXDir*initSpeed);
        int randYDir = random.nextInt(2);
        if(randYDir == 0){
            randYDir --;
        }
        setYDir(randYDir*initSpeed);

    }
    public void setXDir(int randXDir){
        Xvelocity = randXDir;

    }
    public void setYDir(int randYdir){
        Yvelocity = randYdir;

    }
    public void move(){
        x+=Xvelocity;
        y+=Yvelocity;
    }
    public void draw(Graphics g){
        g.setColor(Color.YELLOW);
        g.fillOval(x,y,width,height);

    }
}
