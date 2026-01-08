package Unit4A.CourseStudentExample;

public class Student {
    private String name;
    private Course[] myClasses;

    public Student(String name){
        this.name = name;
        this.myClasses = new Course[8];
    }

    public Student(String name, Course[] myClasses){
        this.name = name;
        this.myClasses = myClasses;
    }

    public void setName(String newName){
        name = newName;
    }

    public String getName(){
        return name;
    }

    public Course[] getMyClasses() {
        return myClasses;
    }

    public void setMyClasses(Course[] newClasses) {
        this.myClasses = newClasses;
    }

    public static String toString(){
        String result = "Student Name: " + name ;
        for (Course a : myClasses) {
            result += "\n" + a.toString();
        }
        return result;
    }
}
