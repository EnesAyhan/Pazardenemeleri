package Pazardeneme;

import java.util.Locale;
import java.util.Scanner;

public class H01_Pazar06 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen gunismi giriniz");
        String gunIsmı= scan.next().toUpperCase(Locale.ROOT);
  if (gunIsmı.equals("PAZARTESİ")||gunIsmı.equals("SALI")||gunIsmı.equals("CARSAMBA")||
gunIsmı.equals("PERSEMBE")||gunIsmı.equals("CUMA")||gunIsmı.equals("CUMARTESI")||gunIsmı.equals("PAZAR")){
    System.out.println("Girdiginiz Gun :"+gunIsmı.charAt(0));
} else {
      System.out.println("lutfen gecerli bir gun ismi giriniz");
  }







    }
}
