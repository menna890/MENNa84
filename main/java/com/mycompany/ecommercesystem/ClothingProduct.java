package com.mycompany.ecommercesystem;
public class ClothingProduct extends product {
        String  size;
    String fabric;

    public ClothingProduct(int procutid, String name, float price) {
        super(procutid, name, price);
    }
    public ClothingProduct(String size, String fabric, int procutid, String name, float price) {
        super(procutid, name, price);
        this.size = size;
        this.fabric = fabric;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
    public String getSize() {
        return size;
    }
    public String getFabric() {
        return fabric;
    }
    

}
