package day27_ParametreliConstroctur;

public class C04_ArabaRunner {

    public static void main(String[] args) {

        C03_Araba araba1 = new C03_Araba();

        System.out.println(araba1);

        araba1.marka="Mercedes";
        araba1.model= "E200";
        araba1.yil = 2010;
        araba1.fiyat= 15000;
        araba1.renk= "Siyah";
        System.out.println(araba1);
        //C03_Araba{marka='Mercedes', model='E200', yil=2010, fiyat=15000, renk='Siyah'}

        // Her yeni obje olusturdugumuzda parametresiz default const.
        //calistigindan o class'da instance variable'lara atanan degerleri alir.
        //Sonra bizim her variable icin yeniden atama yapmamiz gerekir

        // Bunun icin constr. call'a parametre olarak degerler yazalim

        C03_Araba araba2= new C03_Araba("Mercedes", "E250", 2006, 5000, "Siyah");

        System.out.println(araba2);

        C03_Araba araba3= new C03_Araba("Volvo", "C40", 2010, 30000, "kirmizi");
        System.out.println(araba3);

    }

}
