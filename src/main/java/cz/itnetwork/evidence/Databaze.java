/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidence;
import java.util.ArrayList;
/**
 *
 * @author filip
 */
public class Databaze {
    /**
     * Vytvoreni kolekce zaznamy
     */
    private ArrayList<Zaznam> zaznamy;
    /**
     * vnoreni kolekce do objektu pomoci konstruktoru 
     */
    public Databaze(){
        zaznamy = new ArrayList<>();
    }
    /**
     * Metoda pridej zaznam
     * @param jmeno
     * @param prijmeni
     * @param vek
     * @param telCislo 
     */
    public void pridejZaznam(String jmeno, String prijmeni, int vek, int telCislo){
        zaznamy.add(new Zaznam(jmeno,prijmeni,vek,telCislo));
    }
    /**
     * Metoda najdi zaznamy
     * @param jmeno
     * @param prijmeni
     * @return 
     */
    public ArrayList<Zaznam> najdiZaznamy(String jmeno, String prijmeni){
        ArrayList<Zaznam> nalezene = new ArrayList<>();
        for(Zaznam zaznam : zaznamy){
            if(jmeno.equals(zaznam.getJmeno()) && prijmeni.equals(zaznam.getPrijmeni())){
            nalezene.add(zaznam);  
            }
           
        }
    return nalezene;    
    }
    
    public ArrayList<Zaznam> getVsechnyZaznamy(){
        return zaznamy;
    }
    
}
