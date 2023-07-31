package marketProject;

import java.util.Scanner;

public class T120_WiseMarket {


    //  =================== WISE MARKET KASA PROGRAMI ===================================
    //  ilk programa girildiginde bizi bir menu karsilasin bu secenekler
    //  1 ŞARKÜTERİ ÜRÜNLERİ
    //  2 MANAV ÜRÜNLERİ
    //  3 MARKET
    //  secime gore ,
    //  4-urunleri listele ve
    //  5-fiyatlari gelsin

    //    Bir market yazılımı yazdığınızı düşünerek aşşağıdaki menü ile giriş yapıp, ilgili bölüme yönlendiren
    //    alışveriş yaptıran ve sepet tutarını hesaplayarak hafızada tutan, kasaya gidince giş yazdıran bir program
    //    hazırlayın

    // variable lari belirleyelim
    //Urun adi, urun fiyati, urun miktari, urun kodu, sepet , toplam

    static Scanner scan = new Scanner(System.in);
    static String urunAdi;
    static double urunFiyati;
    static double urunMiktari;
    static int urunKodu;
    static String sepet = "";
    static double toplam;
    static boolean ekUrun = false;


    public static void main(String[] args) {
        girisEkrani();

    }


    public static void girisEkrani() {


        System.out.println("=================   WISE MARKET  =============");
        System.out.println("=================   Hosgeldiniz  ==============");
        System.out.println("==================     Menu     ================");
        System.out.println("Lutfen Alisveris Yapmak Istediginiz Reyonu Seciniz");
        System.out.println("1 - Şarküteri\n2- Manav \n3 - Market\n4 - Fiş Yazdır\n5 - Çıkış\" ");

        int secim = scan.nextInt();
        if (!(secim >= 1 && secim <= 5)) {
            System.out.println("Uyari: Gecersiz bir tusa bastiniz. Yeniden deneyiniz");
            girisEkrani();
        } else {
            switch (secim) {
                case 1:
                    sarkuteri();
                    break;
                case 2:
                    manav();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:
            }
        }
    }

