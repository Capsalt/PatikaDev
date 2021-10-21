package EgitimProjeler;

public class Tekrarlı {
    public static void main(String[] args) {
        int[] x = { 1, 6, 4, 6, 4, 8, 2, 4, 1, 1 };

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max)
                max = x[i];
        }

        int[] y = new int[max + 1];
        for (int i = 0; i < x.length; i++) {

            y[x[i]]++;
        }
        for (int i = 0; i <= max; i++) {
            if (y[i] > 1)
                System.out.println(i);
        }
    }
}
