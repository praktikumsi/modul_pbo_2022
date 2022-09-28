/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hellomain;

/**
 *
 * @author DELL-PC-D
 */
public class Enemies extends Karakter{
    public void attack(){
        System.out.println(this.nama+" Berhasil menyerang ");
    }
    
    public void attack(String target){
        System.out.println(this.nama+" Berhasil menyerang "+target);
    }
    
    @Override
    public void melompat(){
        System.out.println("Musuh bernama " +this.nama+" Sedang Melompat");
    }
}
