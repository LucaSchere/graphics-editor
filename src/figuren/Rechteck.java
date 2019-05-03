package figuren;

import java.awt.*;

public class Rechteck extends FigurMitFuellung {
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
}
