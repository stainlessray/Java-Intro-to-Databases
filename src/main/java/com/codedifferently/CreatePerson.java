package com.codedifferently;

import com.codedifferently.database.DataBase;
import com.codedifferently.database.DataBaseConnectionException;

import java.util.ArrayList;
import java.util.Scanner;

public class CreatePerson {
    private ArrayList<String> menu;
    Scanner scanner;

    private void initMenuOption(){
        menu = new ArrayList<>();
        menu.add("Exit");
        menu.add("Create new person");
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
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public Integer getUserInputInt(String fieldInt) {
        System.out.printf("Enter %s: ", fieldInt);
        return scanner.nextInt();
    }

    public Person createNewPerson() {
        String firstName = getUserInputStr("firstName");
        String lastName = getUserInputStr("lastName");
        String email = getUserInputStr("email");
        Integer age = getUserInputInt("age");
        return new Person(firstName, lastName, email, age);
    }

    public static Person newPerson() throws DataBaseConnectionException {
        CreatePerson entryMenu = new CreatePerson();
        Person person = null;
        entryMenu.initMenuOption();
        boolean endProgram = false;
        while (!endProgram) {
            String field;
            String fieldInt;
            int menuOption = entryMenu.displayMenu();

            switch (menuOption) {
                case 0:
                    System.out.println(menuOption + " going back to main menu..");
                    endProgram = true;
                    break;

                case 1:
                    person = entryMenu.createNewPerson();
                    break;
                default:
                    break;
            }
        }
        return person;
    }
}
