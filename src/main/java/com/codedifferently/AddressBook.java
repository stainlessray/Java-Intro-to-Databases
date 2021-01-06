package com.codedifferently;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private Person owner;
    private List<Person> people = new ArrayList<>();

    public AddressBook() {

    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person person) {
        this.owner = person;
    }

    public void addPerson(Person person) {
        this.people.add(person);

    }

    public void removePerson(Person person) {
    }

    public Person getPersonByEmail(String email) {
        return null;
    }

    public List<Person> getAllPeople() {
        people.forEach( Person ->
                System.out.print( "\n" + Person.getFirstName() + " " + Person.getLastName() + "\n")
        );
        return this.people;
    }
}
