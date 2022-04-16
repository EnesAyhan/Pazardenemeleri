package StringManipulation;

import java.util.Scanner;

public class C02_indexOf_lastIndexOf {
    public static void main(String[] args) {
        /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */
        Scanner scan=new Scanner(System.in);
        System.out.println("luften adinizi soyadinizi bir bosluk girerek yaziniz");
        String adSoyad=scan.nextLine();
        int ilkBosluk=adSoyad.indexOf(" ");
        System.out.println("Adiniz : "+ adSoyad.substring(0,ilkBosluk)+
                "\nSoyadiniz :"+adSoyad.substring(ilkBosluk+1));

        //Kullanici 3 Kelimeden olusan bir deger girerse(cift soyisim kullananlar ihmal edilmistir:))
        String isim="Mert Hakan Yandas";
        int ikinciBosluk=isim.lastIndexOf(" ");
        System.out.println("Adiniz :"+isim.substring(0,ikinciBosluk)+"\nSoyadiniz :"+isim.substring(ikinciBosluk+1));


    }
}
