/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.evidence;
import java.util.Scanner;
/**
 *
 * @author filip
 */
public class Evidence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "Windows-1250");
        Pojistenec pojistenec = new Pojistenec(); //Vytvoreni instance pojistenec
        String volba = "";
        // Hlavni cyklus
        while(!volba.equals("4")){
            pojistenec.vypisUvodniObrazovku();
            System.out.println();
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Konec");
            volba = scanner.nextLine();
            System.out.println();
           // Reakce na moznosti 
            switch(volba){
                
                case "1":
                    pojistenec.pridejZaznam();
                    System.out.println();
                    System.out.println("Data byla uložena. Pokračujte libovolnou klávesou...");
                    break;
                
                case "2":
                    pojistenec.vypisZaznamy();
                    System.out.println();
                    System.out.println("Pokračujte libovolnou klávesou...");
                    break;
                
                case "3":
                    pojistenec.vyhledejZaznamy();
                    System.out.println();
                    System.out.println("Pokračujte libovolnou klávesou...");
                    break;
                // vyskoci z cyklu while = ukonci program    
                case "4":
                    break;
                    
                default:
                    System.out.println("Neplatná volba, stiskněte libovolnou klávesu a opakujte volbu.");
            }
        }
    }
}
