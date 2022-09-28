/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hellomain;

/**
 *
 * @author DELL-PC-D
 */
public class HelloMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Karakter Mario = new Karakter();
        Mario.nama = "Mario";
        
        // Ini Untuk Mencetak
        System.out.println("Namanya : "+Mario.nama);
        
        // Memanggil Method
        Mario.melompat();
        
        //------
        Enemies wario = new Enemies();
        wario.nama = "Wario";
        wario.attack();
        wario.attack("Mario");
        wario.melompat();
        
        
    }
    
}
