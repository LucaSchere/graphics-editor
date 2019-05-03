package figuren;

import java.awt.*;
import java.io.Serializable;

public class Rahmen extends BasicStroke implements Serializable {

    private int breite;

    public Rahmen(int breite){
        super(breite);
        this.breite = breite;

    }

    @Override
    public String toString(){
        return "Breite:" + this.breite;
    }

}
