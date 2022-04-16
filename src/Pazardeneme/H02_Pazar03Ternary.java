package Pazardeneme;

import java.util.Scanner;

public class H02_Pazar03Ternary {
    public static void main(String[] args) {
//NOT1=Ternary islemi if Statement ile yapacagimiz islemleri basit olarak yapmamizi saglar
//NOT2=Ternary islemi bize bir sonuc dondurecegi icin  bu islemi bir variable'a atamaliyiz
        //Soru1=kKullanicidan 2 tamsayi alin ve buyuk olmayan sayiyi yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("lutfen bir tamsayı daha giriniz");
        int sayi2=scan.nextInt();
        System.out.println((sayi1>sayi2)?sayi2:sayi1);

        //Soru2=Kullanicidan bir tamsayi alin ve sayinin tek veya cift oldugunu yazdirin
        System.out.println("lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();
        System.out.println(
                sayi%2==0?("Cift sayi"):("tek sayi")
        );



    }
}
