package de.brandenburg.nitzeapp;

public class Student extends Person {
    private double studentNumber;

    public Student(String name) {
        super(name);
    }

    public boolean isEligibleToEnroll() {
        return false;
    }

    public void getSeminarHistory() {

    }

    public void takeExamination() {

    }
}
