package StringManipulation;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C01_Contains_IndexOf {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        //BENİM COZUMUM
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle= scan.nextLine();
        int sıralama=cumle.indexOf(" ");
        System.out.println(sıralama);
        if (sıralama==-1){
            System.out.println("girdiginiz cumlede bosluk bulunmamaktadır");
        }else System.out.println( "girdiginiz cumlede bosluk bulunmaktadır");

        //HOCANIN COZUMU
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Bir string giriniz = "); // Java ogren
        String text = scan1.nextLine();

        boolean boslukVarMi = text.contains(" ");
        System.out.println("boslukVarMi = " + boslukVarMi); //boslukVarMi = true

        // Kullanıcıdan alacağını bir stringin bos olup olmadığını kontrol ediniz.
        boolean bosMu = text.isEmpty();
        System.out.println("bosMu = " + bosMu); //bosMu = false



    }



}
