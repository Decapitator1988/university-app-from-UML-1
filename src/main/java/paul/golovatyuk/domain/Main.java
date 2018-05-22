package paul.golovatyuk.domain;

import java.awt.font.ShapeGraphicAttribute;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        Group group = new Group(66);
        Student student = new Student("John, Daw");
        student.setGroup(group);

        university.addGroup(new Group(1));

        university.addStudent(student);
        university.addStudent(new Student("Elvis Presley"));

        university.addTeacher(new Teacher("Stephen  Hawking"));

        university.addClassroom(new Classroom(67));

        university.addSubject(new Subject("Physics"));

        Clazz clazz = new Clazz();
        Subject physics = new Subject("Physics");
        physics.setGroup(group);
        clazz.setSubject(physics);
        clazz.setDateTime(LocalDateTime.of(LocalDate.of(2018, 1, 15),
                LocalTime.of(8, 0)));
        university.addClass(clazz);

        System.out.println(university.getStudentsScheduleForDay(student).size());

    }

}
