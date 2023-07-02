/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma14.kalıtım_AveB;

import java.util.ArrayList;

/**
 *
 * @author sedan
 */
public class A {
    private int n;
    public A(int n){
        this.n=n;
    }
    public String toString(){
        return "ben a yım";
    }
    public static void main(String[] args) {
        //3 elemanlı a sınıfı tıpınde dizi olustur.
        //2 adet a 1 adet b nesnesi yerlestır.
        //dongu icinde ekrana yazdır
       A [] values=new A [3];
       A bir= new A(1);
       A iki= new A(2);
       B biri=new B(1.0f);
       values[0]=bir;
       values[1]=iki;
       values[2]=biri;
       
        for (int i = 0; i < values.length; i++) {
            System.out.println("--"+values[i].toString());
        }
       
    }
}
class B extends A{
    public float x;
    public B(){ 
        super(0);
        this.x=1.0f;
    }
    public B(float x){
        super(1);
        this.x=x;
       
    }
     public String toString(){
        return "ben b yim";
    }
}