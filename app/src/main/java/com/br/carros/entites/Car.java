package com.br.carros.entites;

import android.graphics.drawable.Drawable;

public class Car {
    public int id;
    public String model;
    public String menuFacture;
    public int horsePower;
    public Double price;
    public Drawable picture;


    public Car(int id, String model, String menuFacture, int horsePower, Double price, Drawable picture) {
        this.id = id;
        this.model = model;
        this.menuFacture = menuFacture;
        this.horsePower = horsePower;
        this.price = price;
        this.picture = picture;
    }
}
