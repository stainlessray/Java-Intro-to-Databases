package com.codedifferently;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {
    Person person;

    @Before
    public void setUp() {
        person = new Person("Bill", "Murray", "billsemail@hisdomain.com", 70);
    }

    @Test
    public void testGetFirstName() {
        String expected = "Bill";
        String actual = person.getFirstName();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSetFirstName() {
        person.setFirstName("William");
        String expected = "William";
        String actual = person.getFirstName();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testGetLastName() {
        String expected = "Murray";
        String actual = person.getLastName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetLastName() {
        person.setLastName("Chive");
        String expected = "Chive";
        String actual = person.getLastName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetEmail() {
        String actual = person.getEmail();
        String expected = "billsemail@hisdomain.com";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetEmail() {
        String expected = "billsOtherEmail@his.otherDomain.com";
        person.setEmail(expected);
        String actual = person.getEmail();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetAge() {
        Integer expected = 70;
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        Integer expected = 69;
        person.setAge(expected);
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
}
