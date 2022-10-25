/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulator;

/**
 *
 * @author Asus
 */
public class Keramik {
    private String merk;
    private int panjang,
                lebar,
                luas,
                isi,
                hitLuasTot,
                harga,
                hargaPerDus,
                hitHarga,
                hitDus;
    
    // merk
    public String getMerk(){
        return merk;
    }
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    // panjang 
    public int getPanjang(){
        return panjang;
    }
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    
    // lebar
    public int getLebar(){
        return lebar;
    }
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    
    // isi
    public int getIsi(){
        return isi;
    }
    public void setIsi(int isi){
        this.isi = isi;
    }
    
    // harga per satuan
    public int getHarga(){
        return harga;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    
    
    // menghing luas
    public int hitLuas(){
        luas = panjang * lebar;
        return luas;
    }
    
    // menghitung luas total
    public int hitLuasTot(){
        hitLuasTot = hitLuas() * getIsi();
        return hitLuasTot;
    }
    
    // menghitung harga per dus
    public int hitHargaPerDus(){
        hargaPerDus = isi * harga;
        return hargaPerDus;
    }
    
    // menghitung dus
    public int hitDus(){
        hitDus = 1000000 / hitLuasTot();
        return hitDus;
    }
    
    // hitung harga sesuai kebutuhan
    public int hitHarga(){
        hitHarga = hitHargaPerDus() * hitDus();
        return hitHarga;
    }
    
    // output
    public void infoMerk(){
        System.out.println("Merk keramik = " + getMerk());
        System.out.println("Panjang = " + getPanjang() + "cm");
        System.out.println("Lebar = " + getLebar() + "cm");
        System.out.println("Luas = " + hitLuas() + "cm^2");
        System.out.println("Isi per dus = " + getIsi() + " pcs");
        System.out.println("Luas total = " + hitLuasTot() + "cm^2");
        System.out.println("Harga per satuan = " + getHarga());
        System.out.println("Harga per dus = " + hitHargaPerDus());
        System.out.println("Kebutuhan keramik per dus = " + hitDus());
        System.out.println("Harga sesuai kebutuhan = Rp." + hitHarga());
    }
    
}
