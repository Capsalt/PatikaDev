package EgitimProjeler;

import java.util.Scanner;

public class üsAlma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Taban giriniz :");
        int t = scan.nextInt();
        System.out.println("Üs giriniz :");
        int u = scan.nextInt();
        System.out.println(us(t,u));
        scan.close();
    }

    private static int us(int t, int u) {
        if (u==0)
            return 1;
        else if(t==1)
            return 1;
        else
            return t*us(t, u-1);
    }
}
