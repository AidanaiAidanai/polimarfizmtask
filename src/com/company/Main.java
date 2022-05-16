package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Journalist journalist = new Journalist();
        Interpreter interpreter = new Interpreter();
        Doctor doctor = new Doctor();

        Person[]arr = {journalist, interpreter, doctor };
        for (Person person : arr) {
            person.walk();
        }
    }
}
