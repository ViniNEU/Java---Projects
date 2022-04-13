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
public class CarDetails {
    
   private String carName;
    private String Certificate;
    private String Manufacturer;
    private String manufacturedDate;
    private int maxSeats;
    private int serialNo;
    private String city;
    private String Avail;
   

    public CarDetails(String carName, String Certificate, String Manufacturer, String manufacturedDate, int maxSeats, int serialNo, String city, String Avail) {
        this.carName = carName;
        this.Certificate = Certificate;
        this.Manufacturer = Manufacturer;
        this.manufacturedDate = manufacturedDate;
        this.maxSeats = maxSeats;
        this.serialNo = serialNo;
        this.city = city;
        this.Avail = Avail;
    }
      CarDetails ()
     {
        
     }
    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCertificate() {
        return Certificate;
    }

    public void setCertificate(String Certificate) {
        this.Certificate = Certificate;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public String getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(String manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAvail() {
        return Avail;
    }

    public void setAvail(String Avail) {
        this.Avail = Avail;
    }

    
    
   @Override
   public String toString(){
       return carName ;
   }
}
