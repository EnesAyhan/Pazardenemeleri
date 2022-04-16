package StringManipulation;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        // TASK : Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 harfli bir kelime giriniz");
        String isim=scan.nextLine();
        System.out.println("girdiginiz ismin tersten yazilisi :"+isim.charAt(3)+isim.charAt(2)+
                isim.charAt(1)+isim.charAt(0));
        String terstenIsim="";

        //DINAMIK COZUM

        for (int i = isim.length()-1; i>=0 ; i--) {
            terstenIsim+=isim.charAt(i);

        }
        System.out.println("forLoop tersten yazilis :"+terstenIsim);


    }
}
