import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int taban, kuvvet;

        System.out.println("Taban : ");
        taban = scan.nextInt();
        System.out.println("Kuvvet : ");
        kuvvet = scan.nextInt();

        int sonuc =1;

        for ( int i=0; i<kuvvet; i++ )
            sonuc *= taban;

        System.out.println(taban + " üssü " + kuvvet + " = " + sonuc );
    }
}