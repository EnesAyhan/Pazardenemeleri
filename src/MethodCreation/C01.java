package MethodCreation;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        /* TASK :
           String girildiginde ilk iki karakteri haric string return eden java method yaziniz
           Ancak ilk karakter 'g' veya ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim = scan.next();
        String gizlenmisIsim = "";
        ilkIkıKarakterGizle(isim);
        System.out.println(ilkIkıKarakterGizle(isim));


    }

    private static String ilkIkıKarakterGizle(String isim) {
        String kalanHarfler = "";
        if (isim.charAt(0) == 'g' && isim.charAt(1) == 'h') {
            kalanHarfler = isim;
        } else if (isim.charAt(0) == 'g') {
            kalanHarfler = isim.substring(0, 1) + isim.substring(2);
        } else if (isim.charAt(1) == 'h') {
            kalanHarfler = isim.substring(1);
        } else kalanHarfler = isim.substring(2);


        return kalanHarfler;
    }
}
