package ru.mirea.lab4_1.subtask3;

public class Person {
        private String fullName;
        private int age;

        public Person() {
            // Конструктор без параметров
        }

        public Person(String fullName, int age) {
            this.fullName = fullName;
            this.age = age;
        }

        public void move() {
            System.out.println(fullName + " говорит");
        }

        public void talk() {
            System.out.println(fullName + " двигается");
        }

        public static void main(String[] args) {
            // Создаем объекты класса Person с разными конструкторами
            Person person1 = new Person();
            person1.fullName = "Иванов Иван Иванович";
            person1.age = 30;

            Person person2 = new Person("Петров Петр Петрович", 25);

            // Вызываем методы для объектов
            person1.move();
            person1.talk();

            System.out.println();

            person2.move();
            person2.talk();
        }
    }

