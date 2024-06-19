/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hibernate;

import java.time.LocalDateTime;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author siti jahrona rambe
 */
public class Hibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        
        Transaction transaction = session.beginTransaction();
        
        User user = new User("admin", "admin");
        session.save(user);
        
        Teacher teacher1 = new Teacher("BambangSusilo", "12345", "T0001");
        session.save(teacher1);
        
        Teacher teacher2 = new Teacher("WayanSusena", "12345", "T0002");
        session.save(teacher2);
        
        Teacher teacher3 = new Teacher("NaniWijaya", "12345", "T0003");
        session.save(teacher3);
        
        Teacher teacher4 = new Teacher("SriMulyani", "12345", "T0004");
        session.save(teacher4);
        
        Student student1 = new Student("Yuki", "12345", "S0001", teacher1);
        session.save(student1);
        
        Student student2 = new Student("Chiko", "123123", "S0002", teacher1);
        session.save(student2);
        
        Student student3 = new Student("Lily", "123123", "S0003", teacher1);
        session.save(student3);
        
        Student student4 = new Student("Yudha", "123123", "S0004", teacher1);
        session.save(student4);
        
        Student student5 = new Student("Shiro", "123123", "S0005", teacher1);
        session.save(student5);
        
        Student student6 = new Student("Joko", "123123", "S0006", teacher2);
        session.save(student6);
        
        Student student7 = new Student("Keith", "123123", "S0007", teacher2);
        session.save(student7);
        
        Student student8 = new Student("Puja", "123123", "S0008", teacher2);
        session.save(student8);
        
        Student student9 = new Student("Siti", "123123", "S0009", teacher2);
        session.save(student9);
        
        Student student10 = new Student("Wibi", "123123", "S0010", teacher2);
        session.save(student10);
        
        Student student11 = new Student("Dimas", "123123", "S0011", teacher3);
        session.save(student11);
        
        Student student12 = new Student("Ucup", "123123", "S0012", teacher3);
        session.save(student12);
        
        Student student13 = new Student("Ishmail", "123123", "S0013", teacher3);
        session.save(student13);
        
        Student student14 = new Student("Malik", "123123", "S0014", teacher3);
        session.save(student14);
        
        Student student15 = new Student("Fira", "123123", "S0015", teacher3);
        session.save(student15);
        
        Student student16 = new Student("Celo", "123123", "S0016", teacher4);
        session.save(student16);
        
        Student student17 = new Student("Zelos", "123123", "S0017", teacher4);
        session.save(student17);
        
        Student student18 = new Student("Jaden", "123123", "S0018", teacher4);
        session.save(student18);
        
        Student student19 = new Student("Loki", "123123", "S0019", teacher4);
        session.save(student19);
        
        Student student20 = new Student("Asa", "123123", "S0020", teacher4);
        session.save(student20);
        
        
        Course course1 = new Course("Game Development", "C0001");
        session.save(course1);
        
        Course course2 = new Course("Software Engineering", "C0002");
        session.save(course2);
        
        Course course3 = new Course("Data Analytics", "C0003");
        session.save(course3);
        
        Course course4 = new Course("Machine Learning", "C0004");
        session.save(course4);
        
        Class class1 = new Class("CL001");
        class1.setTeacher(teacher1);
        class1.setCourse(course1);
        class1.getStudent().add(student1);
        class1.getStudent().add(student2);
        class1.getStudent().add(student3);
        class1.getStudent().add(student4);
        class1.getStudent().add(student5);
        session.save(class1);
        
        Class class2 = new Class("CL002");
        class2.setTeacher(teacher2);
        class2.setCourse(course2);
        class2.getStudent().add(student6);
        class2.getStudent().add(student7);
        class2.getStudent().add(student8);
        class2.getStudent().add(student9);
        class2.getStudent().add(student10);
        session.save(class2);
        
        Class class3 = new Class("CL003");
        class3.setTeacher(teacher3);
        class3.setCourse(course3);
        class3.getStudent().add(student11);
        class3.getStudent().add(student12);
        class3.getStudent().add(student13);
        class3.getStudent().add(student14);
        class3.getStudent().add(student15);
        session.save(class3);
        
        Class class4 = new Class("CL004");
        class4.setTeacher(teacher4);
        class4.setCourse(course4);
        class4.getStudent().add(student16);
        class4.getStudent().add(student17);
        class4.getStudent().add(student18);
        class4.getStudent().add(student19);
        class4.getStudent().add(student20);
        session.save(class4);
        
        Score score1 = new Score(90, class1, student1, course1);
        Score score2 = new Score(80, class1, student2, course1);
        Score score3 = new Score(75, class1, student3, course1);
        Score score4 = new Score(80, class1, student1, course2);
        Score score5 = new Score(100, class1, student4, course1);
        
        Score score6 = new Score(65, class1, student5, course1);
        Score score7 = new Score(90, class2, student6, course1);
        Score score8 = new Score(80, class2, student7, course1);
        Score score9 = new Score(75, class2, student8, course1);
        Score score10 = new Score(80, class2, student9, course2);
        
        Score score11 = new Score(100, class2, student10, course1);
        Score score12 = new Score(65, class3, student11, course1);
        Score score13 = new Score(65, class3, student12, course1);
        Score score14 = new Score(90, class3, student13, course1);
        Score score15 = new Score(80, class3, student14, course1);
        
        Score score16 = new Score(65, class3, student15, course1);
        Score score17 = new Score(90, class4, student16, course1);
        Score score18 = new Score(80, class4, student17, course1);
        Score score19 = new Score(75, class4, student18, course1);
        Score score20 = new Score(80, class4, student19, course2);
        
        
        student1.getScores().add(score1);
        student2.getScores().add(score2);
        student3.getScores().add(score3);
        student1.getScores().add(score4);
        student4.getScores().add(score5);
        student5.getScores().add(score6);
        student6.getScores().add(score7);
        student7.getScores().add(score8);
        student8.getScores().add(score9);
        student9.getScores().add(score10);
        student10.getScores().add(score11);
        student11.getScores().add(score12);
        student12.getScores().add(score13);
        student13.getScores().add(score14);
        student14.getScores().add(score15);
        student15.getScores().add(score16);
        student16.getScores().add(score17);
        student17.getScores().add(score18);
        student18.getScores().add(score19);
        student19.getScores().add(score20);
        
        session.save(score1);
        session.save(score2);
        session.save(score3);
        session.save(score4);
        session.save(score5);
        session.save(score6);
        session.save(score7);
        session.save(score8);
        session.save(score9);
        session.save(score10);
        session.save(score11);
        session.save(score12);
        session.save(score13);
        session.save(score14);
        session.save(score15);
        session.save(score16);
        session.save(score17);
        session.save(score18);
        session.save(score19);
        session.save(score20);
        
        session.save(student1);
        session.save(student2);
        session.save(student3);
        session.save(student4);
        session.save(student5);
        session.save(student6);
        session.save(student7);
        session.save(student8);
        session.save(student9);
        session.save(student10);
        session.save(student11);
        session.save(student12);
        session.save(student13);
        session.save(student14);
        session.save(student15);
        session.save(student16);
        session.save(student17);
        session.save(student18);
        session.save(student19);
        
        Meeting meeting1 = new Meeting("M0001", "Sesi 1", course1, class1, teacher1, LocalDateTime.of(2024, 03, 28, 14, 0));
        meeting1.getAttendees().add(student1);
        meeting1.getAttendees().add(student2);
        meeting1.getAttendees().add(student3);
        session.save(meeting1);
        
        Assignment assignment1 = new Assignment("A0001", "Assignment1", course1, class1, teacher1, LocalDateTime.of(2024, 04, 28, 23, 59));
        assignment1.getAssignee().add(student1);
        assignment1.getAssignee().add(student3);
        assignment1.getAssignee().add(student5);
        session.save(assignment1);
        
        transaction.commit();
        session.close();
           
        System.out.println(student1.getStudentId() + ": " + student1.getScores());
        System.out.println(student2.getStudentId() + ": "  + student2.getScores());
        System.out.println(student3.getStudentId() + ": "  + student3.getScores());
        
        System.out.println(student1.getStudentId() + ": " + student1.calculateIPK());
        System.out.println(student2.getStudentId() + ": "  + student2.calculateIPK());
        System.out.println(student3.getStudentId() + ": "  + student3.calculateIPK());
        
        student1.printTranscript();
        student2.printTranscript();
        student3.printTranscript();
        
        meeting1.printAttendees();
        assignment1.printAssignee();
    }
    
    
    
}


