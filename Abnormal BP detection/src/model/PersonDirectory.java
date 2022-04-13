/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Vini
 */
public class PersonDirectory {
    
    private ArrayList<Person> persons;
    
    public PersonDirectory() {
        this.persons = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
    
    public void deletePerson(Person person) {
        this.persons.remove(person);
    }
    
    public Person addNewPerson() {
        Person person = new Person();
        persons.add(person);
        return person;
    }
    
}
