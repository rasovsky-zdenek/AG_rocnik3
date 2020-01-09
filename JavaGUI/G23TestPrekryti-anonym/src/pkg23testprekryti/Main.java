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

class Vzor{
    Panel p;

    public Vzor() {
        
        p = new Panel(){
            @Override
            public void paint() {
                super.paint();
                System.out.println("Rozšířené kreslení na Panel");
            }
            
        };
    }
    
    
}

public class Main {
    
    public static void main(String[] args) {
      new Vzor();
    }
    
}
