/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma18;

/**
 *
 * @author sedan
 */
public class Main {

public static void main(String[] args) {
   /*
    //ORNEK 1: ASAL SAYIYI BULMAYI SAGLAR.
    int number=5;
    int a=0;
    for(int i=1;i<=number;i++){
     if(number%i==0 ) {
         a++;
     } 
    }
     if(a==2){
         System.out.println("asal");
     }else{
         System.out.println("asal degil");
     }*/
   
   /*
   //ORNEK 2:SESLİHARF KALIN SESLİ Mİ İNCE SESLİ Mİ BULMAYI SAGLAR.
   char harf='Ü';
   if(harf=='A'||harf=='I'||harf=='U'||harf=='O'){
       System.out.println("kalın sesli");
   }else if(harf=='E'||harf=='İ'||harf=='Ü'||harf=='Ö'){
       System.out.println("ince sesli");
   }
   */
  
   /*
   //CALİSMA 3: SAYİNİN MUKKEMMEL OLUP OLMADIGINI BULMAYI SAGLAR.
   //pozitif tam bolenlerinin toplamı sayıya esitse müq sayıdır.
   //6-->1,2,3
   //28-->1,2,4,7,14
   int toplam=0;
   int sayi=6;
    for (int i = 1; i < sayi; i++) {
        if(sayi%i==0){
            toplam+=i;
        }
    }
    if(sayi==toplam){
        System.out.println("müqq sayidir");
    }else{
        System.out.println("degil.");
    }
*/
   
/*
   //CALİSMA 4:ARKADAS SAYİLARİ BULMA.---220 ve 284 arkadas sayidir.
   int sayi1=220,sayi2=284;
   int toplam1=0,toplam2=0;
   for(int i=1;i<sayi1;i++){
       if(sayi1%i==0){
           toplam1+=i;
       }
   }
   for(int j=1;j<sayi2;j++){
       if(sayi2%j==0){
           toplam2+=j;
       }
   }
    if(sayi1==toplam2 && sayi2== toplam1)
        System.out.println("arkadas sayilardir");
    else
        System.out.println("degildir");
   */

  /*
   //CALİSMA 5 : SAYİ BULMA.
   int [] sayilar= new int[]{1,2,5,7,9,0};
   int aranacak=5;
   boolean var=true;
   for(int i=0;i<sayilar.length;i++){
       if(aranacak==sayilar[i]){
          var=true;
          break;
       }else{
          var=false;
       }
   }
   if(var==true)
        System.out.println("var");
   else
        System.out.println("yokk");

*/

}
 
}
