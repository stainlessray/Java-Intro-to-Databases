package com.codedifferently;

public class CreateMockPerson {

    public void writeToDatabase(Person person) {
        // Insert db write task here
        System.out.println(person.getAge());
    }

    public static void main(String[] args) {
        String newFirstName = "Firstname";
        String newLastName = "Lastname";
        String newEmail = "emailaddress@domain.com";
        Integer newAge = 40;
        CreateMockPerson createMockPerson = new CreateMockPerson();
        createMockPerson.writeToDatabase(new Person(newFirstName, newLastName, newEmail, newAge));
    }
}
