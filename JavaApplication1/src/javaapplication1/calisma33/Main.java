/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma33;

import java.util.HashMap;

/**
 *
 * @author sedan
 */
public class Main {
    public static void main(String[] args) {
        
        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("book","kitap");
        sozluk.put("table", "masa");
        sozluk.put("computer", "bilgisayar");
        System.out.println(sozluk.size());
        
        for(String item:sozluk.keySet()){
            System.out.println("eleman : "+item+"\tdeger : "+sozluk.get(item));
        }
        sozluk.remove("table");
        sozluk.clear();
        System.out.println(sozluk.size());
        System.out.println(sozluk.get("table"));
        
        
    }
    
}
