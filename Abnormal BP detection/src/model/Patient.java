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
public class Patient extends Person{
      
    private int bloodPressure;       

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public boolean isNormal(int age, int bloodPressure) {
        boolean val;
        
        if(age > 0 && age <= 17) {
            val = kids(bloodPressure);
        }else if(age >= 18 && age <= 45) {
            val = MidAge(bloodPressure);
        }else if(age >= 46 && age <= 110) {
            val = Seniors(bloodPressure);
        }
        else {
            val = false;
        }
        return val;
    }
    
    private boolean kids(int bloodPressure) {
        boolean result;
        
        if (bloodPressure >= 50 && bloodPressure <= 70) {
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    private boolean MidAge(int bloodPressure) {
        boolean result;
        
        if(bloodPressure >= 80 && bloodPressure <= 120){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    private boolean Seniors(int bloodPressure) {
        boolean result;
        
        if (bloodPressure >= 76 && bloodPressure <= 143) {
            result = true;
        }else{
            result = false;
        }
        return result;
    }


}   
