package figuren;

import java.awt.*;

public abstract class FigurMitFuellung extends FigurMitRahmen {
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
}
