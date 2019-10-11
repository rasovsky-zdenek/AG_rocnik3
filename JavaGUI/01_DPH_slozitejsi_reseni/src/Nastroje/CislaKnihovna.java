/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nastroje;

/**
 *
 * @author rasovsky
 */
public class CislaKnihovna {
   public static double textDoDouble(String text) throws Exception{
       //moc carek, texek
       text = TextKnihovna.osetreniDesetinneCarky(text);
       try{
         //text misto cisla; nebo prazdny text  
         return Double.parseDouble(text); 
       }
       catch(NumberFormatException ex){
          System.out.println(ex.getMessage());
           if(ex.getMessage().equals("empty String")){
              throw new Exception("Chybí zadání!"); 
           }
           else{
              throw new Exception("Nejedná se o číslo! Zadejte číslo."); 
           }       
       }
   }   

    
       
}
