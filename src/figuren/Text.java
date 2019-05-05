package figuren;

import java.awt.*;

public class Text extends Figur{
    private String string = "Text";
    private Font font = new Font("TimesRoman", Font.PLAIN, 20);

    public Text(int x, int y, String string) {
        super(x, y);
        this.string = string;
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
