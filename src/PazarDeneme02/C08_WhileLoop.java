package PazarDeneme02;

public class C08_WhileLoop {
    public static void main(String[] args) {
        //For loop ve While Loop kullanarak 3 basamakli sayilardan 15,20 ve 90'a
        //tam bolunebilen satilari yazdiriniz

        int i = 100;
        int bitis = 1000;
        while (i < bitis) {
            if (i % 90 == 0 && i % 20 == 0 && i % 15 == 0) {
                System.out.print(i + ", ");

            }
            i++;

        }
        System.out.println("");

        for (int j = 100; j <1000 ; j++) {
            if (j % 90 == 0 && j % 20 == 0 && j % 15 == 0) {
            System.out.print(j + ", ");

        }
            j++;


        }
    }
}








