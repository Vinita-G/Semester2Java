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

    public String studentToString(){
        String result = "Student Name: " + name ;
        int longestSubjStr = 0;

        for (Course a : myClasses) {
            if(a.getSubject().length() > longestSubjStr){
                longestSubjStr = a.getSubject().length();
            }

        }

        for (Course myClass : myClasses) {
            String spaces = "";
            for (int i = 0; i < (longestSubjStr - myClass.getSubject().length()); i++) {
                spaces += " ";
            }
            myClass.setSubject(myClass.getSubject() + spaces);
        }

        for (Course a : myClasses) {
            result += "\n" + a.courseToString();
        }
        return result;
    }

}
