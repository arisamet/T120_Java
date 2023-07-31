package day_26_forEachLoop_Constructor;

import java.util.Arrays;

public class C02_HarfKullanimAdedi {
    public static void main(String[] args) {

     //  Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa
     //  kac kere kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        String cumle = "Java her gecen gun daha zevkli hale geliyor";
        String harf= "a";

        String[] cumleArr= cumle.split("");

        int sayac= 0;

        for (String each: cumleArr
             ) {
            if (each.equals(harf)){
                sayac++;
            }

        }
        if (sayac==0){
    System.out.println("Aradiginiz harf " + harf+ "cumlede kullanilmamis");
        }else{
    System.out.println("Aradiginiz harf "+ harf+"cumlede"+ sayac+ "kere kullanilmis");
    }
    }
}
