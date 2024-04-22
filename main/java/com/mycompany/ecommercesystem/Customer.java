package com.mycompany.ecommercesystem;
public class Customer {
  protected  int Customerid;
  protected  String name;
  protected  String addresse;
    public Customer() {
        this.Customerid=23011164;
        this.name="Menna Elsayed ELshamy";
    }
    public Customer(int Customerid, String name, String addresse) {
        this.Customerid = Customerid;
        this.name = name;
        this.addresse = addresse;
    }
public void setCustomerid(int Customerid) {
        this.Customerid = Math.abs(Customerid);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }
    public int getCustomerid() {
        return Customerid;
    }
    public String getName() {
        return name;
    }

    public String getAddresse() {
        return addresse;
    }
}
