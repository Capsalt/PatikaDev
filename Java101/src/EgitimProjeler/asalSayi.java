package EgitimProjeler;

import java.util.Scanner;

public class asalSayi {
    public static void main(String[] args) {
        int num, asal;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pozitif bir sayi giriniz : ");
        num = scanner.nextInt();

        asal = asalMi(num, num / 2);

        if (asal == 1) {
            System.out.println(num + " sayisi asaldir");
        } else {
            System.out.println(num + " sayisi asal değildir");
        }
    }

    private static int asalMi(int num, int i) {
        if (i == 1) {
            return 1;
        } else {
            if (num % i == 0) {
                return 0;
            } else
                return asalMi(num, i - 1);
        }
    }
}
