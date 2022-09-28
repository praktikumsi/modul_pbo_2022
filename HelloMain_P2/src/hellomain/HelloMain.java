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
        Mario.jenis_kelamin = "L";
        // Ini Untuk Mencetak
        System.out.println("Namanya : "+Mario.nama);
        System.out.println("Jenis Kelamin : "+Mario.jenis_kelamin);
        
        // Memanggil Method
        Mario.melompat();
        
    }
    
}
