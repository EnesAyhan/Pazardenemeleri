package Pazardeneme;

import java.util.Scanner;

public class H02_Pazar04Ternary {
    public static void main(String[] args) {
        //kullamicidan bir tamsayi alin ve sayi 10'dan kucukse "Rakam", 100!den kucukse "iki basamakli sayi"
        //degilse "3 basamkli veya daha buyuk sayi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println( "lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        System.out.println(9>=sayi&&sayi>=0?("rakam"):99>=sayi?("iki basamkali sayi"):("3 Basamkli veya daha buyuk sayi")
    );

    }
}
