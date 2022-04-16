package Pazardeneme;

import java.util.Scanner;

public class H02_Pazar05switchCase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("haftanin kacinci gunu");
        int gun= scan.nextInt();
        switch (gun){
            case 1:
                System.out.println("pazatesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("girdiginiz sayida gun ismi bulunmamaktadir");

        }




    }
}
