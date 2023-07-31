package day04_dataCasting_wrapperClass;

import java.util.Locale;

public class C03_CharDataCasting {
    public static void main(String[] args) {

        char ch1= 'a';

        int sayi1= ch1;
        System.out.println("ch1 : "+ ch1);
        System.out.println("sayi1:  "+ sayi1);

        String str1=  "Java";
        String str2= " ";
        String str3 = "Candir";
        System.out.println(str1+str2+str3);

        char ch2= '1';
        char ch3= '2';
        System.out.println(ch3+ch2);

        int karakter= 120;

        char ascideger= (char)karakter;

        System.out.println("verilen sayinin asci tablosundaki degeri : "+ ascideger);

    }
}
