package JAVA101_OOP.OBS;


public class Course {
    /** Course Sınıfı Özellikleri :
        Nitelikler : name,code,prefix,note,Teacher
        Metotlar : Course() , addTeacher() , printTeacher()     
    */

    /**Ödev
        Course sınıfına derse ait sözlü notu kısmını girin ve ortalamaya etkisini her ders için ayrı ayrı belirtin. Sözlü notların ıda ortalamaya etkileme yüzdesi ile dahil edin.

        Örnek : Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.

        Öğrenci sözlüden 90, sınavdan 60 almış ise, o dersin genel ortalamaya etkisi şu şekilde hesaplanır :

        Fizik Ortalaması : (90 * 0.20) + (60* 0.80); */

    String name;
    String code;
    String prefix;
    int note;
    int quiz;
    double average;
    Teacher courseTeacher;
    
    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.quiz = 0;
    }

    void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)) {
            this.courseTeacher = teacher;
            System.out.println("Islem basarili");
        } else {
            System.out.println(teacher.name + " akademisyeni bu dersi veremez");
        }
    }

    void printTeacher(){
        if (this.courseTeacher != null) {
            System.out.println(this.name + " bu dersin akademisyeni " + this.courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine akademisyen atanmamistir");
        }
    }

}
