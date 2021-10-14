package EgitimProjeler;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1. sayı");
        double x = scan.nextDouble();
        System.out.println("2. sayı");
        double y = scan.nextDouble();

        System.out.println("1.toplama/n2.çıkarma/n3.çarpma/n4.bölme");

        int islem = scan.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Toplam: " + (x+y));
                break;
            case 2:
                System.out.println("Fark: " + (x-y));
                break;
            case 3:
                System.out.println("Çarpım: " + (x*y));
                break;
            case 4:
                System.out.println("Bölüm: " + (x/y));
                break;
            default:
                System.out.println("hatalı giriş");
                break;
        }

    }
}
