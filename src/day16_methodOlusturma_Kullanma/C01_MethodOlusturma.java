package day16_methodOlusturma_Kullanma;

public class C01_MethodOlusturma {

    // Soru 1- Kullanicidan input olarak verilen bir String,
    // baslangic ve bitis indexlerine gore baslangic index’i dahil,
    // bitis index’i haric olacak sekilde aradaki harfleri yazdiran bir method olusturun.

    //  kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    //  kullanici str’da olan index’lerden daha buyuk bir index girerse hata mesaji yazdirin.

    public static void main(String[] args) {

        String str = "Java guzeldir";
        int baslangicIndex = 3;
        int bitisIndex = 7;
        altString("Java guzeldir", 3, 7);
        altString("Biraz sabir lutfen", 5, 4);
        altString("Bu da mi gol degil", 11, 33);
        String str1 = "Aramiz bozulmasin ";
        altString(str,3, 7 );


    }//main method sonu


    public static void altString(String metin, int baslangicIndex, int bitisIndex) {

        if (baslangicIndex > bitisIndex) {
            System.out.println("Baslangic indeksi Bitis Indexinden buyuk olamaz");
        } else if (baslangicIndex > metin.length() || bitisIndex >= metin.length()) {
            System.out.println("Verilen Index sinirlarin disinda");
        } else {
            for (int i = baslangicIndex; i < bitisIndex; i++) {
                System.out.print(metin.charAt(i));

            }
            System.out.println("");


     //      public static void main (String[]args){
     //          String str = "Java Candir";
     //          int baslangic = 5;
     //          int bitis = 7;
        /*
        Verilen String ve baslangic,bitis degerlerini dikkate alarak
        1- bitis degeri baslangic degerinden kucukse hata mesaji yazdirin
        2- baslangic veya bitis degerleri index degerleri ile uyusmuyorsa hata mesaji
        3- degerler uygunsa baslangic index'inden(dahil), bitis index'ine(haric) kadar
           karakterleri yazdirin
         */
                //           if (baslangic > bitis){
                //               System.out.println("baslangic degeri bitis degerinden buyuk olamaz");
                //           }else if(baslangic<0 || bitis<0 || baslangic>=str.length() || bitis>=str.length()){
                //               System.out.println("Indexler hatali");
                //           }else{
                //               for (int i = baslangic; i <bitis ; i++) {
                //                   System.out.print(str.charAt(i));
                //               }
                //           }
                //           System.out.println(str.substring(baslangic,bitis));
                //           str.substring(5);
                //   /*
                //       Bu method bize "Candir" döndürür
                //       ancak yazdırmazsak veya bır variable'a atamazsak
                //       bu method'un dondurdugu sonuc bir ise yaramaz
                //    */

                //           String strIstenenBolum = str.substring(5); // kaydeder ama yazdirmaz
                //           System.out.println(str.substring(5)); // yazdirir ama kaydetmez
            }

        }


    }
