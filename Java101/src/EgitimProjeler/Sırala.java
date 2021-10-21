package EgitimProjeler;

import java.util.Scanner;

public class Sırala {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Diziniz Kaç elemanlı olsun?");
        int n = scan.nextInt();
        int[] numbers = new  int[n];
        int s;

        for (int i =0; i < n; i++){
            System.out.println("Diziye eleman giriniz :");
            numbers [i]= scan.nextInt();
        }

        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(numbers[j] < numbers[i]) {
                    s = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = s;
                }
            }
        }
        System.out.print("Sıralama :");
        for(int i = 0; i < n; i++)
        {
            System.out.print(numbers[i] + ",");
        }
    }
}
