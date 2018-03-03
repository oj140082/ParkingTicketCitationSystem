/*
OSIEL JUAREZ
20200710
02/23/2018
CSCI3340
*/


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkingTicketCitationSystem;

/**
 *
 * @author osiel
 */
public class ParkingTicketCitationSystem {

    private String ticketNumber;
    private String licenseNumber;
    private String state;
    private String permitNumber;
    private String vehicleMakeAndModel;
    private String color;
    private String reason;
    private String dateOfViolation;
    private String location;
    private String time;
    private String nameOfIssuer;

    public ParkingTicketCitationSystem() {
    }
    
   

    public ParkingTicketCitationSystem(String ticketNumber, String licenseNumber, 
    String state, String permitNumber, String vehicleMakeAndModel, String color,
    String reason, String dateOfViolation, String location, String time, 
    String nameOfIssuer) {
        this.ticketNumber = ticketNumber;
        this.licenseNumber = licenseNumber;
        this.state = state;
        this.permitNumber = permitNumber;
        this.vehicleMakeAndModel = vehicleMakeAndModel;
        this.color = color;
        this.reason = reason;
        this.dateOfViolation = dateOfViolation;
        this.location = location;
        this.time = time;
        this.nameOfIssuer = nameOfIssuer;
    }
    
        /**
     * @return the ticketNumber
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * @param ticketNumber the ticketNumber to set
     */
    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    /**
     * @return the licenseNumber
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * @param licenseNumber the licenseNumber to set
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the permitNumber
     */
    public String getPermitNumber() {
        return permitNumber;
    }

    /**
     * @param permitNumber the permitNumber to set
     */
    public void setPermitNumber(String permitNumber) {
        this.permitNumber = permitNumber;
    }

    /**
     * @return the vehicleMakeAndModel
     */
    public String getVehicleMakeAndModel() {
        return vehicleMakeAndModel;
    }

    /**
     * @param vehicleMakeAndModel the vehicleMakeAndModel to set
     */
    public void setVehicleMakeAndModel(String vehicleMakeAndModel) {
        this.vehicleMakeAndModel = vehicleMakeAndModel;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the reason
     */
    public String getReason() {
        return reason;
    }

    /**
     * @param reason the reason to set
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * @return the dateOfViolation
     */
    public String getDateOfViolation() {
        return dateOfViolation;
    }

    /**
     * @param dateOfViolation the dateOfViolation to set
     */
    public void setDateOfViolation(String dateOfViolation) {
        this.dateOfViolation = dateOfViolation;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the nameOfIssuer
     */
    public String getNameOfIssuer() {
        return nameOfIssuer;
    }

    /**
     * @param nameOfIssuer the nameOfIssuer to set
     */
    public void setNameOfIssuer(String nameOfIssuer) {
        this.nameOfIssuer = nameOfIssuer;
    }
    
    
    
}

