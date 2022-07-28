import java.util.Scanner;


public class Main {

    static int us(int a, int b){

        int sonuc=1;

        for(int i = 1; i<=b;i++){
            sonuc*=a;
        }

        System.out.println("Sonuc = "+sonuc);
        return sonuc;

    }

    public static void main(String[] args) {

        int taban, us;

        System.out.println("Taban degerini giriniz = ");

        Scanner inp = new Scanner(System.in);

        taban = inp.nextInt();

        System.out.println("Us degerini giriniz = ");

        us = inp.nextInt();

        us(taban,us);



    }
}
