package it.develhope.genericwildcards;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<Double> individualMarksListLisa = new ArrayList<>();
        individualMarksListLisa.add(9.64);
        individualMarksListLisa.add(8.54);

        List<Integer> projectMarksListJeremy = new ArrayList<>();
        projectMarksListJeremy.add(7);
        projectMarksListJeremy.add(8);

        Student.getAverageMark(individualMarksListLisa);
        Student.getAverageMark(projectMarksListJeremy);

        List<Student> listOfStudents = new ArrayList<>();
        Student lisa = new Student("Lisa", "Stuart", );
        Student jeremy = new Student("Jeremy", "Green", );
        listOfStudents.add(lisa);
        listOfStudents.add(jeremy);



    }
}


/*

considering that:
there are two types of marks for the students:
a List of 2 Double elements for individual marks
a List of 2 Integer elements for project marks
Lisa Stuart has a List called individualMarksListLisa of individual marks
Jeremy Green has a List called projectMarksListJeremy of project marks
define a testing class with a method main() where you:
create the individualMarksListLisa list
add two random double values to the list using the .add() built-in method of the List
create the projectMarksListJeremy list
add two random int values to the list using the .add() built-in method of the List
calculate (using the static method Student.getAverageMark()) the marks average double values for lisaAvg and jeremyAvg
create a listOfStudents
add the two new Student objects (Lisa and Jeremy) to the list, using the add() method and the Student's constructor
print in console the details of the two Students inside the listOfStudents using:
the override method
the get() built-in method from List





  // double marks coming from Lisa's individual homework


        // int marks coming from Jeremy's projects


        // calculate the marks averages for Lisa and Jeremy


        // create a new List of Student objects and add the 2 Student(s) using the constructor


        // print in console all the details about the two Student objects
 */