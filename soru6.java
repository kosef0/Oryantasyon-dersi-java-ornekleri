import java.util.Scanner;

public class soru6 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Gidilen KM bilgisini giriniz : ");

        double km = scan.nextInt();
        double fiyat = 15 + (km* 8.50);
        if (fiyat<30) fiyat=30;

        System.out.println("Taksimetre : " +fiyat + "TL");

    }
}
