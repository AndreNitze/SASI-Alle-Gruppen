package de.brandenburg.nitzeapp;

public abstract class Person {
    private String name;
    private Integer age = 0;
    private double phoneNumber;
    private String emailAddress;
    private Address livesAt;

    public boolean hasParkingPass() {
        return false;
    }

    public Person (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Address getLivesAt() {
        return livesAt;
    }

    public void setLivesAt(Address livesAt) {
        this.livesAt = livesAt;
    }

    public void greet() {
        System.out.printf("Hi! My name is %s and I am a %s.",
                this.getName(),
                this.getClass().getSimpleName());
    }
}
