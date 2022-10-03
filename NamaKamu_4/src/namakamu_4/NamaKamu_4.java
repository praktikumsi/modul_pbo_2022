/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package namakamu_4;

import java.util.ArrayList;

/**
 *
 * @author DELL-PC-D
 */
public class NamaKamu_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Hero> heroes = new ArrayList<Hero>();
        
        heroes.add(new Hero("Superman",300));
        heroes.add(new Hero("Batman",280));
        heroes.add(new Hero("Flash",210));
        
        for (int i = 0; i < heroes.size(); i++) {
            Hero hero = heroes.get(i);
            System.out.println("Nama Hero ke-"+(i+1)+" "+hero.nama);
            hero.memukul();
        }
        
    }
    
}
