package MethodCreation;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
/*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.

 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yapmak istediginiz islemi giriniz \nSaati saniyeye cevirmek icin 1'e" +
                "\nMili kilometreye cevirmek icin 2'ye" + "\nKilogrami grama cevrimek icin 3'e basiniz");
        int islem = scan.nextInt();
        if ((islem >= 4) || (islem <= 0)) {
            System.out.println("lutfen gecerli bir islem giriniz");
        } else {
            System.out.println("lutfen cevirmek istediginiz rakami giriniz");
            double girdi = scan.nextDouble();

            donustur(islem, girdi);

        }


    }

    private static void donustur(int islem, double girdi) {
        switch (islem) {
            case 1:
                System.out.println(girdi + " saat " + girdi * 3600 + " saniyedir.");
                return;
            case 2:
                System.out.println(girdi + " mil " + girdi * 1.61 + " km'dir.");
                return;
            case 3:
                System.out.println(girdi + " kilogram " + girdi * 1000 + " gramdir.");
                return;
            default:
                System.out.println("lutfen ilk 3 islemden birini seciniz");
        }
    }
}
