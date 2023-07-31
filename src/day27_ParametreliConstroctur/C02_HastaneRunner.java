package day27_ParametreliConstroctur;

import day17_methodOlusturma_MethodOverlooding.C01_AsalSayiBulma;

public class C02_HastaneRunner {
    public static void main(String[] args) {

       C01_Hastane personel1 = new C01_Hastane();
        System.out.println(personel1);
        System.out.println(personel1.personelIsmi); // Isim atanmadi
        System.out.println(personel1.personelTelefonu);// Telefon atanmaadi
        System.out.println(personel1.hastaneAdi);// Yildiz Hastanesi
        System.out.println(personel1.hastaneTelefonu); // 03425558757"

        personel1.personelTelefonu= "5552342323";
        personel1.personelIsmi= "Mertkan";

        C01_Hastane personel2= new C01_Hastane();
        System.out.println(personel2.personelIsmi); // Isim atanmadi
        System.out.println(personel2.personelTelefonu); // Telefon atanmadi

    }
}
