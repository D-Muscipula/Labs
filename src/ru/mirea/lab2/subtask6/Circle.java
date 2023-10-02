package ru.mirea.lab2.subtask6;

public class Circle {
   private double radius;

   public Circle(double radius) {
      this.radius = radius;
   }

   public double getRadius() {
      return radius;
   }

   public Circle setRadius(double radius) {
      this.radius = radius;
      return this;
   }
   public double getSquare(){
      return this.radius * this.radius*Math.PI;
   }
   public double getLength(){
      return this.radius*2*Math.PI;
   }

   public boolean equals(Circle obj) {
      return this.radius == obj.radius;
   }
}


