package EgitimProjeler;

public class Sekil {
    public static void main(String[] args) {
        String[][] harf = new String[7][4];

        for (int i = 0; i < harf.length; i++) {
            for (int j = 0; j < harf[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    harf[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    harf[i][j] = " * ";
                } else {
                    harf[i][j] = "   ";
                }
            }
        }

        for (String[] e : harf){
            for (String f : e){
                System.out.print(f);
            }
            System.out.println();
        }
    }
}
