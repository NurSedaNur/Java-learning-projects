/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma26;

/**
 *
 * @author sedan
 */
public class Main {
     public static void main(String[] args) {
//        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//        System.out.println(ogretmenKrediManager.hesapla(1000));  
            
        BaseKrediManager[] krediManagers=new BaseKrediManager[]{new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};
        for(BaseKrediManager krediManager:krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }
        
         
    }
    
}  
