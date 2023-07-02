/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma3;

import java.util.Scanner;

/**
 *
 * @author sedan
 */

public class EkrandanStringOkuma {
 
    /*
    //ekrandan alınan 3 kelimeyi ekrana alt alta yazdıran kod
        public static void main(String[] args) {
        System.out.println("Lütfen 3 kelime giriniz");
        String kelime1, kelime2,kelime3;
       
        Scanner scn =new Scanner (System.in);
        kelime1 =scn.next();
        kelime2=scn.next();
        kelime3=scn.next();
        
        System.out.println("kelime1=" +kelime1);
        System.out.println("kelime2=" +kelime2);
        System.out.println("kelime3=" +kelime3);
       
    }
    */
    
    //ekrandan alınan 3 kelimeyi aralarında boşluk olacak şekilde yan yana yazdıran kod
     public static void main(String[] args) {
        System.out.println("Lütfen 3 kelime giriniz");
        String kelime1, kelime2,kelime3;
       
        Scanner scn =new Scanner (System.in);
        kelime1 =scn.next();
        kelime2=scn.next();
        kelime3=scn.next();
        
       // System.out.println( kelime1 + "" + kelime2 + "" +kelime3 );
       
         System.out.print(kelime1  + "");
         System.out.print(kelime2  + "");
         System.out.print(kelime3);  //burada println kullanırsak build... yazısı alta geçer 
    }
     
    
    
}
