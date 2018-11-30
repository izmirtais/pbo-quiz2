/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.izmir.transaksi;

import java.util.ArrayList;

/**
 *
 * @author Izmir
 */
public class Transaksi {
    private final String kode; //variable untuk menampilkan kode pembayaran 
    private  ArrayList<Item> items = new ArrayList(); //item untuk menampilkan item apa saja yang dibeli
    private float total; //variable menampilkan total pembelian
    
    //membuat konstruktor
    public Transaksi() {
        this.kode = null;
    }
    

    public Transaksi(String kode, ArrayList<Item> items) {
        this.kode = kode;
        this.items = items;
    }
    
    //membuat setter dan getter yg dibutuhkan
    public void setTotal(){
        float total = 0;
        for(Item item : this.items){
            total += item.getTotal();
        }
        this.total = total;
    }
    //membuat method pembayaran
    public String Pembayaran(){
        setTotal();
        String string = "";
        string += "Kode\t\t : " + this.kode + "\n";
        string += "Daftar Belanja : \n ";
        for (Item item : this.items){
            string += "\t" + item.getNama()  + "(" + item.getJumlah() + ") : " +item.getTotal() + "\n" ;   
        }
        string += "Total\t\t : " + this.total;
        return string;
    }  
}
