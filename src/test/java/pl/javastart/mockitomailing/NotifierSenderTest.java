package pl.javastart.mockitomailing;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import pl.javastart.mockitomailing.model.Course;
import pl.javastart.mockitomailing.model.Signup;
import pl.javastart.mockitomailing.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

public class NotifierSenderTest {

    @Mock
    Database database;

    @Mock
    MailSystem mailSystem;

    @Before
    public void init() {
        Course javaCourse = new Course("Java Podstawy");
        Course springCourse = new Course("Kurs Spring");
        Course MockitoCourse = new Course("SPECJALNY KURS Mockito");

        List<User> userList = new ArrayList<>();
        userList.add(new User("extruder", "extruder@buziaczek.pl"));
        userList.add(new User("compressor", "compressor@costam.pl"));
        userList.add(new User("kontakt", "afdsa@sfd.pl"));

        List<Signup> signupList = new ArrayList<>();
        signupList.add(new Signup("extruder", "SPECJALNY KURS Mockito",  ))

        List<Course> courses = new ArrayList<>();

        when(database.getAllCourses()).thenReturn(courses);
    }

    @Test
    public void shouldDoSth() {
       // NotifierSender notifierSender = new NotifierSender();
    }

}