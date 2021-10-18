package EgitimProjeler.Maas;

public class Employee {
    String name;
    double maas;
    double saat;
    int yil;

    Employee(String name, int maas, int saat, int yil){
        this.name = name;
        this.maas = maas;
        this.saat = saat;
        this.yil = yil;
        vergi();
        bonus();

    }

    public double vergi(){
        double vergi = 0;
        if (maas<1000){
            vergi = 0;
        }else if (maas >= 1000) {
            vergi =this.maas * (0.03);
        }else System.out.println("Geçersiz maaş");
        return vergi;
    }

    public double bonus(){
        double bonus = 0;
        if (saat>40) {
            int fazla = (int) saat - 40;
            bonus = fazla * 30;
        }
        return bonus;
    }

    public String toString(){
        System.out.println("Adı :"+this.name);
        System.out.println("Maaş :"+this.maas);
        System.out.println("Çalışma Saati :"+this.saat);
        System.out.println("Başlangıç yılı :"+this.yil);
        System.out.println("Vergi :" + this.vergi());
        System.out.println("Bonus :"+this.bonus());
        System.out.println("Toplam Maaş :"+ (this.maas + this.bonus() - this.vergi()));
        return null;
    }
}

