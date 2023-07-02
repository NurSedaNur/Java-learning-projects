/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma8;

/**
 *
 * @author sedan
 */
public class main {
    public static void main(String[] args) {

     //BİR DİZİNİN KOPYASINI YAPMAK
    /*    
        int bir[]={1,3};
        int iki[]=new int [bir.length];
       //birinci yol
//        iki=bir.clone();
//        System.out.println("--"+iki[0]);
//        System.out.println("--"+iki[1]);
        
        //ikinci yol
        for (int i = 0; i < bir.length; i++) {
          iki[i]=bir[i];
        }
        System.out.println("--"+iki[0]+"  "+iki[1]);
        */
    
   
    /*
    //İKİ DİZİNİN BİRBİRİNE EŞİT OLUP OLMADIĞINI BULMA 
    
    int bir[]={1,3};
    int iki[]={1,3};
    
    boolean esit=true;
    
        if (bir.length!=iki.length) {
            esit=false;
        } else {
            for (int i = 0; i < iki.length; i++) {
                if (bir[i]!=iki[i]) {
                    esit=false;
                }
                 
            }
        }
        if (esit) {
            System.out.println("iki dizi birbirine esittir.");
        }else
            System.out.println("iki dizi birbirine esit degildir.");
    */
    
    
    
    
    
    //YENİ ORNEK 
    
    //Elemanları tam sayı olan 5 elemanlı A adında bir diz oluşturunuz.
    int [] A=new int[5];
    
    //Dizinin her bir indexine 0-99 arasında rastgele degerler atayın. math.random()
    //math.random():0-1 arasında double degerler üretir. 1 hariç 0,0 dahil
        for (int i = 0; i < A.length; i++) {
            A[i]=(int)(Math.random()*100);
            System.out.println(""+A[i]);//ayrı for döngüsünde de yazabilirsin
        }
    
    //aritmetik ortalamayı hesapla
    int sum=0;
        for (int i = 0; i < A.length; i++) {
           sum += A[i];
        }
       
     System.out.println("verilen dizideki elemanların aritmetik ortalaması:" + (sum/ A.length));
   
    
    }  
}
