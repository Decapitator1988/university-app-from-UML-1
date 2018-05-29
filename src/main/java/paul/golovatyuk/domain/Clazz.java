package paul.golovatyuk.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Clazz {

    private Subject subject;
    private LocalDateTime dateTime;

    public enum Pairs {
        FIRST (LocalTime.of(8, 0)),
        SECOND (LocalTime.of(9, 40)),
        THIRD (LocalTime.of(11, 30)),
        FOURTH (LocalTime.of(12, 45));

        private LocalTime time;
        Pairs(LocalTime time) {
            this.time = time;
        }
        public LocalTime getTime() {
            return time;
        }
    }

    public Clazz() {
    }

    public Clazz(Subject subject, int year, int month, int day, Pairs pairs) {
        this.subject = subject;
        this.dateTime = LocalDateTime.of(LocalDate.of(year, month, day), pairs.getTime());
    }


    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }



    @Override
    public String toString() {
        return "Class " +
                "subject is " + subject +
                ",date and time is " + dateTime +
                '}';
    }
}
