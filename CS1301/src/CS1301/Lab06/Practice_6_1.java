package CS1301.Lab06;
// Class: CS 1301/01
// Term: Summer 2016
// Name: Zachary Jones
// Instructor: Chad Teat
// Lab: 6

public class Practice_6_1 {

  public static void main(String[] args) {
    int sum = 0;  // declare this outside the loop to keep it in scope
    for (int i = 1; i <= 100; sum += i++);
    System.out.println("The sum of all integers from 1 to 100 is " + sum);
  }

}
