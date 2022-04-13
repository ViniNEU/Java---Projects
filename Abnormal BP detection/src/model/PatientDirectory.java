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
public class PatientDirectory {
    
    private ArrayList<Patient> patients;
    
    public PatientDirectory() {
        this.patients = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList patients) {
        this.patients = patients;
    }           
    
    public Patient addNewPatient() {
        Patient patient = new Patient();
        patients.add(patient);
        return patient;
    }
    
    public void deletePatient(Patient patient) {
        this.patients.remove(patient);
    }
    
    @Override
    public String toString() {
        return "Patients List: " + getPatients();
    }
}
