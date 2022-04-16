package Pazardeneme;

import java.util.Scanner;


public class H01_Pazar01 {
    public static void main(String[] args) {

        //SCANNER


        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tamsayı giriniz");
        int a= scan.nextInt();
        Scanner scan2= new Scanner(System.in);
        System.out.println("bir tamsayı daha giriniz");
        int b= scan2.nextInt();
        System.out.println("girdiginiz sayilarin toplami :"+(a+b));
        System.out.println("girdiginiz sayilarin carpimi :"+(a*b));

//Soru2= karenin bir kenar uzunuluğu alınacak. çevre=? alan=?
         Scanner kare=new Scanner(System.in);
        System.out.println("karenin bir kenar uzunluğunu giriniz");
        int kenar= kare.nextInt();
        System.out.println("karenin alanı :"+ kenar*kenar);
        System.out.println("karenin çevresi:"+4*kenar);

        //Soru3=kullanicidan ismini alip isminin bas harfini yazdirin

        Scanner isim=new Scanner(System.in);
        System.out.println("lüften isminizi giriniz");
        char ilkHarf= isim.next().charAt(0);
        System.out.println("isminizin ilk harfi :"+ilkHarf);









    }
}
