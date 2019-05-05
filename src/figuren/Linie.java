package figuren;


import java.awt.*;

public class Linie extends FigurMitRahmen {
    private int x2, y2, staerke;

    public Linie(int x, int y, Color rahmen, int staerke, int x2, int y2) {
        super(x, y, rahmen, staerke);
        this.x2 = x2;
        this.y2 = y2;
        this.staerke = staerke;
    }
    @Override
    public void move(int deltaX, int deltaY){
        super.move(deltaX, deltaY);
        this.setX2(this.getX2() + deltaX);
        this.setY2(this.getY2() + deltaY);
    }

    public void zeichne(Graphics2D g){
        g.setStroke(new BasicStroke(this.getStaerke()));
        g.setColor(this.getRahmen());
        g.drawLine(this.getX(), this.getY(), this.getX2(), this.getY2());
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

}
