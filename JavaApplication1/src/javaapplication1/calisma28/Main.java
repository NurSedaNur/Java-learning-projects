/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma28;

/**
 *
 * @author sedan
 */
public class Main {
    public static void main(String[] args) {
        
        CustomerdatabaseManager customerDatabaseManager= new CustomerdatabaseManager();
        customerDatabaseManager.databaseManager=new OracleDatabaseManager();
        customerDatabaseManager.getCustomer();
    }
}
