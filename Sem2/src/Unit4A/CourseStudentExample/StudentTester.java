package Unit4A.CourseStudentExample;

public class StudentTester {
    public static void main(String[] args){
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
    }
}
