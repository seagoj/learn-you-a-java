package org.seagoj;

import java.util.Scanner;

public class HelloWorld {
  static Scanner userInput = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("What is your name? ");
    if (userInput.hasNextLine()) {
      System.out.println("Hello World, " + userInput.nextLine());
    } else {
      System.out.println("That doesn't look like a name.");
    }
  }
}
