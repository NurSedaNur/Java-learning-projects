/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma2;

import java.util.Scanner;


/**
 *
 * @author sedan
 */
public class BinaryToplama {

    public static void main(String[] args) {
        
        System.out.println("lütfen toplamak icin 2 sayi giriniz:");
        int num1, num2, toplam;
        Scanner scn = new Scanner(System.in);
        num1 = scn.nextInt();
        num2 = scn.nextInt();
        toplam = num1 + num2;
        System.out.println("girilen sayilarin toplami:" + toplam);

    }
    
}
