/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma29;

/**
 *
 * @author sedan
 */
public class CustomerManager {
    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal=customerDal;
    }
    
    public void add(){
        //iş kodları yazılır genelde
        customerDal.add();
    }
    
}
