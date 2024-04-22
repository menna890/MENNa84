package com.mycompany.ecommercesystem;
public class ElectronicProduct extends product{
 protected   String brand;
 protected  int warrantlyPro;

    public ElectronicProduct(int procutid, String name, float price) {
        super(procutid, name, price);
    }  
    public ElectronicProduct(String brand, int warrantlyPro, int procutid, String name, float price) {
        super(procutid, name, price);
        this.brand = brand;
        this.warrantlyPro = warrantlyPro;
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantlyPro() {
        return warrantlyPro;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarrantlyPro(int warrantlyPro) {
        this.warrantlyPro = warrantlyPro;
    }
    
    
}
