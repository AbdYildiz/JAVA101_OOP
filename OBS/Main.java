package JAVA101_OOP.OBS;

public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course biyoloji = new Course("Biyoloji", "BIO101", "BIO");

        Teacher t1 = new Teacher("Mahmut", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali", "90550000002", "KMY");
        Teacher t4 = new Teacher("Seyma", "90550000003", "BIO");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);
        biyoloji.addTeacher(t4);

        Student s1 = new Student("Burhan", "149", 4, mat, fizik, kimya);
        s1.addBulkExamNote(30, 40, 40, 20, 15, 20);
        s1.isPass();

        Student s2 = new Student("Mehmet", "161", 4, mat, fizik, kimya);
        s2.addBulkExamNote(90, 70, 60, 80, 50, 40); 
        s2.isPass();

        Student s3 = new Student("Furkan", "50", 4, mat, fizik, kimya);
        s3.addBulkExamNote(30, 20, 10, 40, 30, 20);
        s3.isPass();

        Student s4 = new Student("Ahmet", "71", 4, mat, fizik, biyoloji);
        s4.addBulkExamNote(60, 50, 55, 45, 85, 95);
        s4.isPass();
    }
}
