package Pazardeneme;

import java.util.Locale;

public class H02_Pazar08UpperLowerCase {
    public static void main(String[] args) {
        String isim="Tarkan Tevetoglu";
        System.out.println(isim.toLowerCase());
        System.out.println(isim.toUpperCase());

        //NOT!!
        //toLowerCase(Locale locale)>> girilen Stringdeki tum harfleri istenen local dilde istenen
        //bicime cevirir

        String isim1="İsmail Çevik";
        System.out.println(isim1.toUpperCase(Locale.forLanguageTag("tr")));
    }
}
