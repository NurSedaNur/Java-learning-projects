/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma12;

/**
 *
 * @author sedan
 */
public class B extends A{
    int k;
    void kGoster(){
        System.out.println("k :"+k);
    }
    void Topla(){
        System.out.println("i+j+k :"+i+j+k);
    }
    public static void main(String[] args) {
      A ustNesne= new A();
      B altNesne=new B();
      ustNesne.i=10;
      ustNesne.j=20;
      System.out.println("ust nesne icerigi:");
      ustNesne.ijGoster();
      System.out.println();
      altNesne.i=7;
      altNesne.j=8;
      altNesne.k=9;
      System.out.println("alt nesne icerigi");
      altNesne.ijGoster();
      altNesne.kGoster();
      System.out.println();
      System.out.println("alt nesnede i,j,k toplami:"); 
      altNesne.Topla();
    }
    
}
