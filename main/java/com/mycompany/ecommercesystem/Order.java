package com.mycompany.ecommercesystem;
import javax.swing.JOptionPane;
public class Order {
   protected int Customerid;
   protected int orderId;
   protected product []products;
   protected float totalprice;
    public Order() {
    }
    public Order(int Customerid, int orderId) {
        this.Customerid = Customerid;
        this.orderId = orderId;
    }
public void printinfo(Cart PRODUCT){
      this.products =new product[PRODUCT.getNproduct()];
   // System.out.println("the orderid  " +orderId+ "\n customer id :"+Customerid );
    JOptionPane.showMessageDialog(null,"the orderid  " +orderId+ "\n customer id :"+Customerid );
   this. products=PRODUCT.getArrproducts();
    //System.out.println("the products :\n");
    JOptionPane.showMessageDialog(null,"the products :\n");
    if (products==null){
} else {
        for (int j=0;j<PRODUCT.getArrproducts().length;j++) {
            
            //System.out.println(products[j].getPrice()+" -  $"+products[j].getName());
    JOptionPane.showMessageDialog(null,products[j].getPrice()+" -  $"+products[j].getName());          
            totalprice +=products[j].getPrice();
            JOptionPane.showMessageDialog(null,"the total price is: $" +totalprice);
          //  System.out.println("the total price is: $" +totalprice);
        }
       }
}   
}
