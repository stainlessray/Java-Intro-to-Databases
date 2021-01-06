package com.codedifferently;

import com.codedifferently.database.DataBase;
import com.codedifferently.database.DataBaseConnectionException;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private DataBase dataBase;
    private static Scanner scanner;

    private ArrayList<String> menu;
    public Main() throws DataBaseConnectionException {
        dataBase = new DataBase();
        scanner = new Scanner(System.in);
        initMenuOption();
    }

    private void initMenuOption(){
        menu = new ArrayList<>();
        menu.add("Exit");
        menu.add("Add New Person");
    }

    public Integer displayMenu(){
        int option;
        for(int i = 0; i < menu.size(); i++){
            String menuOption = String.format("Press %d for %s", i, menu.get(i));
            System.out.println(menuOption);
        }
        option = scanner.nextInt();
        return option;
    }

    public static void main(String[] args) {
        try {
            Main main = new Main();
            Boolean endProgram = false;
            System.out.println("Address Book");
            while (!endProgram) {
                int menuOption = main.displayMenu();

                switch(menuOption){
                    case 0:
                        System.out.println("Goodbye!!");
                        endProgram = true;
                        break;
                    case 1:
                        System.out.println(menuOption + "selected");
                        CreatePerson.newPerson();
                        break;
                    case 2:
                        System.out.println(menuOption + "selected ");
                        break;
                    default:
                        break;
                }
            }
        } catch (DataBaseConnectionException e) {
            System.out.println("Your database could not be connected to.");
        }
    }
}
