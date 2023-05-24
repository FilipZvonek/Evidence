/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidence;

/**
 *
 * @author filip
 */
public class Zaznam {
    /**
     * atribut jmeno
     */
    private String jmeno;
    /**
     * atribut prijmeni
     */
    private String prijmeni;
    /**
     * atribut vek
     */
    private int vek;
    /**
     * atribut telCislo
     */
    private int telCislo;
    /**
     * Vytvori instanci Zaznamu
     * @param jmeno
     * @param prijmeni
     * @param vek
     * @param telCislo 
     */
    public Zaznam(String jmeno, String prijmeni, int vek, int telCislo){
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telCislo = telCislo;
    }

    /**
     * @return the jmeno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * @param jmeno the jmeno to set
     */
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    /**
     * @return the prijmeni
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * @param prijmeni the prijmeni to set
     */
    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    /**
     * @return the vek
     */
    public int getVek() {
        return vek;
    }

    /**
     * @param vek the vek to set
     */
    public void setVek(int vek) {
        this.vek = vek;
    }

    /**
     * @return the telCislo
     */
    public int getTelCislo() {
        return telCislo;
    }

    /**
     * @param telCislo the telCislo to set
     */
    public void setTelCislo(int telCislo) {
        this.telCislo = telCislo;
    }
    /**
     * Vrati textovou podobu jmena prijmeni veku telCislo
     * @return 
     */
@Override
public String toString(){
    return jmeno + " " + prijmeni + " " + vek + " " + telCislo;
}
}
