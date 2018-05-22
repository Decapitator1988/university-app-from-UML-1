package paul.golovatyuk.domain;

import java.time.LocalDateTime;

public class Clazz {
    private Subject subject;
    private LocalDateTime dateTime;

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
}
