package com.mycompany.ecommercesystem;
public class Cart {
  protected  int Customerid;
    protected int nproduct;
    protected product [] arrproducts;
    protected float price;
    public Cart(int Customerid, int nproduct) {
        this.Customerid = Customerid;
        this.nproduct = nproduct;
        this.arrproducts =new product[nproduct];
    }
   /* public float getPrice() {
        return price;
    }*/
    public int getCustomerid() {
        return Customerid;
    }
    public int getNproduct() {
        return nproduct;
    }

    public product[] getArrproducts() {
        return arrproducts;
    }
    public void setCustomerid(int Customerid) {
        this.Customerid = Customerid;
    }
    public void setNproduct(int nproduct) {
        this.nproduct = nproduct;
    }  
    public void addproduct(product PRODUCT) {
      for (int j=0;j<nproduct;j++){
      if(arrproducts [j]== null){
          arrproducts [j]= PRODUCT; 
      }
    }
    }  
public void removeproduct(){
arrproducts =null;
}
public float Calculatprice(){
    for (int j=0;j<nproduct;j++) {
    this.price += arrproducts [j].getPrice();
    }
return price;
}           
public void placeorder(int or){
        if(or==1){
        }
        else if(or==2){
            System.out.println("thank you for visiting");
}        
}    
    
}





