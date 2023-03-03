package fei.stuba.uim.oop;

public class Student {

    int ID;
    String name;
    String surename;
    int age;

    public Student() {}

    public Student(int ID, String name, String surename, int age ) {
        this.ID = ID;
        this.name = name;
        this.surename = surename;
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSurename() {
        return surename;
    }

    public int getAge() {
        return age;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

