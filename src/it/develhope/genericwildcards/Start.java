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

        double lisaAvg = Student.getAverageMark(individualMarksListLisa);
        double jeremyAvg = Student.getAverageMark(projectMarksListJeremy);

        List<Student> listOfStudents = new ArrayList<>();
        Student lisa = new Student("Lisa", "Stuart", lisaAvg );
        Student jeremy = new Student("Jeremy", "Green", jeremyAvg);
        listOfStudents.add(lisa);
        listOfStudents.add(jeremy);
        System.out.println(lisa);
        System.out.println(jeremy);
        //TODO how to use the get method here?

    }
}

