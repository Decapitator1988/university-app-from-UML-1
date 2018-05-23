package paul.golovatyuk.domain;

import java.awt.font.ShapeGraphicAttribute;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //create university
        University university = new University();
        //create group
        Group group66 = new Group(66);
        Group group77 = new Group(77);
        Group group88 = new Group(88);

        //create classroom
        Classroom classroom101 = new Classroom(101);
        Classroom classroom102 = new Classroom(102);
        Classroom classroom103 = new Classroom(103);

        //create students
        Student johnDaw = new Student("John Daw");
        Student freddyMercury = new Student("Freddy Mercury");
        Student albertEinstein = new Student("Albert Einstein");
        Student richardNixon = new Student("Richard Nixon");
        Student georgeWashington = new Student("George Washington");
        Student abrahamLincoln = new Student("Abraham Lincoln");
        Student dwightEisenhower = new Student("Dwight Eisenhower");
        Student theodorRoosevelt = new Student("Theodor Roosevelt");
        Student stephenKing = new Student("Stephen King");
        Student williamShakespeare = new Student("William Shakespeare");
        Student edgarAlanPau = new Student("Edgar Alan Pau");
        Student rayBradbury = new Student("Ray Bradbury");
        Student markTwain = new Student("Mark Twain");
        Student arthurClarke = new Student("Arthur Clarke");
        Student stephenHawking = new Student("Stephen Hawking");
        Student alfredNewton = new Student("Alfred Newton");
        Student alfredNobel = new Student("Alfred Nobel");
        Student johnNash = new Student("John Nash");
        Student dmitriMendeleev = new Student("Dmitri Mendeleev");
        Student nicholasTesla = new Student("Nicholas Tesla");

        johnDaw.setGroup(group66);
        albertEinstein.setGroup(group66);
        stephenHawking.setGroup(group66);
        alfredNewton.setGroup(group66);
        alfredNobel.setGroup(group66);
        johnNash.setGroup(group66);
        dmitriMendeleev.setGroup(group66);
        nicholasTesla.setGroup(group66);

        richardNixon.setGroup(group77);
        georgeWashington.setGroup(group77);
        abrahamLincoln.setGroup(group77);
        dwightEisenhower.setGroup(group77);
        theodorRoosevelt.setGroup(group77);

        freddyMercury.setGroup(group88);
        stephenKing.setGroup(group88);
        williamShakespeare.setGroup(group88);
        edgarAlanPau.setGroup(group88);
        rayBradbury.setGroup(group88);
        markTwain.setGroup(group88);
        arthurClarke.setGroup(group88);

        //create teachers
        Teacher plato = new Teacher("Plato");
        Teacher socrates = new Teacher("Socrates"); //TODO change name
        Teacher aristotle = new Teacher("Aristotle"); //TODO change name

        //create subjects
        Subject physics = new Subject("Physics");
        Subject literature = new Subject("Literature");
        Subject jurisprudence = new Subject("Jurisprudence");
        Subject math = new Subject("Math");
        Subject music = new Subject("Music");

        physics.setClassroom(classroom101);
        literature.setClassroom(classroom102);
        jurisprudence.setClassroom(classroom103);
        music.setClassroom(classroom102);
        math.setClassroom(classroom101);


        physics.setGroup(group66);
        literature.setGroup(group88);
        jurisprudence.setGroup(group77);
        math.setGroup(group88);
        music.setGroup(group66);

        physics.setTeacher(plato);
        literature.setTeacher(aristotle);
        math.setTeacher(plato);
        music.setTeacher(socrates);
        jurisprudence.setTeacher(aristotle);
//        create classes
         //monday
        List <Clazz> clazzList = university.getClazzes();
        Clazz firstClassOnMonday = new Clazz(literature, 2018, 5, 23, Clazz.Pairs.FIRST);
        clazzList.add(firstClassOnMonday);
        Clazz secondClassOnMonday = new Clazz(literature, 2018, 5, 23, Clazz.Pairs.SECOND);
        clazzList.add(secondClassOnMonday);
        Clazz thirdClassOnMonday = new Clazz(math, 2018, 1, 15, Clazz.Pairs.SECOND);
        clazzList.add(thirdClassOnMonday);
        Clazz fourthClassOnMonday = new Clazz(physics, 2018, 1, 15, Clazz.Pairs.FOURTH);
        clazzList.add(fourthClassOnMonday);

        //tuesday
        Clazz firstClassOnTuesday = new Clazz(math, 2018, 1, 16, Clazz.Pairs.FIRST);
        clazzList.add(firstClassOnTuesday);
        Clazz secondClassOnTueasday = new Clazz(literature, 2018, 1, 16, Clazz.Pairs.SECOND);
        clazzList.add(secondClassOnTueasday);
        Clazz thirdClassOnTuesday = new Clazz(physics, 2018, 1, 16, Clazz.Pairs.SECOND);
        clazzList.add(thirdClassOnTuesday);
        Clazz fourthClassOnTueasday = new Clazz(physics, 2018, 1, 16, Clazz.Pairs.FOURTH);
        clazzList.add(fourthClassOnTueasday);

        // wednesday
        Clazz firstClassOnWednesday = new Clazz(jurisprudence, 2018, 1, 17, Clazz.Pairs.FIRST);
        clazzList.add(firstClassOnWednesday);
        Clazz secondClassOnWednesday = new Clazz(jurisprudence, 2018, 1, 17, Clazz.Pairs.SECOND);
        clazzList.add(secondClassOnWednesday);
        Clazz thirdClassOnWednesday = new Clazz(music, 2018, 1, 17, Clazz.Pairs.THIRD);
        clazzList.add(thirdClassOnWednesday);
        Clazz fourthClassOnWednesday = new Clazz(math, 2018, 1, 17, Clazz.Pairs.FOURTH);
        clazzList.add(fourthClassOnWednesday);

        //thursday
        Clazz firstClassOnThursday = new Clazz(math, 2018, 1, 18, Clazz.Pairs.FIRST);
        clazzList.add(firstClassOnThursday);
        Clazz secondClassOnThursday = new Clazz(math, 2018, 1, 18, Clazz.Pairs.SECOND);
        clazzList.add(secondClassOnThursday);
        Clazz thirdClassOnThursday = new Clazz(music, 2018, 1, 18, Clazz.Pairs.THIRD);
        clazzList.add(thirdClassOnThursday);
        Clazz fourthClassOnSThursday = new Clazz(math, 2018, 1, 18, Clazz.Pairs.FOURTH);
        clazzList.add(fourthClassOnSThursday);

//        //friday
        Clazz firstClassOnFriday = new Clazz(jurisprudence, 2018, 1, 19, Clazz.Pairs.FIRST);
        clazzList.add(firstClassOnFriday);
        Clazz secondClassOnFriday = new Clazz(music, 2018, 1, 19, Clazz.Pairs.SECOND);
        clazzList.add(secondClassOnFriday);

        System.out.println(clazzList.size());

        System.out.println("Freddy Mercury has " + university.getStudentsScheduleForDay(freddyMercury).size()+" classes");
        System.out.println(university.getStudentsScheduleForDay(albertEinstein).size());


    }

}
