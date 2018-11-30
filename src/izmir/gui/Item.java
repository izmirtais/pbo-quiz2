/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package izmir.gui;

/**
 *
 * @author Izmir
 */
public class Item {
    private String nama; // variable menyimpan nama
    private int jumlah; // variable menyimpan jumlah
    private float harga; // variable menyimpan harga
    
    public Item(){
        
    }

     // membuat konstruktor
    public Item(String nama, int jumlah, float harga) {
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
    }
    
    // membuat setter dan getter beserta toString
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }
    
        
    public String toString(){
        return this.nama;
    }

    // menghitung hasil dari perkalian harga item dan jumlah
    public float getTotal(){
        return this.harga * this.jumlah;
    }
}

