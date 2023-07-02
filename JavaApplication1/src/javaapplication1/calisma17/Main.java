/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma17;

/**
 *
 * @author sedan
 */
public class Main {
    // ahmet ,ayse ,marry olustur ;selam ver
    //istanbullu ahnet merhaba dedi
    //artvinli ayse merhaba dedi
    //almanya lı marry hello dedi            --------yazdır
    //3elemanlı diziye aktar ,for dongusuyle yazdır
    
    public static void main(String[] args) {
    Turk t=new Turk("ayse");
    Turk t2=new Turk ("ahmet");
    Ingiliz ı=new Ingiliz("mary"); 
    
    
    Insan[]insanlar=new Insan[3];
   // Insan[0]="ahmet";
    
    System.out.println(t.merhaba());
    System.out.println(t2.merhaba());
    System.out.println(ı.merhaba());
    
    }
    
    
  
}
