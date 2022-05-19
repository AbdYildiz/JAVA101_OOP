package JAVA101_OOP.OBS;

public class Student {
    /** 
    Student Sınıfı Özellikleri :
    Nitelikler : name,stuNo,classes,course1,course2,course3,avarage,isPass
    Metotlar : Student(), addBulkExamNote(), isPass(), calcAvarage(), printNote() 
    */

    String name;
    String stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double average;
    boolean isPass;

    Student(String name, String stuNo, int classes, Course mat, Course fizik, Course kimya){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAverega();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int matQuiz, int fizik, int fizikQuiz, int kimya, int kimyaQuiz){
        if(mat >= 0 && mat <= 100) this.mat.note = mat;
        if(matQuiz >= 0 && matQuiz <= 100) this.mat.quiz = matQuiz;

        if(fizik >= 0 && fizik <= 100) this.fizik.note = fizik;
        if(fizikQuiz >= 0 && fizikQuiz <= 100) this.fizik.quiz = fizikQuiz;
        
        if(kimya >= 0 && kimya <= 100) this.kimya.note = kimya;
        if(kimyaQuiz >= 0 && kimyaQuiz <= 100) this.kimya.quiz = kimyaQuiz;
    }

    public void isPass(){
        if(this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.quiz == 0 || this.fizik.quiz == 0 || this.kimya.quiz == 0)
            System.out.println("Notlar henuz sisteme girilmemis");
        
        else{
            this.isPass = checkPassed();
            printNote();
            System.out.println("Ortalama : " + this.average);
            
            if (this.isPass) {
                System.out.println("Sinifi gecti");    
            } else {
                System.out.println("Sinifta kaldi");
            }

        }
    }
    
    public boolean checkPassed() {
        calcAverega();
        return this.average > 55;
    }

    public void calcAverega(){
        this.mat.average = (this.mat.note * 0.8) + (this.mat.quiz * 0.2);
        this.fizik.average = (this.fizik.note * 0.8) + (this.fizik.quiz * 0.2);
        this.kimya.average = (this.kimya.note * 0.8) + (this.kimya.quiz * 0.2);

        this.average = (this.mat.average + this.fizik.average + this.kimya.average) / 3.0;
    }

    void printNote(){
        System.out.println("=========================");
        System.out.println("Ogrenci \t: " + this.name);
        System.out.println("Matematik notu \t:" + this.mat.note);
        System.out.println("Fizik notu \t:" + this.fizik.note);
        System.out.println("Kimya notu \t:" + this.kimya.note);
    }
    
}
