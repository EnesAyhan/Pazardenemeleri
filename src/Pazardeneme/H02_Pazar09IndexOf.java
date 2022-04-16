package Pazardeneme;

import java.util.Scanner;

public class H02_Pazar09IndexOf {
    public static void main(String[] args) {
        //verilen String'de istenen karakterin kullanildigi ilk index'i dondurur

        String str="Calisirsaniz, Java ogrenmek cok kolay ";
        //NOT-1>>char'in index'i sorgulanabilir
        System.out.println(str.indexOf("İndex sorgulama :"+'a'));

        //NOT-2>>PARAMETRE String OLABİLİR
        System.out.println(str.indexOf("s"));

        //NOT-3>>Olamayan Karakter sorgulanirsa sonuc=-1'dir
        System.out.println(str.indexOf("Olmayan karakter Sorgusu: "+'t'));

        //NOT-4>>PARAMETRE KELİME OLABİLİR
        System.out.println(str.indexOf("Java"));

        //NOT-5>>BELLI BIR INDEX'TEN SONRASI SORGULANABILIR
        System.out.println(str.indexOf('a',11));

        //SORU-Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle yaziniz");
        String cumle=scan.nextLine();

        System.out.println("lutfen bir harf giriniz");
        char harf= scan.next().charAt(0);

        if
        (cumle.indexOf(harf)!=-1){
            System.out.println("girdiginiz harf cumlenin icinde mevcuttur");}
        else {
            System.out.println("girdiginiz harf cumlede yoktur");}
        ;






    }
}
