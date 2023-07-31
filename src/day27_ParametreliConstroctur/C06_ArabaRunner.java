package day27_ParametreliConstroctur;

public class C06_ArabaRunner {
    public static void main(String[] args) {

        C05_Araba araba1= new C05_Araba("Opel",2010, 4000);
        System.out.println(araba1);
        //Araba bilgileri ==> marka:'Opel', model:'Model belirtilmemis', yil:2010,
        // fiyat:4000, renk:'Renk belirtilmemis'

        C05_Araba araba2= new C05_Araba("Nissan", "Micra", 2005);

       // Araba bilgileri ==> marka:'Opel', model:'Model belirtilmemis', yil:2010,
        // fiyat:4000, renk:'Renk belirtilmemis'


    }
}
