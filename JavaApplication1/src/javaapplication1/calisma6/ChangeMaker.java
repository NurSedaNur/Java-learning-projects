/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma6;

import java.util.Scanner;

/**
 *
 * @author sedan
 */
public class ChangeMaker {
    //En az sayıda paraya dönüştürdüğümüzü düşünelim 
    //quarter:25   (amount:girilen para)
    //dimes:10
    //nickels:5
    //pennies:1
    
    public static void main(String[] args) {
        int amount,originalAmaount,quarters,dimes,nickels,pennies;
        System.out.println("Lütfen bozdurmak istediğiniz1-99 arası para miktarını giriniz:");
        System.out.println("Her bir paradan kaç tane olduğunu ekrana yazdıracağım.");
        
        Scanner sc=new Scanner(System.in);
        amount=sc.nextInt();
        originalAmaount=amount;
        
        quarters=amount/25;//kaç tane 25li yapıcan
        amount=amount%25;//geriye ne kaldı
        dimes=amount/10;//geriye kalandan kaç tane 10luk yapıcan
        amount=amount%10;//gerye ne kaldı
        nickels=amount/5;//geriye kalandan kaç tane 5lik yapıcan
        amount=amount%5;//geriye ne kaldı
        pennies=amount;//kaç tane birlik yapıcan
        
        System.out.println("siz bana "+originalAmaount+" verdiniz. Ben size:");
       if(quarters!=0)
        System.out.println(quarters+" quarters");
       if(dimes!=0)
        System.out.println(dimes+" dimes");
       if(nickels!=0)
        System.out.println(nickels+" nickels");
       if(pennies!=0)
        System.out.println(pennies+" pennies");
       System.out.println("verdim.");
      
        
    }

}
