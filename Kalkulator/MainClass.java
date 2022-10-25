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
public class MainClass {
    public static void main(String[] args) {
        Keramik merkA = new Keramik();
        Keramik merkB = new Keramik();
        Keramik merkC = new Keramik();
        
        System.out.println("untuk keramik merk A");
        merkA.setMerk("Keramik A");
        merkA.setPanjang(20);
        merkA.setLebar(20);
        merkA.setIsi(25);
        merkA.setHarga(4000);
        merkA.infoMerk();
        
        
        System.out.println("\nuntuk keramik merk B");
        merkA.setMerk("Keramik B");
        merkA.setPanjang(25);
        merkA.setLebar(25);
        merkA.setIsi(20);
        merkA.setHarga(5000);
        merkA.infoMerk();
        
        System.out.println("\nuntuk keramik merk C");
        merkA.setMerk("Keramik C");
        merkA.setPanjang(50);
        merkA.setLebar(50);
        merkA.setIsi(5);
        merkA.setHarga(23000);
        merkA.infoMerk();
        
    }
}
