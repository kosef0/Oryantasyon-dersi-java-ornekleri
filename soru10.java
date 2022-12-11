import java.util.Scanner;
public class soru10 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
//Sayı1=s1  ,  Sayı2=s2
        int s1, s2, ekok;
        System.out.println("İlk sayı : ");
        s1= scan.nextInt();
        System.out.println("İkinci sayıyı ");
        s2= scan.nextInt();

        ekok = (s1 > s2) ? s1: s2;

        for (int i= ekok; i <= s1*s2; i++ ) {

            if (i%s1 == 0 && i%s2 == 0 ) {

                System.out.println(s1 + " ve " + s2 + " sayıların EKOK'u " + i);
                break;
            }
        }
    }
}
