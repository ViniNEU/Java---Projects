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
public class CarHistory {
    private ArrayList<CarDetails> history;
     private ArrayList<CarDetails> templist;
    public CarHistory(){
        history = new ArrayList<CarDetails>();
       templist=new ArrayList<CarDetails>();
    }

    public ArrayList<CarDetails> getTemplist() {
        return templist;
    }

    public void setTemplist(ArrayList<CarDetails> templist) {
        this.templist = templist;
    }

    public ArrayList<CarDetails> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<CarDetails> history) {
        this.history = history;
    }
    public CarDetails addViewDetails(){
        CarDetails newDetails  = new CarDetails();
        history.add(newDetails);
        return newDetails;
    }
    
     public void deleteCar(CarDetails cd){
        history.remove(cd);
    }
     
     public void addNewCar(CarDetails cd){
        history.remove(cd);
    }
}
