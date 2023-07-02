/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma26;

/**
 *
 * @author sedan
 */
public class OgrenciKrediManager extends BaseKrediManager{
    public double hesapla(double tutar){//final olarak tanımlasaydık override edemezdik,yasaklanmış olurdu.
        return tutar*1.10;
    }
}
