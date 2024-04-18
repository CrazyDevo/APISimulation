package web;

import api.Api;
import database.Database;
import database.classes.Student;
import database.classes.Teacher;

public class ApiTest {

    public static void main(String[] args) {
        String url = "https://cydeo.com/teachers";

        Api.get(url);
        Teacher teacher = new Teacher("Akbar", 8);
        Api.post(url, teacher);
        Api.get(url);
        System.out.println("======================================");
        url = "https://cydeo.com/students";
        Student student = new Student("Huseyin", 8);
        Api.get(url);
        Api.post(url, student);
        Api.get(url);
        //  System.out.println(" ==================================");
        //  Api.delete(url,1);
        //  Api.get(url);


    }
}
