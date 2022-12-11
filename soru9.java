import  java.util.Scanner;
/* Artık yıl hesaplama
Yıl 4'ün katı olacak, yıl 100 ün katı ise 400 ünde katı olmak zorunda.
 */
public class soru9 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        int yil;
        System.out.println("Lütfen yıl girin : ");
        yil = scanner.nextInt();

        if (yil %4==0 )
        {
            if (yil % 100 == 0)
                if (yil % 400 == 0)
                    System.out.println(yil + "Artık yıldır.");
                else System.out.println(yil + "Artık yıl değildir.");
            else
                System.out.println(yil + " Artık yıldır. ");
        }
        else
            System.out.println(yil +  " Artık yıl değildir. ");
    }
}
