package random_challenges;
import java.lang.reflect.Array;
import java.util.*;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}

/*
 *   Class Constructor
 *
 *   @param firstName - A string denoting the Person's first name.
 *   @param lastName - A string denoting the Person's last name.
 *   @param id - An integer denoting the Person's ID number.
 *   @param scores - An array of integers denoting the Person's test scores.
 */

class Student extends Person{
    private int[] testScores;
    Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName,lastName,id);
        this.testScores = testScores;
    }

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */

    char calculate(){
        char grade = ' ';
        int avg = 0;
        avg = Arrays.stream(testScores).sum()/testScores.length;
        grade = (avg>=90&&avg<=100) ? 'O' : (avg<90&&avg>=80) ? 'E' : (avg<80&&avg>=70) ? 'A' : (avg<70&&avg>=55) ? 'P' :
        (avg<55&&avg>=40) ? 'D' : (avg<40) ? 'T' : 'F';
        return grade;
    }
}

public class InheritanceStudent {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String firstName = "Heraldo";//scan.next();
            String lastName = "Memelli";//scan.next();
            int id = 8135627;//scan.nextInt();
            int numScores = 2;//scan.nextInt();
            int[] testScores = new int[numScores];
            for(int i = 0; i < numScores; i++){
                testScores[i] = scan.nextInt();
            }
            scan.close();

            Student s = new Student(firstName, lastName, id, testScores);
            s.printPerson();
            System.out.println("Grade: " + s.calculate() );
        }
    }
