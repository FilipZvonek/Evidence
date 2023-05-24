/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidence;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author filip
 */
public class Pojistenec {
    /**
     * Vytvoreni objektu databaze
     */
    private Databaze databaze;    
    /**
     * Vytvoreni scanneru
     */
    private Scanner scanner = new Scanner(System.in, "Windows-1250");
    /**
     * Vnoreni objektu Databaze pomoci konstruktoru
     */
    public Pojistenec(){
        databaze = new Databaze();
        
    }
    /**
     * Metoda pridat zaznat
     */
    public void pridejZaznam(){
        System.out.println("Zadejte jméno pojištěného:");
        String jmeno = scanner.nextLine();
        System.out.println("Zadejte příjmení pojištěného:");
        String prijmeni = scanner.nextLine();
        System.out.println("Zadejte věk pojištěného:");
        int vek = Integer.parseInt(scanner.nextLine());
        System.out.println("Zadejte telefonní číslo pojištěného:");
        int telCislo = Integer.parseInt(scanner.nextLine());
        databaze.pridejZaznam(jmeno, prijmeni, vek, telCislo);
    }
    /**
     * Metoda vypsat vsechny zaznamy
     */
    public void vypisZaznamy(){
        ArrayList<Zaznam> zaznamy = databaze.getVsechnyZaznamy();
        for(Zaznam zaznam : zaznamy){
            System.out.println(zaznam);
        }
        
    }
    /**
     * Metoda vyhledat zaznam
     */
    public void vyhledejZaznamy(){
        
        System.out.println("Zadejte jméno:");
            String jmeno = scanner.nextLine();
        System.out.println("Zadejte příjméní:");
            String prijmeni = scanner.nextLine();
        System.out.println();    
        ArrayList<Zaznam> zaznamy = databaze.najdiZaznamy(jmeno, prijmeni);
        
        if(zaznamy.size() > 0){
            
            for(Zaznam zaznam : zaznamy){
                System.out.println(zaznam);
            }
        }
        else{
            System.out.println("Nebyly nalezeny žádné záznamy");
        }
    }
    /**
     * Metoda ktera vypise uvodni obrazovku
     */
    public void vypisUvodniObrazovku(){
        System.out.println("----------------------------");
        System.out.println("Evidence pojíštěných");
        System.out.println("----------------------");
    }
}

