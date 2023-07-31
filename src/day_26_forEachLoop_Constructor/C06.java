package day_26_forEachLoop_Constructor;

public class C06 {


    C06(){
        // Bu Constrocteur default Constrocteur'in ozelliklerine sahiptir
        // ama bu Constrocteur gorunur oldugundan buna default Constrocteur diyemeyiz
        // bu Constrocteur'i ekledigimiz icin default Constrocteur silinir.
    }

    void C06(){
        // bu bir Constrocteur degildir
        // ama return type'i oldugundan methoddur


    }

  //  c06() {
        // Invalid method declaration; return type required
    // class adi ile ayni olmadigindan Constrocteur olmaz
    // return type'i olmadigi icin method da olmaz
    //bunun icin Java altini kirmizi cizer.(CTE verir)

    }
    /*
    Constrocteur bazi kaynaklarda ozel bir method diye gecer

   Ama cogunlugun kabuluyle Constrocteur baska yapilardan farkli kendisine ozgu bir yapidir

   Constrocteur Constrocteurdir

   Bir kod blogunun Constrocteur olabilmesi icin
   2 sarti gerceklestirmesi gerekir

   1- ismi class ismi ile ayni olmalidir
   2- Return type'i olmaz
     */
