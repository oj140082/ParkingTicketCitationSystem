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

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author osiel
 */
public class ParkingTicketCitationSystem_Controller {
    ParkingTicketCitationSystem_Model parkingTicketCitationSystem_Model;
    ParkingTicketCitationSystem_View parkingTicketCitationSystem_View;

    public ParkingTicketCitationSystem_Controller(ParkingTicketCitationSystem_Model
    parkingTicketCitationSystem_Model, ParkingTicketCitationSystem_View parkingTicketCitationSystem_View) {
        this.parkingTicketCitationSystem_Model = parkingTicketCitationSystem_Model;
        this.parkingTicketCitationSystem_View = parkingTicketCitationSystem_View;
        attachHandlers();
    }
    
    public void attachHandlers()
    {
        parkingTicketCitationSystem_View.getSubmitBtn().setOnAction(
            new EventHandler<ActionEvent>()
            {
            @Override
            public void handle(ActionEvent event) 
            {
                String ticketN= parkingTicketCitationSystem_View.getTicketNumberTF().getText();
                String licenseN= parkingTicketCitationSystem_View.getLicenseNumberTF().getText();
                String state= parkingTicketCitationSystem_View.getStateTF().getText();
                String permitN= parkingTicketCitationSystem_View.getPermitNumberTF().getText();
                String vehicleMakeAndModel= parkingTicketCitationSystem_View.getVehicleMakeAndModelTF().getText();
                String color= parkingTicketCitationSystem_View.getColorTF().getText();
                String reason= parkingTicketCitationSystem_View.getReasonTF().getText();
                String dateOfViolation= parkingTicketCitationSystem_View.getDateOfViolationTF().getText();
                String location= parkingTicketCitationSystem_View.getLocationTF().getText();
                String time= parkingTicketCitationSystem_View.getTimeTF().getText();
                String nameOfIssuer= parkingTicketCitationSystem_View.getNameOfIssuerTF().getText();
                
                ParkingTicketCitationSystem currentParkingTicketCitation = new ParkingTicketCitationSystem(ticketN, licenseN, state, permitN, vehicleMakeAndModel,
                color, reason, dateOfViolation, location, time, nameOfIssuer);
                
                parkingTicketCitationSystem_Model.setCurrentUser(currentParkingTicketCitation);
                parkingTicketCitationSystem_View.clearFields();
                
            }
                
                
            }
                
        );
        
            parkingTicketCitationSystem_View.getViewBtn().setOnAction(
            new EventHandler<ActionEvent>()
            {
            @Override
            public void handle(ActionEvent event) 
            {
                //set fields
                
                ParkingTicketCitationSystem currentTicketCitation = parkingTicketCitationSystem_Model.getCurrentUser();
                parkingTicketCitationSystem_View.updateParkingTicketCitationSystem_View(currentTicketCitation);
                
            }
                
                
            }
                
        );
    }
    
    
    
}
