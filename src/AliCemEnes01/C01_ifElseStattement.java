package AliCemEnes01;

import java.util.Scanner;

public class C01_ifElseStattement {
    public static void main(String[] args) {
         /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            54 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("hizinizi giriniz");
        int hiz = scan.nextInt();
        System.out.println("Ehliyetin varsa 1 yoksa 2 sayisini giriniz");
        int ehliyetKontrol= scan.nextInt();
        int ceza = 0;
        if (54 < hiz && hiz < 75) {
            ceza = 100;
        } else if (74 < hiz && hiz < 85) {
            ceza = 150;
        }else if (84 < hiz && hiz < 95){
            ceza=320;
        }else if (94 < hiz) {
            ceza = 500;
        }else if (hiz<55){
            System.out.println("Hiziniz yasal sinirlar icerisindedir");
        }else {
            System.out.println("geri mi gidiyon hayirdir");
        }
        if (ehliyetKontrol==2){
            ceza+=200;
        }
        System.out.println("Cezaniz :"+ceza+"$");



    }
}
