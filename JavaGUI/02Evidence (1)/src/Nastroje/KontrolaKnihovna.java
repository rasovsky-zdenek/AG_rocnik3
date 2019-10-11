/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nastroje;

import cviceni.Stav;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author rasovsky
 */
public class KontrolaKnihovna {
   
    public static String kontrolaRadio(JPanel panelRadio)throws Exception {
       JRadioButton radio; 
       String navrat; 
       Component[] c =  panelRadio.getComponents();
        //Projde radioButtons a zjistí, jestli je právě jedno zatrženo
        for (Component component : c) {
              radio = (JRadioButton) component;   
              if(radio.isSelected()){
                  navrat = radio.getText().toLowerCase();
                  return navrat; //pokud najde zatrzene tlacitko, tak metoda konci
              }
            }
        
        //vyjimka
        String jmenoPanelu = panelRadio.getName().toLowerCase();
        throw new Exception("Vyberte " + jmenoPanelu + "!");
    }

    public static String prazdnePole(JTextField textField) throws Exception {
        if (textField.getText().equals("")) {
            String jmenoPole = textField.getName();
            throw new Exception("Nevyplněné pole " + jmenoPole + "!");
        }else{
            //return String
            return textField.getText();
        }
    }

    public static int textDoInt(JTextField textField) throws Exception {
        //prazdne pole
        String poleHodnota = prazdnePole(textField);
        //prevod na int (parsovani)
        try{
           return Integer.parseInt(poleHodnota); 
        }
        catch(NumberFormatException ex){
           String jmenoPole = textField.getName();
           throw new Exception("Není zadáno celé číslo v poli " + jmenoPole + "!"); 
        }
    }

    public static double textDoDouble(JTextField textField) throws Exception {
        //prazdne pole
         prazdnePole(textField);
         
        //tecky,carky - prevod na tecky; osetreni jen jedne tecky
         String text = TextKnihovna.osetreniDesetinneCarky(textField);
        //prevod na double (parsovani)
        try {
            //text misto cisla; nebo prazdny text
            return Double.parseDouble(text);
        } catch (NumberFormatException ex) {
          String jmenoPole = textField.getName();  
          throw new Exception("Není zadáno desetinné číslo v poli " + jmenoPole + "!");  
        }
    }
    
}
