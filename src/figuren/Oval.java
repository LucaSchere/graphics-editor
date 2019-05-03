package figuren;

import java.awt.*;

public class Oval extends FigurMitFuellung {
    private int radiusV, radiusH;

    public Oval(int x, int y,Color rahmen, int staerke, Color fuellung , int radiusV, int radiusH) {
        super(x, y, rahmen, staerke, fuellung);
        this.radiusV = radiusV;
        this.radiusH = radiusH;
    }

    public void zeichne(Graphics2D g){
        g.setColor(this.getFuellung());
        g.fillOval(this.getX(),this.getY(),this.getRadiusH()*2,this.getRadiusV()*2);
        g.setColor(this.getRahmen());
        g.setStroke(this.getStaerke());
        g.drawOval(this.getX(),this.getY(),this.getRadiusH()*2,this.getRadiusV()*2);
    }

    public int getRadiusV() {
        return radiusV;
    }

    public void setRadiusV(int radiusV) {
        this.radiusV = radiusV;
    }

    public int getRadiusH() {
        return radiusH;
    }

    public void setRadiusH(int radiusH) {
        this.radiusH = radiusH;
    }
}
