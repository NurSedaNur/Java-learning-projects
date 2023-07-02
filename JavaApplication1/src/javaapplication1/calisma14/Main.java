/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1.calisma14;


public class Main {
    public static void main(String[] args) {  
        System.out.println("sinema bir icin :\n");
        Sinema sinema1 = new Sinema(3, 40);
        Sinema sinema2 = new Sinema(2, 35);
        Sinema sinema3 = new Sinema(1, 30);

        sinema1.BiletSat();
        sinema1.BiletSat();
        sinema1.BiletSat();
        System.out.println("sinema1 bos koltuk : " + sinema1.BosKoltukOgren());
        System.out.println("Tum bilet satisi :" + sinema1.TumSatilanBiletSayisiniOgren());
        sinema1.BiletIptal();
        System.out.println("sinema1 iptal sonrası boş koltuk : " + sinema1.BosKoltukOgren());

        System.out.println("");
        System.out.println("sinema 2 icin:\n");
        sinema2.BiletSat();
        sinema2.BiletSat();
        System.out.println("sinema2 bos koltuk : " + sinema2.BosKoltukOgren());
        System.out.println("Tum bilet satisi :" + sinema2.TumSatilanBiletSayisiniOgren());
        sinema2.BiletIptal();
        System.out.println("sinema2 iptal sonrası boş koltuk : " + sinema2.BosKoltukOgren());

        
        System.out.println("");
        System.out.println("sinema 3 icin :\n");
        sinema3.BiletSat();
        sinema3.BiletSat();
        sinema3.BiletSat();
        System.out.println("sinema3 bos koltuk : " + sinema3.BosKoltukOgren());
        System.out.println("Tum bilet satisi :" + sinema3.TumSatilanBiletSayisiniOgren());
        sinema3.BiletIptal();
        System.out.println("sinema3 iptal sonrası boş koltuk : " + sinema3.BosKoltukOgren());
    }
}
class Sinema {

    private int salonNo;
    private int toplamKoltukSayisi;
    private int satilanBiletSayisi;
    private static int toplamSatilanBiletSayisi;

    Sinema() {

    }
    Sinema(int salonNo, int toplamKoltukSayisi) {
        this.salonNo = salonNo;
        this.toplamKoltukSayisi = toplamKoltukSayisi;
    }
    public void BiletSat() {
        satilanBiletSayisi++;
        toplamSatilanBiletSayisi++;
    }
    public void BiletIptal() {
        satilanBiletSayisi--;
        toplamSatilanBiletSayisi--;
    }
    public int BosKoltukOgren() {
        return (toplamKoltukSayisi - satilanBiletSayisi);
    }
    public int TumSatilanBiletSayisiniOgren() {
        return toplamSatilanBiletSayisi;
    }
}
