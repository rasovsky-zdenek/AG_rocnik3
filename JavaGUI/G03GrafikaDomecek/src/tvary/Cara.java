/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvary;

import java.awt.Graphics2D;

/**
 *
 * @author rasovsky
 */
public class Cara implements Tvar {
    private Bod bodX;
    private Bod bodY;

    public Cara(Bod bodX, Bod bodY) {
        this.bodX = bodX;
        this.bodY = bodY;
    }

    public Bod getBodX() {
        return bodX;
    }

    public Bod getBodY() {
        return bodY;
    }

    public void setBodX(Bod x) {
        this.bodX = x;
    }

    public void setBodY(Bod y) {
        this.bodY = y;
    }

    @Override
    public void kresli(Graphics2D g) {
        g.drawLine(bodX.getX(), bodX.getY(), bodY.getX(), bodY.getY());
    }
    
    
    
    
    
    
    
    
}
