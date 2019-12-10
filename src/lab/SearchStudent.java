package lab;

public class SearchStudent {
    String courseName;
    String courseId;
    String teacherName;
    String teacherId;
    String classId;
    String classroom;
    int chour;

    public SearchStudent(){
        this.classId = null;
        this.classroom = null;
        this.courseId = null;
        this.courseName = null;
        this.teacherId = null;
        this.teacherName = null;
        this.chour = 0;
    }

    public String getClassId() {
        return classId;
    }

    public String getClassroom() {
        return classroom;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public void setClassroom(String className) {
        this.classroom = className;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getChour() {
        return chour;
    }

    public void setChour(int chour) {
        this.chour = chour;
    }
}


