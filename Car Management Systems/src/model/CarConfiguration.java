/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.ArrayList;
import java.util.List;

 

/**
 *
 * @author Dell
 */
public class CarConfiguration {

 

    private ArrayList<CarDetails> history;
    private ArrayList<CarDetails> templist;
    
    public CarConfiguration(){
        this.history = new ArrayList<CarDetails>();
        
        
        CarDetails carDetails1 = new CarDetails ("a","YES", "tata", "2001", 5, 1, "California","Available");
        CarDetails carDetails2 = new CarDetails ("b", "YES", "tata", "2002", 4, 2, "Boston","Available");
        CarDetails carDetails3 = new CarDetails ("AUDI", "YES", "tata", "2003", 6, 3, "NEW YORK", "Available");
        CarDetails carDetails4 = new CarDetails ("TOYOTA", "YES", "BMW", "2004", 5, 4, "ARLINGTON", "Available");
        CarDetails carDetails5 = new CarDetails ("TATA", "YES", "BMW", "2005", 6, 5, "WORCESTER", "Booked");
        CarDetails carDetails6 = new CarDetails ("SUZUKI", "NO", "BMW", "2006", 7, 6,"PUNE", "Booked");
        CarDetails carDetails7 = new CarDetails ("MAHINDRA", "NO", "audi", "2007", 8, 7, "MUMBAI","Available");
        CarDetails carDetails8 = new CarDetails ("MAHINDRA", "NO", "AUDI", "2008", 5, 8, "MUMBAI", "Booked");
        CarDetails carDetails9 = new CarDetails ("IMPALA", "NO", "AUDI", "2009", 4, 9, "DALLAS","Available");
        CarDetails carDetails10 = new CarDetails ("TESLA", "NO", "SUZUKI", "2010", 5, 10, "MUMBAI", "Booked");
        CarDetails carDetails11= new CarDetails ("MAXX", "NO", "SUZUKI", "2011", 6, 11, "MUMBAI", "Available");
        CarDetails carDetails12 = new CarDetails ("BMW", "NO", "SUZUKI", "2012", 7, 12, "MUMBAI", "Booked");
        CarDetails carDetails13 = new CarDetails ("AUDI", "NO", "SUZUKI", "2016", 4, 13, "MUMBAI", "Available");
        
        
        
        history.add(carDetails1);
        history.add(carDetails2);
        history.add(carDetails3);
        history.add(carDetails4);
        history.add(carDetails5);
        history.add(carDetails6);
        history.add(carDetails7);
        history.add(carDetails8);
        history.add(carDetails9);
        history.add(carDetails10);
        history.add(carDetails11);
        history.add(carDetails12);
        history.add(carDetails13);
               
    }
    
    public ArrayList<CarDetails> getHistory() {
        return history;
    }

 

    public void setUberList(ArrayList<CarDetails> history) {
        this.history = history;
    }
    
    public CarDetails addUber()
    {
        CarDetails carDetails = new CarDetails();
        history.add(carDetails);
        return carDetails;
    }
    
    public void deleteUber (CarDetails carDetails)
    {
        history.remove(carDetails);
    }
    public ArrayList<CarDetails>searchCarName(String carName ){
        templist = new ArrayList<CarDetails>();
        for(CarDetails carDetails : history){
            if (carDetails.getCarName().equalsIgnoreCase(carName)){
                templist.add(carDetails);
            }
        }
        return templist;
        
    }

     public ArrayList<CarDetails>searchmanufacturedDate (String manufacturedDate, ArrayList<CarDetails> result){
        templist = new ArrayList<CarDetails>();
        for(CarDetails carDetails : result){
            if (carDetails.getManufacturedDate().equalsIgnoreCase(manufacturedDate))
                    {
                templist.add(carDetails);
            }
        }
        return templist;
    }
     
     public ArrayList<CarDetails>searchSeatsAvail (int maxSeats, ArrayList<CarDetails> result){
        templist = new ArrayList<CarDetails>();
       
        for (CarDetails carDetails : result) {
           if (carDetails.getMaxSeats()== Integer.valueOf(maxSeats))
           {
               templist.add(carDetails);
           }
       
       }
        return templist;
    }
     
    

 

      public ArrayList<CarDetails>searchSerialNumber (int serialNo, ArrayList<CarDetails> result){
        templist = new ArrayList<CarDetails>();
        for(CarDetails carDetails : result){
            if (carDetails.getSerialNo()== Integer.valueOf(serialNo))
                    {
                templist.add(carDetails);
            }
        }
        return templist;
    }
      
        
}