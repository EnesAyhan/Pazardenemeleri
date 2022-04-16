package Pazardeneme;

import java.util.Scanner;

public class H02_Pazar09EqualsAndIgnoreCase {
    public static void main(String[] args) {

        String str1= "Ali Can";
        String str2= "Ali" + " Can";
        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        System.out.println("== ile karsilastir : " + (str1==str2));
        System.out.println("equals ile karsilastir : " + str1.equals(str2));
        String str3= str1+"";
        System.out.println("str3 : " + str3);
        System.out.println("== ile karsilastir : " + (str3==str2));
        System.out.println("equals ile karsilastir : " + str3.equals(str2));
        // String'de == herzaman dogru sonuc vermez
        // bunun icin emin oldugumuz equals method'unu kullanmayi tercih ederiz
        String str5= "hasan";
        String str6 = "HASAN";
        System.out.println(str5.equals(str6)); // false
        System.out.println(str5.toUpperCase().equals(str6)); // true

        // kullaniciya derse katili katilmak istemedigini sorun
        // evet derse, cevabini ve  "derse katiliminiz onaylanmistir" yazdirin
        // hayir derse cevabini ve "Sonraki derslerimize bekleriz" yazdirin
        Scanner scan= new Scanner(System.in);
        System.out.println("Derse katilmak ister misiniz ? \nEvet veya Hayir yaziniz");
        String cevap=scan.next();
        if (cevap.equalsIgnoreCase("evet")){
            System.out.println("cevabiniz : " + cevap + " derse katilimizniz onaylanmistir" );
        } else if (cevap.equalsIgnoreCase("hayir")){
            System.out.println("cevabiniz : " + cevap + " Sonraki derslerimize bekleriz" );
        } else {
            System.out.println("lutfen evet veya hayir yaziniz");
        }


    }
}
