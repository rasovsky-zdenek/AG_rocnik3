/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cviceni;

/**
 *
 * @author rasovsky
 */
public class Zamestnanec {
    private String jmeno;
    private int vek;
    private String pohlavi;
    private String stav;

    public Zamestnanec(String jmeno, int vek, String pohlavi, String stav) {
        this.jmeno = jmeno;
        this.vek = vek;
        this.pohlavi = pohlavi;
        this.stav = stav;
    }

    public String getJmeno() {
        return jmeno;
    }

    public int getVek() {
        return vek;
    }

    public String getPohlavi() {
        return pohlavi;
    }

    public String getStav() {
        return stav;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public void setPohlavi(String pohlavi) {
        this.pohlavi = pohlavi;
    }

    public void setStav(String stav) {
        this.stav = stav;
    }

    @Override
    public String toString() {
        StringBuilder vypis = new StringBuilder();
        vypis.append("Jméno: ");
        vypis.append(this.jmeno);
        vypis.append("\n");
        vypis.append("Věk: ");
        vypis.append(this.vek);
        vypis.append(" let");
        vypis.append("\n");
        vypis.append("Stav: ");
        vypis.append(this.pohlavi);
        vypis.append(", ");
        vypis.append(this.stav);
        vypis.append("\n");
        vypis.append("- - - - - - - - - - - - - - - - - - -");
        vypis.append("\n");
        
        return vypis.toString();
    }
    
    
}
