package com.example.greg.androidinventoryapp;

/**
 * Created by Greg on 4/19/2016.
 */
public class Product {

    private String product;
    private double quantity;

    public static Product[] products = {
            new Product("Test Item", 1)

    };

    private Product(String product, double quantity){
        this.product = product;
        this.quantity = quantity;
    }
}
