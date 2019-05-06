package control;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FigurKeyAdapter extends KeyAdapter {

    EditorControl ec;
    public FigurKeyAdapter(EditorControl ec){
        this.ec = ec;
    }
    @Override
    public void keyTyped(KeyEvent e) {
        super.keyTyped(e);
        if(e.getKeyChar()== 'r' || e.getKeyChar()== 'd' || e.getKeyChar()== 'o' || e.getKeyChar()== 't' || e.getKeyChar()== 'l'){
            ec.setFigurTyp(e.getKeyChar());
        }
    }
}
