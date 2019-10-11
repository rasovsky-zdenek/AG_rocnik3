/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tvary;

import java.awt.Graphics2D;
import java.util.ArrayList;

/**
 *
 * @author rasovsky
 */
public class SkladTvaru {
    private ArrayList<Cara> cary;

    public SkladTvaru() {
        cary = new ArrayList<>();
    }
    
    public void vlozCaru(Cara c){
        cary.add(c);
    }
    
    public void vykresliCary(Graphics2D g){
        for (Cara c : cary) {
           c.kresli(g); 
        }
    }
    
    public void smazatCary(){
        cary.clear();
    }
}
