package EgitimProjeler;

import java.util.Scanner;

public class CiftSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");

        int x = scan.nextInt();

        int toplam = 0;
        int adet = 0;

        for (int i=1; i<=x; i++){
            if (i%3==0 || i%4==0){
                toplam+=i;
                adet++;
            }
        }
        double ort = (double)toplam/adet;
        System.out.println("Ortalama :" + ort);
    }
}
