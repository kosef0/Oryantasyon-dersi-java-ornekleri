import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dairenin yarıçap değerini giriniz : ");
        int r = scan.nextInt();
    //dairenin alanı = pı*r*r
    // dairenin çevresi = 2*pı*r
        double alan = Math.PI*r*r;
        double cevre = 2*Math.PI*r;

        System.out.println("Dairenin alanı : " +alan);
        System.out.println("Dairenin çevresi : " +cevre);

    }

}
