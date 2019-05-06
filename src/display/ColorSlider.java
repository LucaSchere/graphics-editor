package display;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorSlider extends JSlider {


    public ColorSlider(int min, int max){
        super(JSlider.VERTICAL, min, max,0);


    }

}
