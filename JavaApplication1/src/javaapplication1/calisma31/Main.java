/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma31;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author sedan
 */
public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();
        
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
//        System.out.println(sayilar.size());
        
//        sayilar.set(2,100);
//        System.out.println(sayilar.get(2));
//        
//        sayilar.remove(0);
//        System.out.println(sayilar.get(0));
//        
//        sayilar.clear();
//        System.out.println(sayilar.size());
        
          for( Object i:sayilar){
              System.out.println(i);
          }
        System.out.println();System.out.println();
        ArrayList <String> sehirler=new ArrayList<String>();
        sehirler.add("istanbul");
        sehirler.add("ankara");
        sehirler.remove(0);//sehirler.remove("istanbul");//aynısı
        sehirler.add("samsun");
        sehirler.add("aydın");
        Collections.sort(sehirler);//alfabetik sıraya göre yazar

        for(String sehir:sehirler){
            System.out.println(sehir);
        }
       
    }
    
}
