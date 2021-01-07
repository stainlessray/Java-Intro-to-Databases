package com.codedifferently.database;

import com.codedifferently.Main;
import com.codedifferently.Person;

import java.sql.*;
import java.util.UUID;
import java.util.logging.Logger;

public class DataBase {
    private static final Logger logger = Logger.getGlobal();
    private Connection connection = null;

    private void getConnection() throws DataBaseConnectionException {
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/addressbook?createDatabaseIfNotExist=true&useSSL=false", "ray", "realPassword");
            connection.setAutoCommit(false);
            logger.info("Successful Connection");
        }catch (Exception e) {
            logger.warning(e.getMessage());
            throw new DataBaseConnectionException();
        }
    }

    public DataBase() throws DataBaseConnectionException {
        getConnection();
    }

    //INSERT INTO PERSON (id, first_name, last_name, email, age) VALUES ('1xnhytrghuytf', 'ray', 'cool', 'email@address', 47)

    public void insertNewPerson(Person person) throws DataBaseConnectionException{
        try{

            String insertCommand = "INSERT INTO PERSON VALUES ( '%s', '%s', '%s', '%s', %d)";
            Statement statement = connection.createStatement();
            statement.executeUpdate(String.format(insertCommand, person.getId(), person.getFirstName(), person.getLastName(), person.getEmail(), person.getAge()));
            connection.commit();

        }catch (Exception e) {
            logger.warning(e.getMessage());
            throw new DataBaseConnectionException();
        }
    }
}




