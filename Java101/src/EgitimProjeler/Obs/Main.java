package EgitimProjeler.Obs;

public class Main {
    public static void main(String[] args) {
        Kurs mat = new Kurs("Matematik", "MAT101", "MAT");
        Kurs fizik = new Kurs("Fizik", "FZK101", "FZK");
        Kurs kimya = new Kurs("Kimya", "KMY101", "KMY");

        Ogretmen t1 = new Ogretmen("Mahmut Hoca", "90550000000", "MAT");
        Ogretmen t2 = new Ogretmen("Fatma Ayşe", "90550000001", "FZK");
        Ogretmen t3 = new Ogretmen("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Ogrenci s1 = new Ogrenci("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addBulkSozluNote(65, 55, 85);
        s1.isPass();

        Ogrenci s2 = new Ogrenci("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkSozluNote(75, 80, 90);
        s2.isPass();

        Ogrenci s3 = new Ogrenci("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.addBulkSozluNote(75, 60, 60);
        s3.isPass();
    }
}
