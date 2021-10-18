package EgitimProjeler;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi Giriniz : ");
        int palindrom = scan.nextInt();
        int ilk = palindrom;
        int ilkdeger = palindrom;
        int length = String.valueOf(palindrom).length();

        int kalan,deger=0;
        for (int i = 0; i<length; i++){

            kalan = palindrom % 10;
            deger = deger * 10 + kalan;
            palindrom = palindrom /10;
        }

        if(deger == ilkdeger){
            System.out.println(ilk + " Palindrom Sayidir.");
        }else{
            System.out.println(ilk + " Palindrom Sayi Degildir.");
        }

    }
}
