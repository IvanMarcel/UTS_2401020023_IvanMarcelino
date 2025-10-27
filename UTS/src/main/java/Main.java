//soal no 5
public class Main {
    public static void main(String[] args) {
        Assessment exam = new Exam(90);
        Assessment assignment = new Assignment(80);

        double finalScore = (exam.calculateFinalScore() + assignment.calculateFinalScore()) / 2;

        Gradable grade = new GradeResult(finalScore);

        System.out.println("Nilai akhir: " + finalScore);
        System.out.println("Grade: " + grade.getGrade());
    }
}


// soal no 4
//public class Main {
//    public static void main(String[] args) {
//        Person[] people = {
//                new Student("Ivan"),
//                new Lecturer("Pak Dimas"),
//                new Person("Orang Umum")
//        };

        // Polymorphism: method introduce() dipanggil sesuai tipe objek aslinya
//        for (Person p : people) {
//            p.introduce();
//        }
//    }
//}


// soal no 3
//public class Main {
//    public static void main(String[] args) {
//        Course c1 = new Course("Java", 3, "Pak Dimas");
//        Course c2 = new Course("Database", 2, "Bu Ayu");
//
//        Student s1 = new Student("Ivan", "S001");
//        s1.addCourse(c1);
//        s1.addCourse(c2);
//
//        s1.displayInfo();
//    }
//}



// soal no 1
//public class Main {
//    public static void main(String[] args) {
//        Course c1 = new Course("Pemrograman Java", 3, "Pak Dimas");
//        c1.displayinfo();
//    }
//}