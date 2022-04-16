package MethodCreation;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
  /*
        TASK :
        Bir String içinde kaç kelime olduğunu yazdıran bir method create ediniz.
       Test Data:
       Input the string: The quick brown fox jumps over the lazy dog.
 	   Expected Output: Number of words in the string: 9
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        kelimeSaymaMethodu(cumle);


    }

    private static void kelimeSaymaMethodu(String cumle) {
        int sayac = 0;
        char space = ' ';
        cumle = cumle.trim();// cumle basında ve sonundaki bosluklari kaldiriyoruz
        if (!cumle.contains(" ")) {
            System.out.println("Tek kelime girdiniz veya bosluk birakmayi unuttunuz");
        } else {


            for (int i = 0; i < cumle.length(); i++) {
                //cumle.charAt(i) == ' '   char dondurecegi icin sag tarafı da char yaptik
                //cumle.charAt(i) == space olarak da yazabilirdik
                if (cumle.charAt(i) == ' ') {
                    sayac++;
                }
            }
            System.out.println("Girdiginiz cumlede " + (sayac + 1) + " kelime vardir");

        }


    }

}
