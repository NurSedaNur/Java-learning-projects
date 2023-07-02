/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma24;

/**
 *
 * @author sedan
 */
public class Main {
    public static void main(String[] args) {
        
//        TarimKrediManager tarimkredimanager = new TarimKrediManager();
//        OgretmenKrediManager ogretmenkredimanager = new OgretmenKrediManager();
//        tarimkredimanager.Hesapla();
//        ogretmenkredimanager.Hesapla();
        
        KrediUI krediui = new KrediUI();
        krediui.KrediHesapla(new TarimKrediManager());
        krediui.KrediHesapla(new OgretmenKrediManager());
        
        
        
        
    }
}
