package EgitimProjeler;

import java.util.Scanner;

public class elmas {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("yükseklik ?");
        int yukseklik=scan.nextInt(); //yükseklik hep tek sayi olacaktir
        int yariyukseklik=(int)(yukseklik/2)+1;

        for(int i=1;i<=yariyukseklik;i++)
        {
            for(int j=1;j<=yariyukseklik-i;j++)
                System.out.print(" ");

            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");

            System.out.println();
        }

        for(int i=yariyukseklik-1;i>=1;i--)
        {
            for(int j=1;j<=yariyukseklik-i;j++)
                System.out.print(" ");

            for(int j=1;j<=2*i-1;j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
