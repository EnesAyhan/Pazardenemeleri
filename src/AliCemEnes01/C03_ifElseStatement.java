package AliCemEnes01;

import java.util.Scanner;

public class C03_ifElseStatement {
    public static void main(String[] args) {
         /*
        TASK :
        Kullanıcıdan vize ve final notlarını alınız.
        Kullanıcın istediği oranlarda vize ve final yüzdeleri not ile not ortalamasını hesaplayıp
        not ortalamasını yazdırıp 50 ve büyük ise "Tebrikler dersi başarı ile geçtiniz..." küçük ise
        "Malesef dersten kaldınız..." yazdırınız
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Vize oranini giriniz");
        int vizeOrani = scan.nextInt();
        System.out.println("Final oranini giriniz");
        int finalOrani = scan.nextInt();
        int oranToplami = vizeOrani + finalOrani;

        if (oranToplami != 100) {
            System.out.println("lutfen oranlari kontrol ediniz");
        } else if (oranToplami == 100) {
            System.out.println("vize notunu giriniz");
            double vizeNotu = scan.nextInt();
            System.out.println("final notunuzu giriniz");
            double finalNotu = scan.nextInt();
            double ortalama = ((vizeNotu * vizeOrani) / 100) + ((finalNotu * finalOrani) / 100);

            if (0 > vizeNotu || vizeNotu > 100 || 0 > finalNotu || finalNotu > 100) {
                System.out.println("lutfen gecerli bir not giriniz");
            } else {
                if (ortalama >= 49.5) {
                    if (49.5 <= ortalama && ortalama < 64.5) {
                        System.out.println("Tebrikler Dersi Başari ile Geçtiniz" +
                                " \nNot Ortalamaniz: " + ortalama + " Harf notunuz: DD");
                    } else if (64.5 < ortalama && ortalama < 74.5) {
                        System.out.println("Tebrikler Dersi Başari ile Geçtiniz" +
                                " \nNot Ortalamaniz: " + ortalama + " Harf notunuz: CC");
                    } else if (74.5 < ortalama && ortalama < 84.5) {
                        System.out.println("Tebrikler Dersi Başari ile Geçtiniz" +
                                " \nNot Ortalamaniz: " + ortalama + " Harf notunuz: BB");
                    } else if (84.5 < ortalama && ortalama <= 100) {
                        System.out.println("Tebrikler Dersi Başari ile Geçtiniz" +
                                " \nNot Ortalamaniz: " + ortalama + " Harf notunuz: AA");
                    }


                } else System.out.println("Maalesef dersten kaldiniz. Harf Notunuz :FF");
            }

        }

    }
}