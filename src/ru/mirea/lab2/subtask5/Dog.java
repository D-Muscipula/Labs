package ru.mirea.lab2.subtask5;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Dog setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Dog setAge(int age) {
        this.age = age;
        return this;
    }
    public int getHumanAge(){
        return this.age*7;
    }
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age;
    }
}
