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
public class VitalSigns {
    
    ArrayList<VitalSign> vitalSignsHistory;
    
    public VitalSigns() {
        vitalSignsHistory  = new ArrayList<VitalSign>();
    }

    public ArrayList<VitalSign> getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(ArrayList<VitalSign> vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }         
    
    public VitalSign addNewVitalSigns() {
        VitalSign patient  = new VitalSign();                              
        vitalSignsHistory.add(patient);
        return patient;
    }
}
