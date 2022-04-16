package SwitchCase;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi hafta başlangıcı

        Scanner scan = new Scanner(System.in);
        System.out.println("\nPazartesi:1 \nSali: 2 \nCarsamba: 3 \nPersembe: 4\nCuma: 5\nCumartesi: 6\nPazar: 7"+
                "\nhaftanin kacinci gununde oldugunuzu giriniz :");
        int girilenGun = scan.nextInt();
        System.out.println("kac gun ilerlemek istediginizi giriniz:0");
        int ilerleyenGun = scan.nextInt();
        int gun = (ilerleyenGun + girilenGun) % 7;
        if (girilenGun < 1 || girilenGun > 7) {
            System.out.println("hatali veri girdiniz");
        } else {

            switch (gun) {
                case 1:
                    System.out.println(ilerleyenGun + "sonra gunlerden: Pazartesi");
                    break;
                case 2:
                    System.out.println(ilerleyenGun + "sonra gunlerden: Sali");
                    break;
                case 3:
                    System.out.println(ilerleyenGun + "sonra gunlerden: Carsamba");
                    break;
                case 4:
                    System.out.println(ilerleyenGun + "sonra gunlerden: Persembe");
                    break;
                case 5:
                    System.out.println(ilerleyenGun + "sonra gunlerden: Cuma");
                    break;
                case 6:
                    System.out.println(ilerleyenGun + "sonra gunlerden: Cumartesi");
                    break;
                case 0:
                    System.out.println(ilerleyenGun + "sonra gunlerden: Pazar");
                    break;
            }

        }
    }
}