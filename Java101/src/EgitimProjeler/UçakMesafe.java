package EgitimProjeler;

import java.util.Scanner;

public class UçakMesafe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Mesafe(KM) : ");
        int m = scan.nextInt();

        System.out.println("Yaş : ");
        int y = scan.nextInt();

        System.out.println("1.Tek Yön/n2.Gidiş-Dönüş");
        int t = scan.nextInt();

        double toplam = m * 0.1;

        if ((t < 1 && t > 2) || (m < 1) || (y < 1)) {
            System.out.println("Hatalı veri girdiniz.");
        } else if (y < 12) {
            switch (t) {
                case 1:
                    toplam = (toplam * 1 / 2);
                    System.out.println("Fiyat :" + toplam);
                    break;
                case 2:
                    toplam = (toplam * 1 / 2) * 4 / 5 * 2;
                    System.out.println("Fiyat :" + toplam);
                    break;
            }
        } else if (y > 12 && y < 24) {
            switch (t) {
                case 1:
                    toplam = (toplam * 9 / 10);
                    System.out.println("Fiyat :" + toplam);
                    break;
                case 2:
                    toplam = (toplam * 9/10) * 4 / 5 * 2;
                    System.out.println("Fiyat :" + toplam);
                    break;
            }

        } else if (y < 66 && y >23) {
            switch (t) {
                case 1:
                    toplam = toplam;
                    System.out.println("Fiyat :" + toplam);
                    break;
                case 2:
                    toplam = toplam * 4 / 5 * 2;
                    System.out.println("Fiyat :" + toplam);
                    break;
            }


        }else if (y > 65) {
            switch (t) {
                case 1:
                    toplam = (toplam * 7 / 10);
                    System.out.println("Fiyat :" + toplam);
                    break;
                case 2:
                    toplam = (toplam * 7/10) * 4 / 5 * 2;
                    System.out.println("Fiyat :" + toplam);
                    break;
            }


        }
        scan.close();
    }
}
