package figuren;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Gruppe extends Figur {

    private List<Figur> figuren;

    public Gruppe(int x, int y){
        super(x, y);
        this.figuren = new ArrayList<Figur>();
    }

    public void hinzufuegen(Figur f){
        f.move(this.x, this.y);
        figuren.add(f);
    }

    public void loeschen(Figur f){
        f.move(-this.x, -this.y);
        figuren.remove(f);
    }

    public void zeichne(Graphics2D g){
        for(Figur f : getFiguren()){
            f.zeichne(g);
        }
    }

    public List<Figur> getFiguren(){
        return this.figuren;
    }
}
