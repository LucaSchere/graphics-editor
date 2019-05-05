package figuren;

import java.awt.*;
import java.io.Serializable;

public abstract class FigurMitRahmen extends Figur implements Serializable {
    Color rahmen;
    int staerke;

    public FigurMitRahmen(int x, int y, Color rahmen, int staerke) {
        super(x, y);
        this.rahmen = rahmen;
        this.staerke = staerke;
    }

    public abstract void zeichne(Graphics2D g);

    public Color getRahmen() {
        return rahmen;
    }

    public int getStaerke(){
        return staerke;
    }

    public void setRahmen(Color rahmen) {
        this.rahmen = rahmen;
    }
    public void setStaerke(int staerke){this.staerke  = staerke;}

    @Override
    public String toString(){
        return super.toString() +"\nrahmen: " +rahmen.toString() + "\nstaerke: "+staerke;
    }
}
