package JavaBasics.PolyMorphism;
import java.io.InputStream;
import java.util.Scanner;


public class Person {
     String name;
     int age;

     Scanner sc = new Scanner(System.in);

     void introduce() {
         System.out.println("Hi, I'm " + name + " age " + age);
     }

     private static class Teacher extends Person {
         String subject;

         @Override
         void introduce() {
             System.out.println("Hello I'm " + name + " I teach " + subject);
         }

         void gradePapers() {
             System.out.println("Grading papers.. ");
         }

         String getSubject() {
             System.out.println("What is your subject");
             subject = sc.nextLine();
             return subject;
         }

     }

     private static class Student extends Person {
         int gradeLevel;

         @Override
         void introduce() {
             System.out.println("Hello I'm " + name + " I am now " + gradeLevel);
         }
         
         int getGradeLevel(){
             System.out.println("What is your Grade level ");
             gradeLevel = sc.nextInt();
             return gradeLevel;
         }

         void doHomework(){
             System.out.println("Doing homework...");
         }
     }

     private static class Staff extends Person {
         String role;

         @Override
         void introduce() {
             System.out.println("Hi I'm " + name + "and I work as a " + role);
         }

         void performDuty() {
             System.out.println("Performing my " + role + "duties");
         }

         String getRole(){
             System.out.println("What is your role");
             role = sc.nextLine();
             return role;
         }
    }


    public static void getPersonDetails() {

         // Initialize Person Class
        Person person = new Person();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("What is your name? ");
        person.name = sc1.nextLine();
        System.out.println("How old are you? ");
        person.age = sc1.nextInt();

        person.introduce();
        getUserInput(person.name, person.age);

    }

    public static void getUserInput(String name, int age) {

         // Set individual values for each class
         Teacher teacher = new Teacher();
         Student student = new Student();
         Staff    staff = new Staff();

         // Put in each class in an array
         Person[] person = new Person[] {
                new Teacher(), new Student(), new Student()
        };

         // Define the scanner
         Scanner sc1 = new Scanner(System.in);

         // Get the user Input
        System.out.println("----------Menu--------------");
        System.out.println("---1. Teacher");
        System.out.println("---2. Student");
        System.out.println("---3. Staff");
        System.out.println("----------------------------");
        int choice = sc1.nextInt();


        for (Person p1 : person) {
            if (choice == 1) {
                teacher.name = name;
                teacher.age = age;
                teacher.getSubject();
                teacher.introduce();
                break;
            }
            else if (choice == 2) {
                student.name = name;
                teacher.age = age;
                student.getGradeLevel();
                student.introduce();
                student.doHomework();
                break;
            }
            else if (choice == 3) {
                staff.name = name;
                staff.age = age;
                staff.getRole();
                staff.introduce();
                staff.performDuty();
                break;
            }
            else {
                System.out.println("Invalid Input, Please Try Again!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        getPersonDetails();
    }
}
