package pl.javastart.mockitomailing;

import pl.javastart.mockitomailing.model.Course;
import pl.javastart.mockitomailing.model.Signup;
import pl.javastart.mockitomailing.model.User;
import pl.javastart.mockitomailing.util.DateProvider;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class NotifierSender {

    private MailSystem mailSystem;
    private Database database;
    private DateProvider dateProvider;

    public NotifierSender(MailSystem mailSystem, Database database, DateProvider dateProvider) {
        this.mailSystem = mailSystem;
        this.database = database;
        this.dateProvider = dateProvider;
    }

    public void prepareAndSendMails() {

        LocalDate today = dateProvider.getCurrentDate();
        int[] daysToEnd = {90, 30, 7, 1};

        List<User> userList = database.getAllUsers();
        List<Signup> signupList = database.getAllSignups();

        List<User> userListToInform = new ArrayList<>();

        for (int days : daysToEnd) {
            for (Signup signups : signupList) {
                if (signups.getAccessTo().plusDays(days).equals(today)) {
                    for (User user : userList) {
                        if (user.getName().equals(signups.getUser())) {
                            userListToInform.add(user);
                        }
                    }
                }
            }
        }
        for (User users : userListToInform) {
            mailSystem.sendEmail(users.getEmail(), "Koniec kursu", "Zostało Ci " + daysToEnd + " dni do końca kursu!");
        }

    }
}