package figuren;

import java.awt.*;
import java.io.Serializable;

public abstract class FigurMitFuellung extends FigurMitRahmen implements Serializable {
    protected Color fuellung;

    public FigurMitFuellung(int x, int y, Color rahmen, int staerke, Color fuellung) {
        super(x, y, rahmen, staerke);
        this.fuellung = fuellung;
    }

    public abstract void zeichne(Graphics2D g);

    public Color getFuellung() {
        return fuellung;
    }

    public void setFuellung(Color fuellung) {
        this.fuellung = fuellung;
    }

    @Override
    public String toString(){
        return super.toString() + "\nfuellung: " + fuellung.toString();
    }
}
