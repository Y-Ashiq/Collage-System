/* Youssef Alashiq Ali
   18103210
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MAINMENU {
    public static void main(String[] args) {

        COLLEGE C = new COLLEGE(1, "CCIT");


//the main menu\
        while (true) {


//the main menu\

            System.out.println("----------------------------------------------------------------------\n" +
                    "***Course Registration Main Menu*** \n *please choose : \n" +
                    "1.Add a course.\n" +
                    "2. Add a student.\n" +
                    "3. Add a lecturer.\n" +
                    "4. Register a course for a student.\n" +
                    "5. Register a course for a lecturer.\n" +
                    "6. Display collage information.\n" +
                    "7. Display the complete list of courses.\n" +
                    "8. Display the complete list of students.\n" +
                    "9. Display the complete list of lecturers.\n" +
                    "10. Display a list of courses currently taken by a particular student.\n" +
                    "11. Display a list of courses currently taught by a particular lecturer.\n" +
                    "12. Remove course.\n" +
                    "13.Remove student\n" +
                    "14.Remove lecturer\n" +
                    "15. Quit."
                    + "\n" + "----------------------------------------------------------------------");
            Scanner input = new Scanner(System.in);
            int choose = input.nextInt();


            if (choose == 1) { //add course choice
                System.out.println("please enter course ID ");
                int add1 = input.nextInt();
                System.out.println("please enter course name ");
                String add = input.next();

                C.addCourse(add1, add);


            } else if (choose == 2) {// add course choice
                System.out.println("please enter Student ID ");
                int add1 = input.nextInt();

                System.out.println("please enter Student name ");
                String add = input.next();

                C.addStudent(add1, add);


            } else if (choose == 3) {// Add a lecturer
                System.out.println("please enter lecturer ID ");
                int add1 = input.nextInt();
                System.out.println("please enter lecturer name ");
                String add = input.next();

                C.addLecturer(add1, add);


            } else if (choose == 4) {//Register a course for a student

                C.registereforstudent();

            } else if (choose == 5) {// Register a course for a lecturer

                C.registereforlecturer();

            } else if (choose == 6) {// Display collage information

                System.out.println(C.toString());

            } else if (choose == 7) {//Display the complete list of courses

                C.completelistofCOURSES();


            } else if (choose == 8) {// Display the complete list of students

                C.completelistofSTUDENT();

            } else if (choose == 9) {//Display the complete list of lecturers

                C.compeletelistofLECTURER();


            } else if (choose == 10) {//Display a list of courses currently taken by a particular student

                C.STUDENTcourses();
            } else if (choose == 11) {//Display a list of courses currently taught by a particular lecturer

                C.LECTURERcourses();

            } else if (choose == 12) {// Remove course

                C.RemoveCoures();

            } else if (choose == 13) {// Remove student

                C.removestudent();

            } else if (choose == 14) {// Remove lecturer

                C.removelecturer();

            } else if (choose == 15) {// exit the program
                break;
            } else {
                System.out.println("please enter the right value");
            }

        }


    }
}

//test

/* C.addStudent(111, "ahmed");
        C.addStudent(121, "khaled");
        C.addCourse(565, "CS");
        C.addCourse(999, "IS");

        System.out.println(C.student(0));
        System.out.println(C.course(0));

        STUDENT s1 = new STUDENT(C.student(0));
        STUDENT s2 = new STUDENT(C.student(1));
        COURSE c = new COURSE();
        COURSE c1 = new COURSE(C.course(0));
        COURSE c2 = new COURSE(C.course(1));
        s1.COURSE(C.course(0));
        s1.COURSE(C.course(1));
        s2.COURSE(C.course(0));
        s2.COURSE(C.course(1));

       System.out.println(s1.getCourses());

        System.out.println(C.getStudents());
        System.out.println(C.getCourses());
        System.out.println(c.getNumberOfRegisteredStudents());*/