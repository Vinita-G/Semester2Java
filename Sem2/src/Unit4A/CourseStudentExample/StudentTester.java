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
        Scanner input = new Scanner(new File("studentScheduleData (1).txt"));
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

                Course c = new Course(teacher, subject, grade, period);
                classes[i] = c;
            }

            Student a = new Student(studentName, classes);
            students[i] = a;

            i++;
        }
        System.out.println(students.studentToString());