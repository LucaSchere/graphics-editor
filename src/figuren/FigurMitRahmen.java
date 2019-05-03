package figuren;

import java.awt.*;

public abstract class FigurMitRahmen extends Figur{
    Color rahmen;
    BasicStroke staerke;

    public FigurMitRahmen(int x, int y, Color rahmen, int staerke) {
        super(x, y);
        this.rahmen = rahmen;
        this.staerke = new BasicStroke(staerke);
    }

    public abstract void zeichne(Graphics2D g);

    public Color getRahmen() {
        return rahmen;
    }

    public BasicStroke getStaerke(){
        return staerke;
    }

    public void setRahmen(Color rahmen) {
        this.rahmen = rahmen;
    }
    public void setStaerke(int staerke){this.staerke  = new BasicStroke(staerke);}
}
