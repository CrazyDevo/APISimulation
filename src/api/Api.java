package api;

import database.classes.Mentor;
import database.classes.Student;
import database.classes.Teacher;
import database.Database;

public class Api extends Database {


    public static void get(String url) {
        if (url.endsWith("/teachers")){
            System.out.println(teachers);
        } else if (url.endsWith("/students")) {
            System.out.println(students);

        } else if (url.endsWith("/mentors")) {
            System.out.println(mentors);
        }else {
            System.out.println("404 Not Found");
        }
    }

    public static void post(String url, Object obj) {

        if (url.endsWith("/teachers")){
            teachers.add((Teacher) obj);
        } else if (url.endsWith("/students")) {
            students.add((Student) obj);

        } else if (url.endsWith("/mentors")) {
            mentors.add((Mentor) obj);
        }else {
            System.out.println("404 Not Found");
        }

    }

    public static void delete(String url, int id) {

        if (url.endsWith("/teachers")){
            Teacher obj=null;
            for (Teacher teacher : teachers) {
                if (teacher.getId()==id) {
                    obj = teacher;
                    break;
                }
            }
            teachers.remove(obj);

        } else if (url.endsWith("/students")) {
            Student obj=null;
            for (Student student : students) {
                if (student.getId()==id){
                   obj=student;
                   break;
                }

            }
            students.remove(obj);

        } else if (url.endsWith("/mentors")) {
            Mentor obj=null;
            for (Mentor mentor : mentors) {
                if (mentor.getId()==id){
                    obj=mentor;
                    break;
                }

            }
            mentors.remove(obj);
        }else {
            System.out.println("404 Not Found");
        }

    }
}