    public static void sarkuteri() {
        System.out.println("Sarkuteri Reyonuna Hosgeldiniz");
        System.out.println("Lutfen almak istediginiz urun numarasini giriniz: \n61-Kasar Peyniri 130 TL\n62-Zeytin 80TL\n63-Sucuk 200TL\n64-Kiyma 350TL");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 61 && urunKodu <= 64) {
                System.out.println("Kac kg alacaksiniz");
                urunMiktari = scan.nextInt();
                switch (urunKodu) {
                    case 61:
                        urunAdi = "Kasar Peyniri";
                        urunFiyati = 130;
                        System.out.println(urunMiktari + "kg" + urunAdi + ":" + (urunFiyati * urunMiktari) + "TLdir");
                        break;
                    case 62:
                        urunAdi = "Zeytin";
                        urunFiyati = 120;
                        System.out.println(urunMiktari + "kg" + urunAdi + ":" + (urunFiyati * urunMiktari) + "TLdir");
                        break;
                    case 63:
                        urunAdi = "Sucuk";
                        urunFiyati = 200;
                        System.out.println(urunMiktari + "kg" + urunAdi + ":" + (urunFiyati * urunMiktari) + "TLdir");
                        break;
                    case 64:
                        urunAdi = "Kiyma";
                        urunFiyati = 350;
                        System.out.println(urunMiktari + "kg" + urunAdi + ":" + (urunFiyati * urunMiktari) + "TLdir");
                        break;
                }
                    urunFiyati = urunMiktari * urunFiyati;
                    toplam += urunFiyati;
                    System.out.println("Olusan sepet Tutari: " + toplam);
                    sepet += urunAdi + " : " + urunFiyati + "TLdir";
                    System.out.println("Baska bir urun eklemek isterseniz urun kodunu giriniz\n Ana Menuye donmek icin 0 tusuna basiniz");

                } else if (urunKodu == 0) {
                    girisEkrani();
                }
            }
        }

        public static void manav () {
            System.out.println("Manav Reyonuna Hosgeldiniz");
            System.out.println("Lutfen alacaginiz urun kodunu giriniz:\n71-Muz- 60 TL72-Patates-25 TL\n73-Elma- 49 TL\n74-Sogan- 25 TL\n75-Domates- 35 TL\n76-Ananas- 59 TL");
            while (!ekUrun) {
                urunKodu = scan.nextInt();
                if (urunKodu >= 71 && urunKodu <= 75) {
                    System.out.println("Kac kg alacaksiniz?");
                    urunMiktari = scan.nextInt();
                    switch (urunKodu) {
                        case 71:
                            urunAdi = "Muz";
                            urunFiyati = 60;
                            System.out.println(urunMiktari + " kg" + urunAdi + "fiyati: " + urunFiyati * urunMiktari + " TL'dir");
                            break;
                        case 72:
                            urunAdi = "Patates";
                            urunFiyati = 25;
                            System.out.println(urunMiktari + " kg" + urunAdi + "fiyati: " + urunFiyati * urunMiktari + " TL'dir");
                            break;
                        case 73:
                            urunAdi = "Elma";
                            urunFiyati = 49;
                            System.out.println(urunMiktari + "kg" + urunAdi + "fiyati: " + urunFiyati * urunMiktari + "TL'dir");
                            break;
                        case 74:
                            urunAdi = "Sogan";
                            urunFiyati = 20;
                            System.out.println(urunMiktari + "kg" + urunAdi + "fiyati: " + urunFiyati * urunMiktari + "TL'dir");
                            break;
                        case 75:
                            urunAdi = "Domates";
                            urunFiyati = 39;
                            System.out.println(urunMiktari + "kg" + urunAdi + "fiyati: " + urunFiyati * urunMiktari + "TL'dir");
                            break;
                        case 76:
                            urunAdi = "Ananas";
                            urunFiyati = 59;
                            System.out.println(urunMiktari + "kg" + urunAdi + "fiyati: " + urunFiyati * urunMiktari + "TL'dir");
                            break;
                    }
                    urunFiyati = urunFiyati * urunMiktari;
                    toplam += urunFiyati;
                    System.out.println("Olusan Sepet Tutari" + toplam);
                    sepet += urunAdi + " : " + urunFiyati + " TL \n";
                    System.out.println("Baska urun almak isterseniz kodunu giriniz. Ana menuye donmek icin 0 tusuna basiniz.");
                } else if (urunKodu==0) {
                    girisEkrani();
                }
            }


        }
        public static void market () {
            System.out.println("Market Reyonuna Hosgeldiniz");
            System.out.println("Lutfen Satin Almak istediginiz Urunun Kodunu Giriniz:\n81-Nutella-103 TL\n82-Ekmek- 8 TL\n83-Yumurta- 76 TL\n84-Yogurt-29 TL ");
            while (!ekUrun){
                urunKodu= scan.nextInt();
                if (urunKodu>=81 && urunKodu<=84){
                    System.out.println("Kac kg/adet alacaksiniz?");
                    urunMiktari= scan.nextInt();
                    switch (urunKodu){
                        case 81:
                            urunAdi = "Nutella";
                            urunFiyati = 103;
                            System.out.println(urunMiktari + " kg" + urunAdi + "fiyati: " + urunFiyati * urunMiktari + " TL'dir");
                            break;
                        case 82:
                            urunAdi = "Ekmek";
                            urunFiyati = 8;
                            System.out.println(urunMiktari + " kg" + urunAdi + "fiyati: " + urunFiyati * urunMiktari + " TL'dir");
                            break;
                        case 83:
                            urunAdi = "Yumurta";
                            urunFiyati = 76;
                            System.out.println(urunMiktari + " kg" + urunAdi + "fiyati: " + urunFiyati * urunMiktari + " TL'dir");
                            break;
                        case 84:
                            urunAdi = "Yogurt";
                            urunFiyati = 29;
                            System.out.println(urunMiktari + " kg" + urunAdi + "fiyati: " + urunFiyati * urunMiktari + " TL'dir");
                            break;
                    }
                    urunFiyati= urunMiktari*urunFiyati;
                    toplam +=urunFiyati;
                    System.out.println("Olusan Sepet Tutari: "+ toplam);
                    sepet +=urunAdi+" : "+ urunFiyati+ " : " +" TL'dir\n";
                    System.out.println(" Baska urun almak isterseniz kodunu giriniz. Ana menuye donmek icin 0 tusuna basiniz.\"); ");
                }else if (urunKodu==0) {
                    girisEkrani();
                }
            }
        }

        public static void fisYazdir () {
            System.out.println("===========T120- WISE MARKET ==============");
            System.out.println("======== Bizi Tercih Ettiginiz icin Tesekkur Ederiz ======");
            System.out.println("----------    Alisveris Bilgileriniz      --------------");
            System.out.println("\n \n");
            System.out.println("Alisveris Listeniz\n " + sepet);
            System.out.println(" ");
            System.out.println("");
            System.out.println("Alisveris Fisi ");
            girisEkrani();
        }

        public static void cikis () {
            System.out.println("Cikis Ekrani");
            girisEkrani();
        }


    }












