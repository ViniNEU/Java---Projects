/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author Vini
 */
public class Person {
    
    String name;
    int medicalRecordNo;
    int age;
    String address;
    String city;
    String community;
    String Gender;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    
    
     public int getMedicalRecordNo() {
        return medicalRecordNo;
    }

    public void setMedicalRecordNo(int medicalRecordNo) {
        this.medicalRecordNo = medicalRecordNo;
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}
