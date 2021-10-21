package EgitimProjeler;

import java.util.Scanner;

public class DiziOrt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Diziniz Kaç elemanlı olsun?");
        int n = scan.nextInt();
        int[] numbers = new  int[n];

        for (int i =0; i < n; i++){
            System.out.println("Diziye eleman giriniz :");
            numbers [i]= scan.nextInt();
        }

        double sum = 0.0;
        double terim = 0.0;

        for (int i = 0; i < n; i++) {

            terim += (double) 1.0 / n;
            sum += terim;
            System.out.println(terim);
        }
        System.out.println("Harmonik Ortalama :" + (n/sum));
    }
}
