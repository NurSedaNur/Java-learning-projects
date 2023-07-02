/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma4;

//import java.util.Scanner;

import java.util.Scanner;


/**
 *
 * @author sedan
 */
public class DöngülüToplama {
   
   /* public static void main(String[] args) {
     int toplam=0;
        for (int i = 0; i <10; i++) {
            toplam=toplam+i;
        }
        System.out.println("toplam= " + toplam);       
    }
*/
    
      
    //not ortalaması bulmayı
      public static void main(String[] args) {
        int not1;
        int not2;
        int top;
    
        System.out.println("lütfen ilk sinav notunuzu giriniz:");
        Scanner seda=new Scanner(System.in);
        not1=seda.nextInt();
        
        System.out.println("lütfen 2. notunuzu giriniz:");
        Scanner seda2=new Scanner(System.in);
        not2=seda.nextInt();
        top=(not1+not2)/2;
        System.out.println("not ortalamanız:"+top);
    }
    
    
}

