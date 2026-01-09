package Unit4A.CourseStudentExample;

public class Course {
    private String teacherName, subject, currentGrade;
    private int period;
    static int biggestSubjectLength = 0;

    public Course(String teacherName, String subject, String currentGrade, int period) {
        String spaces = "";
        this.teacherName = teacherName;
        this.period = period;

        if(currentGrade.length() == 1){
            this.currentGrade = currentGrade + " ";
        }
        else {
            this.currentGrade = currentGrade;
        }

        for(int i = 0; i < 40 - subject.length(); i++){
             spaces += " ";
        }
        this.subject = subject + spaces;
    }

    public Course(String subject, int period) {
        String spaces = "";

        teacherName = "";
        currentGrade = "  ";
        this.period = period;

        for(int i = 0; i < 40 - subject.length(); i++){
            spaces += " ";
        }

        this.subject = subject + spaces;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String courseToString(){
<<<<<<< HEAD
        return "Per: " + period + "    " + subject + "    " + teacherName;
=======
        return "Per: " + period + "    " + currentGrade + "    " + subject + "    " + teacherName;
>>>>>>> d715df1e771fd666b6fb6f39ea7dedfedecc882a
    }
}
