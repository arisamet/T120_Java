package day27_ParametreliConstroctur;

public class C03_Araba {

    String marka = "Marka Belirtilmemis";
    String model = "Model Belirtilmemis";
    int yil = 1900;
    int fiyat;
    String renk = "Renk Belirtilmemis";


C03_Araba(){
    //Herhangi bir class'a gorunur bir constr; olusturursaniz
    // default const. silinir
    // daha once default const. 'i kullanan baska class'larda
    // default const.'in silinmesi sorun olusturabilir
    // GENEL UYGULAMA OLARAK
    //bir class'a gorunur bir parametreli const. olusturursak
    // soruna sebebiyet vermemek icin
    // default const. yerine parametresiz bir const. da olusturmaliyiz.

}

        C03_Araba(String mrk, String mdl, int yl, int fyt, String rnk){
            marka = mrk;
             model= mdl;
             yil= yl;
            fiyat= fyt;
            renk= rnk;

        }
    }
