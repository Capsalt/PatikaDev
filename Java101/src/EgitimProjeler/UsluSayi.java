package EgitimProjeler;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("taban değerini yazınız:");
        int a=scan.nextInt();

        System.out.println("üs değerini yazınız:");
        int b=scan.nextInt();


        int carpim=1;
        for (int i=1; i<=b; i++)
            carpim=carpim*a;

        System.out.println("a üzeri b="+carpim);
    }
}
