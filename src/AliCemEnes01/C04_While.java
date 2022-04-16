package AliCemEnes01;

public class C04_While {
    public static void main(String[] args) {
/* TASK :
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)

        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365

        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10

      */
        double n = 7;
        double r = 2;
        double sonuc = 1;

        while (r > 0){
            sonuc = (sonuc * n)/r;
            n--;
            r--;
        }
        System.out.println("ilk sonuc "+sonuc);


        int sayi1 = 7;
        int sayi2 = 2;
        int sonuc1 = 1;
        int sonuc2 = 1;
        int sonuc3 = 1;
        int sayilarFarki=sayi1-sayi2;

        while (sayi1 > sayilarFarki){

            sonuc1*=sayi1;
            sayi1--;
        }

        while (sayi2>0){

            sonuc2*=sayi2;
            sayi2--;

        }
        sonuc3=sonuc1/sonuc2;
        System.out.println("ikinci sonuc "+sonuc3);
    }
}
