/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hellomain;

/**
 *
 * @author DELL-PC-D
 */
public class Karakter {
    public String nama;
    private float tinggi; //Dalam Meter
    protected String jenis_kelamin;
    String warna_skin;
    String deskripsi;
    int kecepatan_ms;
    
    public float gettinggi(){
        return this.tinggi;
    }
    
    void berlari(){
        System.out.println(nama+" Berlari");
    }
    
    void melompat(){
        System.out.println(nama+" Melompat");
    }
    
    
}
