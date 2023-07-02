/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma10;

import java.util.ArrayList;

/**
 *
 * @author sedan
 */
public class Automobile {

    double fuel;
    double speed;
    String license;
    static int numAutomobile;//her otomobile gore degismediginden static yaptık(oto. sayısı)

  
    public static void main(String[] args) {
        //mercedes olustur. deposu 5.0 , speed 300 km/sa ,license "34 dg 5665"  
        Automobile mercedes = new Automobile(5.0, 300, "34 dg 5665");
        System.out.println("aracın plakası: " + mercedes.getLicense());
        System.out.println("aracın hizi:" + mercedes.getSpeed() + " km/sa");

        Automobile ford = new Automobile(4.0, 250);
        ford.setLicense("41 ad 2232");
        System.out.println("aracın plakası: " + ford.getLicense());
        System.out.println("aracın hizi: " + ford.getSpeed() + " km/sa");

        //aracın hızını arttıran increaseSpeeed adında metod yazdırın.
        //main mteodunun icine yazılamaz , metot içinde metod olmaz.
        //Bu metod double artırma oranı alacak ve o oranda arttıracak.
        
        System.out.println("------fordun hızlanmadan onceki hizi:"+ford.getSpeed());
        ford.increaseSpeed(0.5);
        //static bir metodun icinden non static bir metod direk cagırılamaz.staticten static cagirilir.
        //ford.increaseSpeed gibi basına ford. yazılmalıdır.
        System.out.println("------fordun hızlanDIKTAN SONRAKİ hizi:"+ford.getSpeed());
      
        Automobile porche = new Automobile(6.0, 500, "13 ggg 3434");
        
        getNumAutomobile();    // static bir metodda baska bir static metod direk cagırılabilir.
          
         
        
        //array list ile yaptık
        ArrayList<Automobile> otopark=new ArrayList<>();
        otopark.add(ford);
        otopark.add(mercedes);
        otopark.add(0, porche); //ilk porche yi yazdırır
        //array list te basa sona yeni obje eklemek cok kolay ama dizide zor.
        
        for (int i = 0; i < otopark.size(); i++) {
            System.out.println("----aaaaaaaaaaa----"+otopark.get(i).getLicense());
        }   
        
        // dizi ile yaptık
        Automobile[]otopark1=new Automobile[2];
        otopark1[0]=ford;
        otopark1[1]=mercedes;
        for (int i = 0; i < otopark1.length; i++) {
            System.out.println("--diziiiiiiiii------"+otopark1[i].getLicense());
            
        }
        System.out.println("---+++++++++"+ford);//alttaki to string icin(fordu toString yapar)
   } 
        
    public String toString(){
      return "hello";
    }
    
    
    public static int getNumAutomobile(){   //static metod
        return numAutomobile;
    }

    public void increaseSpeed(double hızArtışOranı){//non static metod
        speed+=speed*hızArtışOranı;
        Automobile.getNumAutomobile();
        // non static bir metodda static bir metod cagırıken basına class ismini yazıp nokta koyarak metodu ekleriz.
    }
    
    
    
    
    
    //---------------------------------------------------------------------------
    
    //getters and setters metotları
    //metod oldukları icin main altında yazılamaz ayrı yazılmalıdır.
    //degiskenlerin degerlerini getirmeye getters metodu, degistirmeye setters metodu denir.
//    public double getFuel(){
//        return fuel;
//    }
//    public void setFuel(double fuel){
//        this.fuel=fuel;  //this.fuel demek yeni aldıgı fuel degerini bu fuel e aktar demek. karismasin diye
//    }
    //ALT FN DEL ile getter and setter kısayolu ile yapabiliriz.
    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
    
   
    

    //default constructor -- zero parameter constructor
    Automobile() {
    }

    Automobile(double f, double s, String l) {
        fuel = f;
        speed = s;
        license = l;
    }

    Automobile(double f, double s) {
        fuel = f;
        speed = s;
       // license= getLicense();
       //non static metoddan baska bir non static metod direk cagırılabilir
    }
}
