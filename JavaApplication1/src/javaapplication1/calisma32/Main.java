/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma32;

import java.util.ArrayList;

/**
 *
 * @author sedan
 */
public class Main {
    public static void main(String[] args) {
        
    ArrayList<Customer> customers=new ArrayList<Customer>();
    Customer ali=new Customer(1,"ali","aliS");
    customers.add(ali);
    customers.add(new Customer(2,"veli","velis"));
    customers.add(new Customer(3,"ayse","ayses"));
     customers.remove(ali);
    for(Customer customer:customers){
        System.out.println(customer.firstname+" "+customer.lastname);
    }
        
        
        
    }
    
}
