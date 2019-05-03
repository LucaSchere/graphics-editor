package figuren;

import java.awt.*;

public class Dreieck extends FigurMitFuellung {
    int[] xCoords, yCoords;
    public Dreieck(int x, int y,int x2, int y2, int x3, int y3, Color rahmen, int staerke, Color fuellung){
        super(x,y, rahmen, staerke, fuellung);
        this.xCoords = new int[]{x, x2, x3};
        this.yCoords = new int[]{y, y2, y3};
    }

    public void zeichne(Graphics2D g){

        g.setColor(this.getFuellung());
        g.fillPolygon(this.getxCoords(), this.getyCoords(), 3);
        g.setColor(this.getRahmen());
        g.setStroke(this.getStaerke());
        g.drawPolygon(this.getxCoords(), this.getyCoords(), 3);
    }


    public int[] getxCoords() {
        return xCoords;
    }

    public void setxCoords(int[] xCoords) {
        this.xCoords = xCoords;
    }

    public int[] getyCoords() {
        return yCoords;
    }

    public void setyCoords(int[] yCoords) {
        this.yCoords = yCoords;
    }
}
