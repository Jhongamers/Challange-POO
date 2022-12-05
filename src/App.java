import java.time.LocalDate;

import br.com.challange.dominio.Course;
import br.com.challange.dominio.Mentorship;

public class App {
    public static void main(String[] args) throws Exception {
        Course course = new Course();
       
        course.setTitle("Course java");
        course.setDescription("Description course java");
        course.setTimeLoad(8);

        Course course2 = new Course();
       
        course2.setTitle("Course js");
        course2.setDescription("Description course js");
        course2.setTimeLoad(4);

        

        Mentorship mentorship = new Mentorship();
        mentorship.setTitle("mentorship of js");
        mentorship.setDescription("description mentorship java");
        mentorship.setDate(LocalDate.now());
        
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Description Bootcamp Java Developer");

        bootcamp.getContents().add(course);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentorship);


        Dev devJonhn = new Dev();
        devJonhn.setName("John");
        devJonhn.subscribeBootcamp(bootcamp);
        System.out.println("Content Subscription"+devJonhn.getContentsSubscribe());
        
        devJonhn.progress();
        devJonhn.progress();

        System.out.println("-");

        System.out.println("Content Subscription"+devJonhn.getContentsSubscribe());
        System.out.println("Content Finished"+devJonhn.getContentFinished());
        System.out.println("XP "+devJonhn.calculatTotaleXp());


        System.out.println("*****************");

        Dev devThay  = new Dev();
        devThay.setName("Thay");
        devThay.subscribeBootcamp(bootcamp);
        System.out.println("Content Subscription"+devThay.getContentsSubscribe());
        
        devThay.progress();
        
        System.out.println("-");
        
        System.out.println("Content Subscription"+devThay.getContentsSubscribe());
        System.out.println("Content Finished"+devThay.getContentFinished());
        System.out.println("XP "+devThay.calculatTotaleXp());

    }
}
