import java.util.*;

public class COURSE {
    private int courseID;
    private String coursename;
    LECTURER lecturer;
    private int numberOfRegisteredStudents;

    public COURSE(int courseID, String coursename) {
        this.courseID = courseID;
        this.coursename = coursename;

    }

    public COURSE() {
    }

    public void setLecturer(LECTURER lecturer) {

        this.lecturer = lecturer;
    }

    public void increasenumberOfRegisteredStudents() {
        numberOfRegisteredStudents++;
    }

    public void decreasenumberOfRegisteredStudents() {
        numberOfRegisteredStudents--;
    }

    public int getCourseID() {
        return courseID;
    }

    public String getCoursename() {

        return coursename;
    }

    public int getNumberOfRegisteredStudents() {

        return numberOfRegisteredStudents;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String toString() {
        return "course name  : " + coursename + " \n course ID : " + courseID + "\n number Of Registered Students : "
                + numberOfRegisteredStudents;
    }

    // @Override
    // public String toString() {
    // return "courseID :" + courseID +
    // ", coursename : " + coursename + '\'' + lecturer + ", number Of Registered
    // Students = " + numberOfRegisteredStudents + '}';
    // }
}
