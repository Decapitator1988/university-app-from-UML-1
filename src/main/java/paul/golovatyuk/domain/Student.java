package paul.golovatyuk.domain;

public class Student {
    private String name;
    private Group group;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }
}
