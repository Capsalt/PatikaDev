package EgitimProjeler;

import java.util.Scanner;

public class faktoriyel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi Giriniz : ");
        int x= scan.nextInt();
        int faktoriyel = 1;
        for(int i = 1; i<= x; i++){
            faktoriyel *= i;
        }

        System.out.println(faktoriyel);
    }
}
