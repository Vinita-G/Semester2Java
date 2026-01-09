package Unit4A.CourseStudentExample;

public class Course {
    private String teacherName, subject, currentGrade;
    private int period;
    static int biggestSubjectLength = 0;

    public Course(String teacherName, String subject, String currentGrade, int period) {
        this.teacherName = teacherName;
        this.period = period;

        if(currentGrade.length() == 1){
            this.currentGrade = currentGrade + " ";
        }
        else {
            this.currentGrade = currentGrade;
        }
        this.subject = subject;
    }

    public Course(String subject, int period) {
        teacherName = "";
        currentGrade = "  ";
        this.period = period;
        this.subject = subject;
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

    public void setSubject(String newsubject) {
        this.subject = newsubject;
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
        return "Per: " + period + "    " + currentGrade + "    " + subject + "    " + teacherName;
    }
}
