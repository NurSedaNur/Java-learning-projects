/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma21;

/**
 *
 * @author sedan
 */
public class Main { 
    public static void main(String[] args) {
     //   Product product=new Product(5,"lenova","asus laptop",5000,5,"siyah","iyi");
        Product product=new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        
        System.out.println(product.getName());
        System.out.println(product.getStockAmount());
        
        ProductManager productManager=new ProductManager();
        productManager.Add(product);
        
    }
}
