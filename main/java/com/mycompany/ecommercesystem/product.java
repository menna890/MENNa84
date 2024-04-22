package com.mycompany.ecommercesystem;
public class product {
protected int procutid;
protected String name;
protected float price;
    public product() {
    }
    public product(int procutid, String name, float price) {
        this.procutid = procutid;
        this.name = name;
        this.price = price;
    }
    public void setProcutid(int procutid) {
        this.procutid =  Math.abs(procutid);
    }
    public void setName(String name) {
        this.name =name;
    }
    public void setPrice(float price) {
        this.price =  Math.abs(price);
    }
    public int getProcutid() {
        return procutid;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
}
