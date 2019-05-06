package control;

import display.EditorPanel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FigurMouseAdapter extends MouseAdapter {


    EditorControl ec;
    EditorPanel ep;
    public FigurMouseAdapter(EditorControl ec, EditorPanel panel){
        this.ec = ec;
        this.ep = panel;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.ec.setErsterPunkt(e.getPoint());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.ec.erzeugeFigurMitZweitemPunkt(e.getPoint());
        this.ep.repaint();
    }

}
