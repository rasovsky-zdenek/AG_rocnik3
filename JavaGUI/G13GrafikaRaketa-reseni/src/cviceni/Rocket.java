/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cviceni;

import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author ag
 */
public class Rocket {
    private int x; //position x of rocket
    private int y; //position y of rocket
    private int speed = 25; //speed px/s
    private Image rocket; //image of rocket

    public Rocket(String pathImage) {
        this.rocket = new ImageIcon(pathImage).getImage();
    }
    
    //rocket start position
    public void rocketOnStart(Canvas canvas){
       this.x = canvas.getWidth()/2 - (rocket.getWidth(null)/2); //center rocket x coordinates on the canvas 
       this.y = canvas.getHeight() - 5 - (rocket.getHeight(null)); //get rocket to the bottom of the canvas
    }
    
    //draw Rocket
    public void drawRocket(Graphics2D g){
        g.drawImage(rocket, x, y, null);//vyresleni na pozici
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int getRocketWidth() {
        return rocket.getWidth(null); 
    }
}
