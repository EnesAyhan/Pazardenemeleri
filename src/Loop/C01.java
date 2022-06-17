package Loop;

public class C01 {
    public static void main(String[] args) {
        /*

       sayacı ritmik ilerleyen ve adım sayısı belli ise FOR kullanılır.
       DEĞİLSE While kullanılır, Eğer döngüye bir kez mutlaka girilecekse DO_WHILE kullanılır.

       TASK :
        100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).

         Ekran Çıktısı
        91
        78
        65
        52
        39
        26
        13       */

        int toplam=0;
        String bolunebilenSayilar="";

        for (int i = 1; i <=100 ; i++) {
            if (i%13==0){

                toplam+=i;
                bolunebilenSayilar+=i+" ";


            }

        }System.out.println("0'dan 100'e kadar 13'e bolunebilen sayılar : "+bolunebilenSayilar+" "+
                "\n0'dan 100'e kadar 13'e bolunebilen sayılarin toplami :"+toplam  );





    }
}
