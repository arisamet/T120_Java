package day16_methodOlusturma_Kullanma;

public class C04_BaskaClassdanMethodKullanimi {
    public static void main(String[] args) {

        C01_MethodOlusturma.altString("Method", 1, 3);//et

        System.out.println(C03_MethodOlusturma.isimduzenle("ali", "ARI"));

        // Void olan methodda sonucu kaydedemeyiz. SADECE YAZDIRIRIZ.
       // Ama bize deger donduren methodda ise sonucu istersek yazdirir istersek de kaydederiz.

        String isimDuzenli = C03_MethodOlusturma.isimduzenle("Mehmet", "Kemal");

        System.out.println(C03_MethodOlusturma.isimduzenle("Milan", "Erdem"));
        String isimDuzenli1= C03_MethodOlusturma.isimduzenle("Erdem", "Zeki");
        System.out.println(isimDuzenli1);

        //Duzenlenmis ismin uzunlugunu yazdirin
        System.out.println(isimDuzenli.length()); // 12

    //    C01_MethodOlusturma.altString("Method",1,3); // et
    //    System.out.println(C03_MethodOlusturma.isimDuzenle("bugra", "CAN")); // Bugra Can
    //    String isimDuzenli = C03_MethodOlusturma.isimDuzenle("mehmet","kemal");
    //    // duzenlenis ismin uzunlugunu yazdirin
    //    System.out.println(isimDuzenli.length());
    //  /*
    //    Void olan method'da sonucu KAYDEDEMEYIZ, sadece yazdiririz
    //    bize deger DÖNDÜREN method'da ise sonucu
    //    istersek direk yazdirir, istersek de kaydederiz
    //   */
    }
}
