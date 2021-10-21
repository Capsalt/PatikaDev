package EgitimProjeler;

public class Frekans {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int sayac = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    for (int k = 0; k < i; k++) {
                        if (list[k] == list[i]) {
                            sayac = -1;
                        }
                    }
                    sayac++;
                }
            }

            if (sayac != 0) {
                System.out.println(list[i] + " sayısı "+ sayac + " kere tekrar edildi.");
            }
            sayac = 0;
        }
    }
}
