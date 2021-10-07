package EgitimProjeler;

import java.util.Scanner;

public class KdvHesapla {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Para miktarını giriniz");
        double para = scan.nextDouble();
        double kdv;

        if (para<1000 && para>0){
            kdv = 0.18;
            System.out.println("KDV'siz fiyat: " + para);
            System.out.println("KDV'li fiyat: " + (para+(para*kdv)));
            System.out.println("KDV tutarı: " + (para*kdv));
        }else if(para>=1000){
            kdv = 0.08;
            System.out.println("KDV'siz fiyat: " + para);
            System.out.println("KDV'li fiyat: " + (para+(para*kdv)));
            System.out.println("KDV tutarı: " + (para*kdv));
        }

        scan.close();
    }
}
