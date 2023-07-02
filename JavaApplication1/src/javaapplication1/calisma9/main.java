/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma9;

import java.util.Vector;

/**
 *
 * @author sedan
 */
public class main {
    public static void main(String[] args) {
       
 /*
        //2 boyutlu dizi ornek
       int [][] b=new int[3][]; 
       b[0]=new int[5];
       b[1]=new int [7];
       b[2]=new int[4];
        System.out.println("--verilen dizinin uzunlugu:"+b.length);
        System.out.println("--verilen dizinin ilk satırının uzunlugu:"+b[0].length);
 */
      
 /*
      //array list 
      ArrayList<String>list=new ArrayList<String>();//import etmek gerekiyor
      
     list.add("a");
     list.add("b");
//     list.remove("b");
//     list.clear();
//     list.add(0,"c");
//     list.set(0, "ggggg");
     
     System.out.println("listenin boyutu:"+list.size());
     System.out.println("Listenin icerigi:");   
     for (int i = 0; i < list.size(); i++) {
            System.out.println(i+". indexte "+list.get(i)+" var.");
            
        }
      
        if (list.contains("a")) {
            System.out.println("liste a iceriyor.");
        } else {
             System.out.println("liste a icerMİyor.");
        }
        if (list.isEmpty()) {
            System.out.println("lise eleman icermiyor");
        } else {
            System.out.println("lise eleman iceriyor");
        }
     
        System.out.println("--"+list.toString());
 */
 
        //VECTORS
        
        Vector<String> season =new Vector<String>(100);
        System.out.println("vectordeki eleman sayısı:"+season.size());
        System.out.println("vectorun kapasitesi:"+season.capacity());
        
        season.add("Spring");
        season.add("Summer");
        season.add("Fall");
        season.add("Winter");
        
        System.out.println("--"+season.toString());
      
//        season.remove("Spring");
        
        for (int i = 0; i < season.size(); i++) {
            System.out.println(season.get(i));
        }
       
        
        if (season.contains("Spring")) {
            System.out.println("vector Spring iceriyor.");
        } else {
              System.out.println("vector Spring icerMİyor.");
        }
        
        
        String[] array={};//bos dizi tanımladık
        array=season.toArray(array);//vectoru arraye cevirdik.
        for (int i = 0; i < array.length; i++) {
            System.out.println("----"+array[i]);
            
        }

       //DÖNGÜLER
       //1-3 aralığını döngüler yardımıyla yaz
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=3);
        
        i=1;
        while(i<=3){
            System.out.println(i);
            i++;
        }
        
        for (int j = 1; j <=3; j++) {
            System.out.println(j);
            
        }
        
        //for örnekler devamı
        for (int n = 1, p=1; n < 5&&p<10; n++,p=p*n) {
            System.out.println("n:"+n);
            System.out.println("p:"+p);
        }
        
        
    }
}
