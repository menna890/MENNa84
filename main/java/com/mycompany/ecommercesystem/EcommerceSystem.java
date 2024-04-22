package com.mycompany.ecommercesystem;
//import java.util.Scanner;
import javax.swing.JOptionPane;
public class EcommerceSystem {
    public static void main(String[] args) {
    //   System.out.println("welcome to  E_commerce system");
     JOptionPane.showMessageDialog(null,"welcome to  E_commerce system");  
    ClothingProduct CLOTH= new ClothingProduct("medium","cotton",1,"dress",5); 
         BookProduct book=new  BookProduct("stiven","X ppp" ,2,"atomic habit", 12);
         ElectronicProduct electr=new ElectronicProduct("apple", 1,3,"tablet", 1000);
         //System.out.println(" name :"+CLOTH.getName()+"\n id:"+CLOTH.getProcutid()+"\n price:$"+CLOTH.getPrice()+"\n size:"+CLOTH.getSize()+"\n fabric: "+CLOTH.getFabric());
     JOptionPane.showMessageDialog(null," name :"+CLOTH.getName()+"\n id:"+CLOTH.getProcutid()+"\n price:$"+CLOTH.getPrice()+"\n size:"+CLOTH.getSize()+"\n fabric: "+CLOTH.getFabric());         
   //      System.out.println(" name :"+book.getName()+"\n id:"+book.getProcutid()+"\n price:$"+book.getPrice()+"\n author:"+book.getAuthor()+"\n publisher: "+book.getPublisher());
     JOptionPane.showMessageDialog(null," name :"+electr.getName()+"\n id:"+electr.getProcutid()+"\n price:$"+electr.getPrice()+"\n brand:"+electr.getBrand()+"\n WarrantlyPro: "+electr.getWarrantlyPro());
//   System.out.println(" name :"+electr.getName()+"\n id:"+electr.getProcutid()+"\n price:$"+electr.getPrice()+"\n brand:"+electr.getBrand()+"\n WarrantlyPro: "+electr.getWarrantlyPro());

     JOptionPane.showMessageDialog(null," name :"+book.getName()+"\n id:"+book.getProcutid()+"\n price:$"+book.getPrice()+"\n author:"+book.getAuthor()+"\n publisher: "+book.getPublisher());  
//Scanner input=new Scanner(System.in);
       //System.out.println("Enter your ID :");
       int custid=Integer.parseInt(JOptionPane.showInputDialog("Enter your ID :"));
               
//input.nextInt();
      // System.out.println("Enter your Name :");
       
       String name=JOptionPane.showInputDialog("Enter your NAme :");
               //input.next();
       
               System.out.println("Enter your Address :");
       String address=JOptionPane.showInputDialog("Enter your Address :");
               //input.next();
       Customer cust1=new Customer(custid, name,address);
        //System.out.println("How many would you want to add your cart"); 
        int nproduct=Integer.parseInt(JOptionPane.showInputDialog("\"How many would you want to add your cart\""));
                //input.nextInt();
          Cart cart=new Cart(custid,nproduct);
             for (int j=0;j<nproduct;j++) {
              //System.out.println("which product would you like to add ? "+CLOTH.getProcutid()+"- "+CLOTH.getName()+"  "+book.getProcutid()+"- "+book.getName()+"  "+electr.getProcutid()+"- "+electr.getName());
           int id=Integer.parseInt(JOptionPane.showInputDialog(null,"which product would you like to add ? "+CLOTH.getProcutid()+"- "+CLOTH.getName()+"  "+book.getProcutid()+"- "+book.getName()+"  "+electr.getProcutid()+"- "+electr.getName()));
                   //input.nextInt();
           if (id==CLOTH.getProcutid()){
               cart.addproduct(CLOTH);
           }
           if (id==book.getProcutid()){
               cart.addproduct(book);          
           }
           if (id==electr.getProcutid()){
               cart.addproduct(electr);       
           }
                     }
      // System.out.println("your total is $"+cart.Calculatprice()+".  Wouldyou  like to place the order? 1-yes 2-no ");
        int order=Integer.parseInt(JOptionPane.showInputDialog(null,"your total is $"+cart.Calculatprice()+".  Wouldyou  like to place the order? 1-yes 2-no "));
                //input.nextInt();
        cart.placeorder(order);
         Order o1=new Order(cust1.getCustomerid(),1);
         if(order==1 ){
         o1.printinfo(cart);
         }
         else
         {      cart.removeproduct();
            o1.printinfo(cart);
    }
    }
}

