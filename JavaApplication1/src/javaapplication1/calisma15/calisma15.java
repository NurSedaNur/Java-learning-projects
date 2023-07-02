/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma15;


/**
 *
 * @author sedan
 */
public class calisma15 {
       
    String name;
    Double weight;
    char sex;
    
    calisma15(String n,Double w,char s){
        name=n;
        weight=w;
        sex=s;      
    }
    public static void main(String[] args) {
       
    calisma15 calisma=new calisma15("Ali",3.2,'e');
        System.out.println(calisma.name.toUpperCase());
       System.out.println(calisma.name+" "+calisma.sex+" "+calisma.weight);
  
    }
}
    

