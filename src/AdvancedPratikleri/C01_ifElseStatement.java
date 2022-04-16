package AdvancedPratikleri;

import java.util.Scanner;

public class C01_ifElseStatement {
    public static void main(String[] args) {
        /*
         * TASK :

         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin,
         * kullaniciya musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("luften aldiginiz urunun liste fiyatini giriniz");
        double urunFiyati = scan.nextDouble();
        System.out.println("lutfen aldiginiz urunun adedini giriniz");
        int urunAdedi = scan.nextInt();

        System.out.println("magaza kartiniz varsa 1'e  \nyoksa 2'ye basiniz");
        int kartVarmı = scan.nextInt();
        if (kartVarmı == 1) {
            if (urunAdedi >= 10) {
                System.out.println("toplam Fiyat: " + urunFiyati * (0.8) * urunAdedi +
                        " \nurun adet fiyati: " + urunFiyati * (0.8) + " Tl'dir");
            } else if (urunAdedi < 10 && urunAdedi > 0) {
                System.out.println("toplam Fiyat: " + urunFiyati * (0.85) * urunAdedi +
                        " \nurun adet fiyati: " + urunFiyati * (0.85) + " Tl'dir");

            } else System.out.println("hatali giris");

        } else if (kartVarmı == 2) {
            if (urunAdedi >= 10) {
                System.out.println("toplam Fiyat: " + urunFiyati * (0.85) * urunAdedi +
                        " \nurun adet fiyati: " + urunFiyati * (0.85) + " Tl'dir");
            } else if (urunAdedi < 10 && urunAdedi > 0) {
                System.out.println("toplam Fiyat: " + urunFiyati * (0.9) * urunAdedi +
                        " \nurun adet fiyati: " + urunFiyati * (0.9) + " Tl'dir");

            }


        }else System.out.println("hatali giris");
    }
}
