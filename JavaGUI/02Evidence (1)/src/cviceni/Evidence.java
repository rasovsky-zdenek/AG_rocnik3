/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cviceni;

import java.util.ArrayList;

/**
 *
 * @author rasovsky
 */
public class Evidence {
    public static int aktualizovany = -1;
    private final ArrayList<Zamestnanec> zamestnanci;

    public Evidence() {
        zamestnanci = new ArrayList<>();
    }
    
    public void aktualizaceZamestnance(String jmeno, int vek, String pohlavi, String stav) throws Exception{
        try{
          int index = aktualizovany - 1;
          Zamestnanec z = zamestnanci.get(index);
          z.setJmeno(jmeno);
          z.setVek(vek);
          z.setPohlavi(pohlavi);
          z.setStav(stav);
        }
        catch(Exception ex){
            throw new Exception("Špatně zadané číslo zaměstnance!");
        } 
    }
    
    public void novyZamestnanec(String jmeno, int vek, String pohlavi, String stav) {
        zamestnanci.add(new Zamestnanec(jmeno, vek, pohlavi, stav));
    }
    
    public void smazVsechnyZamestnance(){
        zamestnanci.clear();
    }
    
    public String vypisEvidence(){
        StringBuilder vypis = new StringBuilder();
        //zatim jen do terminalu
        int poradi = 1;
        for (Zamestnanec z : zamestnanci) {
            vypis.append(poradi);
            vypis.append(".");
            vypis.append("\n");
            vypis.append(z.toString());
            poradi++;
            //System.out.println(z);
        }
        return vypis.toString();
    }
    
    
    
    
}
