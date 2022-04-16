package AliCemEnes01;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
         /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin
    yapıldıgı bie ATM app. code create ediniz
     */
        int bakiye = 1000;
        int yatirilacakPara = 0;
        int cekilecekPara = 0;
        System.out.println("hosgeldiniz");
        Scanner scan = new Scanner(System.in);
        System.out.println("Bakiye sorgulamak için 1'e basiniz");
        System.out.println("Para yatirmak için 2'ye basiniz");
        System.out.println("Para çekmek için 3'e basiniz");
        System.out.println("Çikmak için 4'e basiniz");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                System.out.println(bakiye);
                break;
            case 2:
                System.out.println("yatirmak istediginiz tutari Tl cinsinden giriniz");
                yatirilacakPara = scan.nextInt();
                bakiye += yatirilacakPara;
                System.out.println("hesabinizda " + bakiye + " TL bulunmaktadir");
                break;
            case 3:
                System.out.println("cekmek istediginiz tutari giriniz");
                cekilecekPara = scan.nextInt();
                if (bakiye < cekilecekPara) {
                    System.out.println("o kadar para yok la");
                } else {
                    bakiye -= cekilecekPara;
                    System.out.println("hesabınızda " + bakiye + " TL kalmistir");
                }
                break;
            case 4:
                System.out.println("yine gel yegenim");

        }


    }
}
