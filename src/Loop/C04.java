package Loop;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
 /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */

        Scanner scan = new Scanner(System.in);

        int toplam = 0;


        for (int i = 0; i < 5; i++) {
            System.out.println("lutfen  sayi giriniz");
            int sayi = scan.nextInt();
            if (sayi >5 && sayi < 10 ) {
                System.out.println("Girdiginiz sayi eklenmeyecek");
                continue;

            }
            toplam += sayi;
        }
        System.out.println("girdiginiz sayilarin toplami" + toplam);
    }
}
