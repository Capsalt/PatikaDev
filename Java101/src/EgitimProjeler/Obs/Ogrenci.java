package EgitimProjeler.Obs;

public class Ogrenci {
    String name,stuNo;
    int classes;
    Kurs mat;
    Kurs fizik;
    Kurs kimya;
    double avarage;
    boolean isPass;


    Ogrenci(String name, int classes, String stuNo, Kurs mat,Kurs fizik,Kurs kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void addBulkSozluNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.sozlu = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.sozlu = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.sozlu = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.sozlu == 0 || this.fizik.sozlu == 0 || this.kimya.sozlu == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.fizik.ort = (fizik.note*8/10) + (fizik.sozlu*1/5);
        this.mat.ort = (mat.note*8/10) + (mat.sozlu*1/5);
        this.kimya.ort = (kimya.note*8/10) + (kimya.sozlu*1/5);

        this.avarage = (this.fizik.ort + this.kimya.ort + this.mat.ort) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.ort);
        System.out.println("Fizik Notu : " + this.fizik.ort);
        System.out.println("Kimya Notu : " + this.kimya.ort);
    }
}
