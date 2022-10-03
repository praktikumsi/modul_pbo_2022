/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package namakamu_4;

/**
 *
 * @author DELL-PC-D
 */
abstract class Karakter{

    public Karakter(String nama, int tinggi) {
        this.nama = nama;
        this.tinggi = tinggi;
    }
    
    String nama;
    int tinggi;
    
    abstract void memukul();
    void berlari(){
        System.out.println(this.nama + " Berlari");
    }
}

public class Hero extends Karakter implements Weapon{

    public Hero(String nama, int tinggi) {
        super(nama, tinggi);
    }
    
    @Override
    public void memukul(){
        System.out.println("Hero berhasil memukul lawan");
    }

    @Override
    public void menembak() {
        System.out.println("Pew-Pow-Pew");
    }
}
