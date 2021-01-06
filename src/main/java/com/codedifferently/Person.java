package com.codedifferently;

public class Person {

    private String firstName;
    private String lastName;
    private String email;
    private Integer age;


    public Person(String firstName, String lastName, String email, Integer age) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setAge(age);
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

    //todo Constructor from UML
    //


}
