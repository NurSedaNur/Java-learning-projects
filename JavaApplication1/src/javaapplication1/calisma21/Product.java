/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma21;

/**
 *
 * @author sedan
 */
public class Product {
    
    public Product(int id,String name,String description,double price,int stockAmount,String renk,String kod){
        this.id=id;
        this.name=name;
        this.description=description;
        this.price=price;
        this.stockAmount=stockAmount;
        this.renk=renk;
        this.kod=kod;
    }
    
    public Product(){ 
    }
    
    
    //attribute| field
   private int id;
   private String name;
   private String description;
   private double price;
   private int stockAmount;
   private String renk;
   private String kod;
   
   //getter
   public int getId(){
       return id;
   }
   //setter
   public void setId(int id){
       this.id=id;//this içinde bulundugumuz class ı temsil eder.
   }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the stockAmount
     */
    public int getStockAmount() {
        return stockAmount;
    }

    /**
     * @param stockAmount the stockAmount to set
     */
    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the kod
     */
    public String getKod() {
        return kod;
    }

    /**
     * @param kod the kod to set
     */
    public void setKod(String kod) {
        this.kod = kod;
    }
   
   
}
