
// soal no 2
class Course {
    private String courseName;
    private int credit;
    private String instructorName;

    public Course(String courseName, int credit, String instructorName) {
        this.courseName = courseName;
        this.credit = credit;
        this.instructorName = instructorName;
    }
    // getter
    public String getCourseName() {
        return courseName;
    }
    // getter
    public int getCredit() {
        return credit;
    }
    //setter
    public void setCredit(int credit) {
        if (credit < 0) {
            System.out.println("Credit tidak boleh negatif!");
            this.credit = 0;
        } else {
            this.credit = credit;
        }
    }

    public void displayInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Credit: " + credit);
        System.out.println("Instructor: " + instructorName);
    }
}



// soal no 1
//public class Course {
//    private String courseName;
//    private int credit;
//    private String instructorName;

    //Constructor
//    public Course(String courseName, int credit, String instructorName){
//        this.courseName = courseName;
//        this.credit = credit;
//        this.instructorName = instructorName;
//    }

    //Method
//    public void displayinfo() {
//        System.out.println("Course = " + courseName);
//        System.out.println("Credit = " + credit);
//        System.out.println("Instructor = " + instructorName);
//    }


// }
