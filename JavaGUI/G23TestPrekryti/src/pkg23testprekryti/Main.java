/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg23testprekryti;

class Panel{

        public Panel() {
            System.out.println("Konstruktor Panel");
            paint(); //simuluje backend JPanel, kdy je volana metoda paintComponents z rodice. neni volana z potomka (zetcode.com)
        }
        
        public void paint(){
            System.out.println("Kreslím na Panel");
        }
        
    }
    
    class Vzor extends Panel{

        public Vzor() {
            System.out.println("Konstruktor Vzor");
        }

        @Override
        public void paint() {
            super.paint();
            System.out.println("Rozčířené kreslení na Panel");
        }    
    }

public class Main {
    
    public static void main(String[] args) {
        //Panel p = new Panel();
        //p.paint();
        
        //Vzor v = new Vzor(); 
        
        //Panel p = new Vzor();
        
    }
    
}
