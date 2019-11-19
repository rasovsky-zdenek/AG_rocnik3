/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cviceni;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author ag
 */
public class Canvas implements ActionListener {
    private static Canvas instanceCanvas;
    private final JPanel CANVAS;
    private Timer timer;

    private Canvas(JPanel canvas) {
        this.CANVAS = canvas;
        setCanvas();
        timer = new Timer(20,this);
        timer.start();
    }
    
    static Canvas prepareCanvas(JPanel canvas){
        if(instanceCanvas == null){
            instanceCanvas = new Canvas(canvas);
        }
        return instanceCanvas;
    }
    
    private void setCanvas() {
        System.out.println("Šířka: " + CANVAS.getWidth());
        System.out.println("Výška: " + CANVAS.getHeight());
        CANVAS.requestFocus();
    }

    public int getWidth() {
        return CANVAS.getWidth();
    }
    
    public int getHeight() {
        return CANVAS.getHeight();
    }
    
    public void requestFocus(){
        CANVAS.requestFocus();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        CANVAS.repaint();
    }
    
    public int getTimerDelay(){
        return timer.getDelay();
    }
}
