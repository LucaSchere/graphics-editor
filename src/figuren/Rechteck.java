package figuren;

import java.awt.*;
import java.io.Serializable;

public class Rechteck extends FigurMitFuellung implements Serializable {
    private static final long serialVersionUID = 1L;
    private int breite, hoehe;
    public Rechteck(int x, int y, Color rahmen, int staerke, Color fuellung, int breite, int hoehe){
        super(x,y, rahmen, staerke, fuellung);
        this.breite = breite;
        this.hoehe = hoehe;
    }


    public void zeichne(Graphics2D g){

        g.setColor(this.getFuellung());
        g.fillRect(this.getX(),this.getY(),this.getBreite(), this.getHoehe());
        g.setColor(this.getRahmen());
        g.setStroke(this.getStaerke());
        g.drawRect(this.getX(), this.getY(), this.getBreite(), this.getHoehe());
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int breite) {
        this.breite = breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    public void setHoehe(int hoehe) {
        this.hoehe = hoehe;
    }

    @Override
    public String toString(){
        return super.toString() + "\nbreite: "+breite + "\nhoehe: " + hoehe;
    }
}
