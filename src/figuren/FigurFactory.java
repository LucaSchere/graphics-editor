package figuren;

import java.awt.*;

public class FigurFactory {


    public static Figur baue(Character figurTyp,int x1, int y1, int x2, int y2, Color fuellung, Color rahmen, int staerke){
        switch (figurTyp){
            case 'r':
                int x1r, y1r;
                if(x1 > x2){
                    x1r = x2;
                    y1r = y2;
                    if(y1 < y2){
                        x1r = x2;
                        y1r = y1;
                    }
                }else{
                    x1r = x1;
                    y1r = y1;
                    if(y2 < y1){
                        x1r = x1;
                        y1r = y2;
                    }
                }
                return new Rechteck(x1r, y1r, rahmen, staerke, fuellung, Math.abs(x1-x2), Math.abs(y1-y2));

            case 'd':
                return new Dreieck(x1, y1, x1, y2, x2, y2, rahmen, staerke, fuellung);

            case 'o':
                int x1o, y1o;
                if(x1 > x2){
                    x1o = x2;
                    y1o = y2;
                    if(y1 < y2){
                        x1o = x2;
                        y1o = y1;
                    }
                }else{
                    x1o = x1;
                    y1o = y1;
                    if(y2 < y1){
                        x1o = x1;
                        y1o = y2;
                    }
                }
                return new Oval(x1o, y1o, rahmen, staerke, fuellung, Math.abs((y1-y2)/2), Math.abs((x1-x2)/2));

            case 't':
                return new Text( x1, y1, "Text");

            default:
                return new Linie( x1, y1, rahmen, staerke, x2, y2);

        }
    }
}
