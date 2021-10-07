package EgitimProjeler;

import java.util.Scanner;

public class DikUcgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Üçgenin dik kenarlarını giriniz");
        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();

        double hipotenus = Math.sqrt(kenar1*kenar1 + kenar2*kenar2);

        System.out.println("Dik kenar: "+ hipotenus);

        System.out.println("-------------------------------");

        System.out.println("Üçgenin kenarlarını sırayla giriniz");

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int u = (a+b+c)/2;

        double alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Alanı: " + alan);

        scan.close();



    }
}
