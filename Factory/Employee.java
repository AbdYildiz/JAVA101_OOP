package JAVA101_OOP.Factory;

public class Employee {
    /**     Sınıfın Nitelikleri
        name : Çalışanın adı ve soyadı
        salary : Çalışanın maaşı
        workHours : Haftalık çalışma saati
        hireYear : İşe başlangıç yılı
        
            Sınıfın Metotları
        Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
        tax();
        bonus();
        raiseSalary();
        toString();
         */
    String name;
    double salary;
    int workHours;
    int hireYear;
    
    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;            
    }

    /**tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
        Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
        Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır. */
    double tax(){
        if (this.salary > 1000) {
            return (salary / 100) * 3;
        } else {
            return 0;
        }
    }

    /**bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı 
        her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır. */
    double bonus(){
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30; 
        } else {
            return 0 ;
        }
    }

    /**raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. 
        Şuan ki yılı 2021 olarak alın.
        Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
        Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
        Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır. */
    double raiseSalary(){
        int yearsWorked = 2021 - hireYear;
        if (yearsWorked < 10 ) {
            return (salary / 100) * 5.0;
        } else if (yearsWorked >= 10 && yearsWorked < 20){
            return (salary / 100) * 10.0;
        } else if (yearsWorked >=20){
            return (salary / 100) * 15.0;
        } else {
            return 0.0;
        }
    }

    //toString() : Çalışana ait bilgileri ekrana bastıracaktır.
    public String toString(){
        return "Adi \t\t: " + this.name + "\n" + 
                "Maasi \t\t: " + this.salary + "\n" + 
                "Calisma Saati \t: " + this.workHours + "\n" + 
                "Baslangic Yili \t: " + this.hireYear + "\n" +
                "Vergi \t\t: " + tax() + "\n" + 
                "Bonus \t\t: " + bonus() + "\n" +
                "Maas Artisi \t: " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maas : " + (-tax() + bonus() + this.salary) + "\n"+
                "Toplam Maas \t: " + (this.salary + raiseSalary());
    }
}
// Adı : kemal
// Maaşı : 2000.0
// Çalışma Saati : 45
// Başlangıç Yılı : 1985
// Vergi : 60.0
// Bonus : 150.0
// Maaş Artışı : 300.0
// Vergi ve Bonuslar ile birlikte maaş : 2090.0
// Toplam Maaş : 2300.0
