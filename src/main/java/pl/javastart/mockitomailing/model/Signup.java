package pl.javastart.mockitomailing.model;

import java.time.LocalDate;

public class Signup {

    private String user;
    private String course;
    private LocalDate accessFrom;
    private LocalDate accessTo;

    public Signup(String user, String course, LocalDate accessFrom, LocalDate accessTo) {
        this.user = user;
        this.course = course;
        this.accessFrom = accessFrom;
        this.accessTo = accessTo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public LocalDate getAccessFrom() {
        return accessFrom;
    }

    public void setAccessFrom(LocalDate accessFrom) {
        this.accessFrom = accessFrom;
    }

    public LocalDate getAccessTo() {
        return accessTo;
    }

    public void setAccessTo(LocalDate accessTo) {
        this.accessTo = accessTo;
    }
}
