package day13_StringManipulations_forLoop;

public class C02_ReplaceAll {
    public static void main(String[] args) {

        String str = "1Ja4va 8C9a2n5d1i1r.";
        str= str.replace("1", "");
        System.out.println(str);

        System.out.println(str.replaceAll("\\d", ""));


       // \\s : space     \\S : space olmayan hersey
       // \\s+ : yanyana birden fazla space
       // \\d : digits        \\D : digit olmayan hersey
       // \\w : harf veya rakam veya _
        // \\W : harf veya rakam olmayan hersey


    }
}
