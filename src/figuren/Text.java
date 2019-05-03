package figuren;

import java.awt.*;

public class Text extends Figur{
    private String string;
    private Font font;

    public Text(int x, int y, String string, String fontName, int fontStyle, int fontSize) {
        super(x, y);
        this.string = string;
        this.font = new Font(fontName, fontStyle, fontSize );
    }

    public void zeichne(Graphics2D g){
        g.setFont(this.getFont());
        g.drawString(this.getString(),this.getX(), this.getY());
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }
}
