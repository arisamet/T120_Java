package day22_ArraysveMultidimensionelArrays;

public class C01_Arrays {
    public static void main(String[] args) {

        String[] isimler= {"Ayse", "Yusuf", "Bugra", "Abdullah","Nergiz"};
        // Vetilen bir arraydeki uzunlugu tek sayi olan isimleri
        // yan yana aralarinda bir bosluk birakarak yazdirin
        // en sonda alt satira gecerek toplam kac isim yazdirilmdigini yazdirin

        int sayac =0;
        int kelimeUzunlugu = 0;


        for (int i = 0; i < isimler.length; i++) {

            kelimeUzunlugu= isimler[i].length();
            if (kelimeUzunlugu % 2 ==1){
                System.out.println(isimler[i]+ " ");
                sayac++;
            }
        }

        System.out.println("\nToplam " + sayac+ " adet isim yazdirildi");
    }
}
