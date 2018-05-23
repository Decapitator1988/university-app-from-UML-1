package paul.golovatyuk.domain;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(name, subject.name) &&
                Objects.equals(teacher, subject.teacher) &&
                Objects.equals(group, subject.group) &&
                Objects.equals(classroom, subject.classroom);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, teacher, group, classroom);
    }

    @Override
    public String toString() {
        return name;
    }
}
