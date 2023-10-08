package lesson_1.hw;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        hello();
        whatIsYourName();
        }

    static void hello() {
        System.out.println("Hello world!");
    }

    static void whatIsYourName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello! What is your name!");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "! Nice to met you!");
    }
}
