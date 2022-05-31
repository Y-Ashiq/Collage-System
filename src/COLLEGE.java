import java.util.ArrayList;
import java.util.Scanner;

public class COLLEGE {
    private int collegeID;
    private String collageName;
    private ArrayList<COURSE> Courses;
    private ArrayList<STUDENT> students;
    private ArrayList<LECTURER> lecturers;
    Scanner input = new Scanner(System.in);

    public COLLEGE(int collegeID, String collageName) {
        this.collageName = collageName;
        this.collegeID = collegeID;
        Courses = new ArrayList<>();
        students = new ArrayList<>();
        lecturers = new ArrayList<>();

    }

    public COLLEGE() {

    }

    public void addCourse(int coursenum, String coursename) {

        COURSE c = new COURSE(coursenum, coursename);
        Courses.add(c);

    }

    public void addStudent(int studentID, String student_name) {

        STUDENT s = new STUDENT(studentID, student_name);
        students.add(s);

    }

    public void addLecturer(int lecID, String lecname) {

        LECTURER l = new LECTURER(lecID, lecname);
        lecturers.add(l);
    }

    public void registereforstudent() {

        System.out.println("please enter student ID ");
        int studentID = input.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID() == studentID) {


                System.out.println("please enter course ID ");
                int courseID = input.nextInt();
                for (int j = 0; j < Courses.size(); j++) {

                    if (Courses.get(j).getCourseID() == courseID) {
                        Courses.get(j).increasenumberOfRegisteredStudents();
                        students.get(i).addcourse(Courses.get(j));
                        // students.get(i).incresenumberoftakencourses();

                    }else {System.out.println("course not found");}

                }
            }else {System.out.println("Student not found");}
        }
    }

    public void registereforlecturer() {

        System.out.println("please enter lecturer ID ");
        int lecturerID = input.nextInt();
        System.out.println("please enter course ID ");
        int courseID = input.nextInt();
        for (int i = 0; i < lecturers.size(); i++) {
            if (lecturers.get(i).getLecturerID() == lecturerID) {
                for (int j = 0; j < Courses.size(); j++) {
                    if (Courses.get(j).getCourseID() == courseID) {
                        lecturers.get(i).addcourse(Courses.get(j));
                       // lecturers.get(i).increasenumberoftaughtcourses();
                        Courses.get(j).setLecturer(lecturers.get(i));

                    }else {System.out.println("course not found");}

                }
            }else {System.out.println("lecturer not found");}

        }
    }

    public void STUDENTcourses() {

        System.out.println("please enter student ID ");
        int studentID = input.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID() == studentID) {
                students.get(i).printcoursesofstudent();

            }

        }

    }

    public void LECTURERcourses() {

        System.out.println("please enter lecturer ID ");
        int lecturerID = input.nextInt();
        for (int i = 0; i < lecturers.size(); i++) {
            if (lecturers.get(i).getLecturerID() == lecturerID) {
                lecturers.get(i).printcoursesoflecturer();

            }

        }

    }

    public void completelistofSTUDENT() {

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).toString());

        }

    }

    public void completelistofCOURSES() {

        for (int i = 0; i < Courses.size(); i++) {

            System.out.println(Courses.get(i).toString());
        }
    }

    public void compeletelistofLECTURER() {

        for (int i = 0; i < lecturers.size(); i++) {
            System.out.println(lecturers.get(i).toString());
        }
    }

    public void RemoveCoures() {
        System.out.println("please enter course ID to remove ");
        int cid = input.nextInt();
        for (int i = 0; i < Courses.size(); i++) {
            if (Courses.get(i).getCourseID() == cid) {
                Courses.remove(i).decreasenumberOfRegisteredStudents();
                for (int j = 0; j < students.size(); j++) {
                    //students.get(j).decreasenumberoftakencourses();
                    students.get(j).removecoursestudent(cid);
                }
                for (int k = 0; k < lecturers.size(); k++) {
                    //lecturers.get(k).decreasenumberoftaughtcourses();
                    lecturers.get(k).removecourselecturer(cid);
                }

            }

        }

    }

    public void removestudent() {
        System.out.println("please enter student ID to remove ");
        int sid = input.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (sid == students.get(i).getStudentID()) {
                students.remove(i);
                students.get(i).decreasenumberoftakencourses();
                Courses.get(i).decreasenumberOfRegisteredStudents();
            }

        }
    }

    public void removelecturer() {
        System.out.println("please enter lecturer ID to remove ");
        int lid = input.nextInt();
        for (int i = 0; i < lecturers.size(); i++) {
            if (lid == lecturers.get(i).getLecturerID()) {
                lecturers.remove(i);
                lecturers.get(i).decreasenumberoftaughtcourses();
            }

        }
    }

    public int getCollegeID() {
        return collegeID;
    }

    public String getCollageName() {
        return collageName;
    }

    public ArrayList<COURSE> getCourses() {
        return Courses;
    }

    public ArrayList<STUDENT> getStudents() {
        return students;
    }

    public ArrayList<LECTURER> getLecturers() {
        return lecturers;
    }

    public void setCollegeID(int collegeID) {
        this.collegeID = collegeID;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public void setCourses(ArrayList<COURSE> courses) {
        Courses = courses;
    }

    public void setStudents(ArrayList<STUDENT> students) {
        this.students = students;
    }

    public void setLecturers(ArrayList<LECTURER> lecturers) {
        this.lecturers = lecturers;
    }

    // public String toString() {
    // return String.format("college ID \n%d college name \n%s number of courses
    // \n%d number of students \n%d number of lecturer \n%d", collegeID,
    // collageName, Courses.size(), students.size(), lecturers.size());
    // }

    @Override
    public String toString() {
        return "{" + "collegeID=" + collegeID + ", collageName = " + collageName + '\'' + ", Number Courses = "
                + Courses.size() + ", number students = " + students.size() + ", number lecturers = " + lecturers.size()
                + '}';
    }
}
