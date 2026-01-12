package Unit4A.CourseStudentExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentTester {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        Scanner inF = new Scanner(new File("oneCourse.txt"));

        String teacher = inF.nextLine();
        String subject = inF.nextLine();
        String grade = inF.nextLine();
        int period = inF.nextInt();

        Course c = new Course(teacher, subject, grade, period);
        System.out.println(c.courseToString());

        //close scanner
        inF.close();
         */

        /*
        Scanner inSchedule= new Scanner(new File("oneSchedule.txt"));

        String studentName = inSchedule.nextLine();
        Course[] classes = new Course[8];

        for(int i = 0; i < classes.length; i++){

            String teacher = inSchedule.nextLine();
            String subject = inSchedule.nextLine();
            String gradeInput = inSchedule.nextLine();
            int period = inSchedule.nextInt();
            String grade;

            if(gradeInput.equals("None")){
                grade = " ";
            }
            else{
                grade = gradeInput;
            }

            if(inSchedule.hasNextLine()){
                inSchedule.nextLine();
            }

            Course c = new Course(teacher, subject, grade, period);
            classes[i] = c;
        }

        Student s = new Student(studentName, classes);
        System.out.println(s.studentToString());
         */

        /*
        create a scanner for the studentScheduleData.txt file
        read max number of students
        create s student array f this size
        Outer loop
            read in name
            reate course
            innerloop:
                will read course data
                create the course add to course array
            create a student
            add student to student array

            print student array for accuracy
         */
        Scanner input = new Scanner(new File("studentScheduleData.txt"));
        int numStudents = input.nextInt();
        Student[] students = new Student[numStudents];

        int i = 0;
        while(i < numStudents && input.hasNextLine()){
            String studentName = input.nextLine();
            Course[] classes = new Course[8];

            for(int j = 0; j < classes.length; j++){

                String teacher = input.nextLine();
                String subject = input.nextLine();
                String gradeInput = input.nextLine();
                int period = input.nextInt();
                String grade;

                if(gradeInput.equals("None")){
                    grade = " ";
                }
                else{
                    grade = gradeInput;
                }

                if(input.hasNextLine()){
                    input.nextLine();
                }

                Course c = new Course(teacher, subject, grade, period);
                classes[i] = c;
            }

            Student a = new Student(studentName, classes);
            students[i] = a;

            i++;
        }

        /*
        System.out.println("There is a 40 character cap on the subject names");
        Course pe = new Course("Vlaming", "Basketball PE", "A", 1);
        Course math = new Course("Higgins", "Trig Calc A", "B+", 2);
        Course sci = new Course("O'Dette", "Physics 1", "A-", 3);
        Course lunch = new Course("Lunch", 4);
        Course lit = new Course("Gerber", "AP Lit", "A+", 5);
        Course psych = new Course("Ganas", "AP Psych", "B+", 6);
        Course studyHall = new Course("Study Hall", 7);
        Course spanish = new Course("Lernor", "Spanish 3", "A-", 8);

        Course[] list = {pe, math, sci, lunch, lit, psych, studyHall, spanish};
        Student a = new Student("Molly Jones", list);
        System.out.println(a.studentToString());
         */
    }
}
