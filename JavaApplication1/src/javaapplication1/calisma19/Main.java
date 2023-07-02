/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma19;

/**
 *
 * @author sedan
 */
public class Main {
    public static void main(String[] args) {
        
        CustomerManager customerManager= new CustomerManager();
        CustomerManager customerManager2=new CustomerManager();
        customerManager=customerManager2;//cusMan2 nin adresini cusMan a aktarır. ikisi de cusMan2 nin adresine gider.
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
        
        //value
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);//sayi2 yi 10 yazar
        
        int[]sayilar1=new int[]{1,2,3};
        int[]sayilar2=new int[]{4,5,6};
        sayilar2=sayilar1;
        sayilar1[0]=10;
        System.out.println(sayilar2[0]);
        //ekrana 10 yazar cunku 2 degisken tek bir adresi tutar. sayılar1 degisirse sayilar 2 de aynı adresi tuttugundan o da degisir.
        
        
        
        
        
        
    }
    
}

