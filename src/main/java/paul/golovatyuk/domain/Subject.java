package paul.golovatyuk.domain;

public class Subject {
    private String name;
    private Teacher teacher;
    private Group group;
    private Classroom classroom;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Group getGroup() {
        return group;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }
}
