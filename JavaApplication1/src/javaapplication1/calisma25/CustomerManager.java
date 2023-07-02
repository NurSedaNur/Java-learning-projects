/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma25;

/**
 *
 * @author sedan
 */
public class CustomerManager {
    private BaseLogger logger;
    
    public CustomerManager(BaseLogger logger){//constructor
        this.logger=logger;
    }
    
    public void add(){
        System.out.println("müşteri eklendi");
        this.logger.log("log mesajı");
    }
}
