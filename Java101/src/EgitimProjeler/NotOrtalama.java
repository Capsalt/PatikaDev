package EgitimProjeler;

import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mat, fiz, kim;

        System.out.println("Matematik notunu giriniz:");
        mat = scan.nextInt();
        System.out.println("Fizik notunu giriniz:");
        fiz = scan.nextInt();
        System.out.println("Kimya notunu giriniz:");
        kim = scan.nextInt();

        int ort = (mat+fiz+kim)/3;

        System.out.println("Ortalamanız: " + ort);

        boolean gec = ort >=60;

        if (gec){
            System.out.println("Geçtiniz");
        }else System.out.println("Kaldınız");


    }
}
