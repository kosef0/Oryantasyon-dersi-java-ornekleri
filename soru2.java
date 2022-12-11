import java.util.Scanner;

public class soru2 { public static void main(String[] args) {
    int vize,finl;
    float ortalama;

    Scanner scan = new Scanner(System.in);

    System.out.println("Vize : ");
    vize = scan.nextInt();

    System.out.println("Final : ");
    finl = scan.nextInt();

    ortalama = (float) (vize*0.4 + finl*0.6);

    System.out.println("Ortalamanız = " + ortalama);

    if (ortalama>=50 && finl>=50) System.out.println("Geçtiniz.");
    else  System.out.println("Kaldınız");

}

}
