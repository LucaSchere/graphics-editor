package figuren;

import java.awt.*;
import java.io.Serializable;

public abstract class Figur implements Serializable {

    private static final long serialVersionUID = 1L;
    protected int x;
    protected int y;
    protected Figur(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void move(int deltaX, int deltaY){
        this.setX(this.getX()+deltaX);
        this.setY(this.getY()+deltaY);
    }
    public abstract void zeichne(Graphics2D g);


    @Override
    public String toString(){
        return "x:" + x + "\ny: " + y;
    }
}
