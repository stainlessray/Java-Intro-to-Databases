package com.codedifferently;

import java.util.ArrayList;
import java.util.Scanner;

public class CreatePerson {
    private ArrayList<String> menu;
    Scanner scanner;

    private void initMenuOption(){
        menu = new ArrayList<>();
        menu.add("Exit");
        menu.add("Input First Name");
        menu.add("Input Last Name");
        menu.add("Input Email Address");
        menu.add("Input Age");
        menu.add("Save");
        scanner = new Scanner(System.in);
    }

    public Integer displayMenu(){
        int option;
        for(int i = 0; i < menu.size(); i++){
            String menuOption = String.format("Press %d to %s", i, menu.get(i));
            System.out.println(menuOption);
        }
        option = scanner.nextInt();
        return option;
    }

    public String getUserInputStr(String fieldStr) {
        System.out.printf("Enter %s: ", fieldStr);
        //Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public Integer getUserInputInt(String fieldInt) {
        System.out.printf("Enter %s: ", fieldInt);
        return scanner.nextInt();
    }

    public static void newPerson() {
        CreatePerson entryMenu = new CreatePerson();
        entryMenu.initMenuOption();
        boolean endProgram = false;
        System.out.println("Create New Entry");
        StringBuilder userInformation = new StringBuilder();
        String newFirstName = "";
        String newLastName = "";
        String newEmail = "";
        while (!endProgram) {
            String field;
            String fieldInt;
            int menuOption = entryMenu.displayMenu();

            switch(menuOption){

                case 0:
                    System.out.println(menuOption +" going back to main menu..");
                    endProgram = true;
                    break;
                case 1:
                    field = "firstName";
                    newFirstName = entryMenu.getUserInputStr(field);
                    userInformation.append("First Name: ").append(newFirstName).append("\n");
                case 2:
                    field = "lastName";
                    newLastName = entryMenu.getUserInputStr(field);
                    userInformation.append("Last Name: ").append(newLastName).append("\n");
                case 3:
                    field = "email";
                    newEmail = entryMenu.getUserInputStr(field);
                    userInformation.append("Email: ").append(newEmail).append("\n");
                case 4:
                    fieldInt = "age";
                    Integer newAge = entryMenu.getUserInputInt(fieldInt);
                    userInformation.append("Age: ").append(newAge).append("\n");
                    System.out.println(" ** Preparing contact " + "\n" + userInformation);
                    Person person = new Person(newFirstName, newLastName, newEmail, newAge);
                    break;
                case 5:
                    field = "confirm (y/n)";
                    System.out.println("Would you like to save this contact?");
                    String confirm = entryMenu.getUserInputStr(field);
                default:
                    break;
            }
        }
    }
}
