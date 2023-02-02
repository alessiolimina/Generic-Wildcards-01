package it.develhope.genericwildcards;

import java.util.List;

public class Student {
    public String studentName;
    public String studentSurname;
    public double marksAverage;

    public Student(String name, String surname, double average) {
        this.studentName = name;
        this.studentSurname = surname;
        this.marksAverage = average;}

    public static double getAverageMark (List <? extends Number> listOfMarks) {
      return (listOfMarks.get(0).doubleValue() + listOfMarks.get(1).doubleValue()) / 2;
    }

    @Override
    public String toString() {
        return "The student " + studentName + " " + studentSurname + " has the a marks' average of " + marksAverage;
    }
}



