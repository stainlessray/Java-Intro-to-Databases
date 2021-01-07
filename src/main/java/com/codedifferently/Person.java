package com.codedifferently;

import java.util.UUID;

public class Person {

    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    private String id;

    /**
     * Use this method to create a new person object
     * @param firstName
     * @param lastName
     * @param email
     * @param age
     */
    public Person(String firstName, String lastName, String email, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        id = UUID.randomUUID().toString();
    }

    /**
     * use this method when getting a Person from the database
     * @param id
     * @param firstName
     * @param lastName
     * @param email
     * @param age
     */
    public Person(String id, String firstName, String lastName, String email, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
