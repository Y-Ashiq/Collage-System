import java.util.ArrayList;

public class LECTURER {
    private int lecturerID;
    private String lecturerName;
    private ArrayList<COURSE> Courses;
    private int numberoftaughtcourses;

    public LECTURER(int lecturerID, String lecturerName) {

        this.lecturerID = lecturerID;
        this.lecturerName = lecturerName;
        Courses = new ArrayList<>();
    }

    public LECTURER() {

    }

    public void addcourse(COURSE Courses1) {

        Courses.add(Courses1);
       numberoftaughtcourses++;

    }

   //  public void increasenumberoftaughtcourses(){ numberoftaughtcourses++;}
    public void decreasenumberoftaughtcourses() {
        numberoftaughtcourses--;
    }

    public void printcoursesoflecturer() {

        for (int i = 0; i < Courses.size(); i++) {
            System.out.println(Courses.get(i));
        }
    }
    public void removecourselecturer(int id) {


        for (int i = 0; i < Courses.size(); i++) {
            if (Courses.get(i).getCourseID()== id)
                numberoftaughtcourses--;
                Courses.remove(i);

        }

    }

    public int getLecturerID() {
        return lecturerID;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerID(int lecturerID) {
        this.lecturerID = lecturerID;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public void setCourses(ArrayList<COURSE> courses) {
        Courses = courses;
    }

    public String toString() {
        return "\nlecturer ID : " + lecturerID + "\nlecture name : " + lecturerName + "\nnumber of taught courses : "
                + numberoftaughtcourses;
    }

    // @Override
    // public String toString() {
    // return "{" + "lecturerID=" + lecturerID + ", lecturerName='" + lecturerName +
    // '\'' + ", numberoftaughtcourses=" + numberoftaughtcourses + '}';
    // }
}
