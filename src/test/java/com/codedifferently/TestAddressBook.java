package com.codedifferently;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestAddressBook {

    @Test
    public void testGetOwner() {
        AddressBook addressBook = new AddressBook();
        addressBook.setOwner(new Person("Bill", "Murray", "billsemail@hisdomain.com", 70));
        String actual = addressBook.getOwner().getFirstName();
        System.out.println(actual);
    }

    @Test
    public void testGetAllPeople() {
        AddressBook addressBook = new AddressBook();
        addressBook.addPerson(new Person("Bill", "Murray", "billsemail@hisdomain.com", 70));
        addressBook.addPerson(new Person("William", "Murrayman", "willsemail@hisdomain.com", 7));
        List<Person> people = addressBook.getAllPeople();
        int expected = 2;
        int actual = people.size();
        Assert.assertEquals(expected, actual);
    }
}
