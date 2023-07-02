/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma29;

/**
 *
 * @author sedan
 */
public class Main {
    public static void main(String[] args) {
//        ICustomerDal ıcustomerDal=new MySqlCustomerDal();
//        ıcustomerDal.add();
        
        CustomerManager customermanager=new CustomerManager(new OracleCustomerDal());
        //customermanager.customerDal=new OracleCustomerDal();
        customermanager.add();
        
    }
    
}
