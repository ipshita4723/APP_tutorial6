

class Student {
    private String studentId;
    private String name;
    private String major;

  
    public Student(String studentId, String name, String major) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
    }

   
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    
    public void displayStudentInfo() {
        System.out.println("=================================");
        System.out.println("       STUDENT INFORMATION       ");
        System.out.println("=================================");
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Major      : " + major);
    }
}


class Course {
    private String courseCode;
    private String courseName;
    private int credits;

    
    public Course(String courseCode, String courseName, int credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }

   
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    
    public void displayCourseInfo() {
        System.out.println("=================================");
        System.out.println("        COURSE INFORMATION       ");
        System.out.println("=================================");
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credits    : " + credits);
    }
}

public class CollegeSystem {
    public static void main(String[] args) {
       
        Student student1 = new Student("S101", "Alex Morgan", "Computer Science");
        Student student2 = new Student("S102", "Jordan Lee", "Electrical Engineering");

        Course course1 = new Course("CS201", "Data Structures & Algorithms", 4);
        Course course2 = new Course("EE101", "Circuit Analysis", 3);

  
        student1.displayStudentInfo();
        System.out.println();
        course1.displayCourseInfo();

        System.out.println("\n---------------------------------\n");

        student2.displayStudentInfo();
        System.out.println();
        course2.displayCourseInfo();
    }
}
