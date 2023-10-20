package com.pluralsight; // Java Class A
import java.sql.Array;
import java.util.*;
import java.io.*;

public class Products {
    private String sku;
    private String item;
    private String sector;
    private double cost;

    public Products(String sku, String item, String sector, double cost) {
        this.sku = sku;
        this.item = item;
        this.sector = sector;
        this.cost = cost;
    }
//  Getters
    public String getSku() {
        return sku;
    }
    public String getItem() {
        return item;
    }
    public String getSector() {
        return sector;
    }
    public double getCost() {
        return cost;
    }
//  Setters
    public void setSku(String sku) {
        this.sku = sku;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }
    public void setCost(double cost) {
        this.cost = cost;
    }
    @Override
    public String toString() {
        return sku + " | " + item + " | $" + cost + " | " + sector;
    }
    public static List<Products> chestLoad("src/main/resources/products.csv") {
        List<Products> chest = new ArrayList<>();
        try {
            BufferedReader readBuff = new BufferedReader(new FileReader("src/main/resources/products.csv"))
        }
    }
}