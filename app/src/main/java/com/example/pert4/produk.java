package com.example.pert4;

import android.content.Context;

import java.util.ArrayList;

public class produk {

    // Attributes
    private String name;
    private int price, picture;

    public produk(String name, int price, int picture) {
        this.name = name;
        this.price = price;
        this.picture = picture;
    }

    public produk(ArrayList<produk> produkArrayList, Context applicationContext) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }
}
