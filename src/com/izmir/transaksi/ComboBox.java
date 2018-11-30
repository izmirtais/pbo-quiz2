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
public class ComboBox {
    private ArrayList<Item> items; //variabel untuk menyimpan objek item

    // konstruktor combo box model
    public ComboBox() {
        this.items = new ArrayList<>();
    }
    
    public Item[] toArray() {
        Item[] items = new Item[this.items.size()];
        for(int i = 0; i < items.length; i++) {
            items[i] = this.items.get(i);
        }
        return items;
    }
    
    // menambahkan item ke tabel item belanja
    public void tambahItem(Item item){
        this.items.add(item);
    }
}
