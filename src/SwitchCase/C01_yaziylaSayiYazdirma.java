package SwitchCase;

import java.util.Scanner;

public class C01_yaziylaSayiYazdirma {
    public static void main(String[] args) {
        // 2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 3 basamakli bir sayi giriniz");
        int sayi= scan.nextInt();
        int birlerBasamagı=sayi%10;
        int onlarBasamagı=(sayi/10)%10;
        int yuzlerBasamagı=(sayi/100);

        if (sayi > 99 && sayi < 1000){
            switch(yuzlerBasamagı) {
                case 1:
                    System.out.println("yuz");
                    break;
                case 2:
                    System.out.println("ikiyuz");
                    break;
                case 3:
                    System.out.println("ucyuz");
                    break;
                case 4:
                    System.out.println("dortyuz");
                    break;
                case 5:
                    System.out.println("besyuz");
                    break;
                case 6:
                    System.out.println("altıyuz");
                    break;
                case 7:
                    System.out.println("yediyuz");
                    break;
                case 8:
                    System.out.println("sekizyuz");
                    break;
                case 9:
                    System.out.println("dokuzyuz");
                    break;
            }

            switch(onlarBasamagı) {
                case 1:
                    System.out.println("on");
                    break;
                case 2:
                    System.out.println("yirmi");
                    break;
                case 3:
                    System.out.println("otuz");
                    break;
                case 4:
                    System.out.println("kırk");
                    break;
                case 5:
                    System.out.println("elli");
                    break;
                case 6:
                    System.out.println("altmıs");
                    break;
                case 7:
                    System.out.println("yetmis");
                    break;
                case 8:
                    System.out.println("seksen");
                    break;
                case 9:
                    System.out.println("doksan");
                    break;
            }

                    switch(birlerBasamagı){
                        case 1:
                            System.out.println("bir");
                            break;
                        case 2:
                            System.out.println("iki");
                            break;
                        case 3:
                            System.out.println("uc");
                            break;
                        case 4:
                            System.out.println("dort");
                            break;
                        case 5:
                            System.out.println("bes");
                            break;
                        case 6:
                            System.out.println("altı");
                            break;
                        case 7:
                            System.out.println("yedi");
                            break;
                        case 8:
                            System.out.println("sekiz");
                            break;
                        case 9:
                            System.out.println("dokuz");
                            break;


        }




    }else System.out.println("lutfen 3 basamkli bir sayi giriniz");
}
}
