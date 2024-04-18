package database;

import database.classes.Mentor;
import database.classes.Student;
import database.classes.Teacher;

import java.util.ArrayList;
import java.util.Arrays;

public class Database {
    protected static ArrayList<Student> students=new ArrayList<>();
    protected static ArrayList<Teacher> teachers=new ArrayList<>();
    protected static ArrayList<Mentor> mentors=new ArrayList<>();

    static {
        Student student1=new Student("Alena",1);
        Student student2=new Student("Zurab",2);
        Student student3=new Student("Olena",3);
        Student student4=new Student("Shirin",4);
        Student student5=new Student("Nargiz",5);
        Student student6=new Student("Tatsiana",6);
        Student student7=new Student("Nasera",7);
        students.addAll(Arrays.asList(student1,student4,student2,student3,student7,student6,student5));
        Teacher teacher1=new Teacher("Adam",1);
        Teacher teacher2=new Teacher("Saim",2);
        Teacher teacher3=new Teacher("Muhtar",3);
        Teacher teacher4=new Teacher("Gurhan",4);
        Teacher teacher5=new Teacher("Mike",5);
        Teacher teacher6=new Teacher("Asya",6);
        Teacher teacher7=new Teacher("Mehmet",7);
        teachers.addAll(Arrays.asList(teacher1,teacher2,teacher7,teacher3,teacher4,teacher6,teacher5));

        Mentor mentor1=new Mentor("Aaron",1);
        Mentor mentor2=new Mentor("Alvin",2);
        Mentor mentor3=new Mentor("Emma",3);
        Mentor mentor4=new Mentor("Chakar",4);
        Mentor mentor5=new Mentor("David",5);
        Mentor mentor6=new Mentor("Celine",6);
        Mentor mentor7=new Mentor("Edison",7);
        mentors.addAll(Arrays.asList(mentor1,mentor2,mentor3,mentor4,mentor7,mentor6,mentor5));

    }

}
