/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nastroje;

import javax.swing.JTextField;

/**
 * Metoda prevede carky na tecky. Pokud je vice carek nebo tecek, tak oznami chybu.
 * Java povazuje tecku za desetinnou carku. Jedine s teckou umi pocitat.
 * @author Rasovsky Zdenek
 * 
 */
public class TextKnihovna {
    public static String osetreniDesetinneCarky(JTextField textField) throws Exception{
        
        String text = textField.getText().replace(',', '.');

        //kolik je carek v textu (dve znamenaji chybu)
        int pocetCarek = 0;
        
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == '.'){
                pocetCarek++;
            }
        }
        
        //hodnoceni (2 a vice carky chyba; 1 znamena, ze se prevod uskutecni)
        if(pocetCarek == 0 || pocetCarek == 1){
            //prevod carky na 
            return text;
        }
        else{
            //chyba
            String jmenoPole = textField.getName();
            throw new Exception("Moc čárek nebo teček v desetinném čísle pole " + jmenoPole + "!");
        }
    }


    
    
    
}
