import java.util.ArrayList;

public class STUDENT {
    private int studentID;
    private String studentName;
    private ArrayList<COURSE> Courses = new ArrayList<>();
    private int numberoftakencourses;

    public STUDENT(int studentID, String studentName) {

        this.studentID = studentID;
        this.studentName = studentName;

    }

    public STUDENT() {

    }

    public void addcourse(COURSE Courses1) {

        Courses.add(Courses1);

        numberoftakencourses++;

    }

    // public void incresenumberoftakencourses(){ numberoftakencourses++; }
    public void decreasenumberoftakencourses() {
        numberoftakencourses--;
    }

    public void printcoursesofstudent() {

        for (int i = 0; i < Courses.size(); i++) {
            System.out.println(Courses.get(i));

        }
    }

    public void removecoursestudent(int id) {


        for (int i = 0; i < Courses.size(); i++) {
            if (Courses.get(i).getCourseID()== id)
                Courses.remove(i);

        }

    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public ArrayList<COURSE> getCourses() {
        return Courses;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourses(ArrayList<COURSE> courses) {
        Courses = courses;
    }

    public String toString() {
        return "\n[student ID : " + studentID + " \n studentName : " + studentName + "\n number of taken courses : "
                + numberoftakencourses + "]";

    }

    // @Override
    // public String toString() {
    // return "{" + "studentID=" + studentID + ", studentName='" + studentName +
    // '\'' + ", number of taken courses=" + numberoftakencourses + '}';
    // }
}
