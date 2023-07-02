/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma23;

/**
 *
 * @author sedan
 */
public class Main {
    public static void main(String[] args) {
        
        Customer customer=new Customer();
        Employee employee=new Employee();
        customer.firstname="Selda";
        employee.firstname="Melda";
        System.out.println( "customer firstname: "+customer.firstname+"\nemployee firstname: "+employee.firstname);
        System.out.println();
        
        CustomerManager customermanager=new CustomerManager();
        EmployeeManager employeemanager=new EmployeeManager();
        customermanager.Add();
        employeemanager.BestEmployee();
        
    }
    
}
