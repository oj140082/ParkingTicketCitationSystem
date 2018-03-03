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

import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

/**
 *
 * @author osiel
 */
public class ParkingTicketCitationSystem_View extends GridPane{
    
    private Label ticketNumberLabel = new Label("Enter Ticket Number:");
    private TextField ticketNumberTF = new TextField();
    
    private Label licenseNumberLabel = new Label("Enter License Number:");
    private TextField licenseNumberTF = new TextField();
    
    private Label stateLabel = new Label("Enter State:");
    private TextField stateTF = new TextField();
    
    private Label permitNumberLabel = new Label("Enter Permit Number:");
    private TextField permitNumberTF = new TextField();
    
    private Label vehicleMakeAndModelLabel = new Label("Enter Vehicle Make And Model:");
    private TextField vehicleMakeAndModelTF = new TextField();
    
    private Label colorLabel = new Label("Enter Color of Vehicle:");
    private TextField colorTF = new TextField();
    
    private Label reasonLabel = new Label("Enter Reason:");
    private TextField reasonTF = new TextField();
    
    private Label dateOfViolationLabel = new Label("Enter Date of Violation:");
    private TextField dateOfViolationTF = new TextField();

    private Label locationLabel = new Label("Enter Location:");
    private TextField locationTF = new TextField();

    private Label timeLabel = new Label("Enter Time (hh:mm) :");
    private TextField timeTF = new TextField();

    private Label nameOfIssuerLabel = new Label("Enter Name of Issuer:");
    private TextField nameOfIssuerTF = new TextField();
    
    private Button submitBtn = new Button("Submit Information");
    
    private Button viewBtn = new Button("View Citations");
    
    public ParkingTicketCitationSystem_View() {
        this.addRow(0, ticketNumberLabel, ticketNumberTF);
        this.addRow(1, licenseNumberLabel, licenseNumberTF);
        this.addRow(2, stateLabel, stateTF);
        this.addRow(3, permitNumberLabel, permitNumberTF);
        this.addRow(4, vehicleMakeAndModelLabel, vehicleMakeAndModelTF);
        this.addRow(5, colorLabel, colorTF);
        this.addRow(6, reasonLabel, reasonTF);
        this.addRow(7, dateOfViolationLabel, dateOfViolationTF);
        this.addRow(8, locationLabel, locationTF);
        this.addRow(9, timeLabel, timeTF);
        this.addRow(10, nameOfIssuerLabel, nameOfIssuerTF);
        this.addRow(11, submitBtn);
        this.addRow(12, viewBtn);
    }
    
    public void updateParkingTicketCitationSystem_View(ParkingTicketCitationSystem currentUser) 
    {
        String ticketN= currentUser.getTicketNumber();
        String licenseN= currentUser.getLicenseNumber();
        String state= currentUser.getState();
        String permitN= currentUser.getPermitNumber();
        String vehicleMakeAndModel= currentUser.getVehicleMakeAndModel();
        String color= currentUser.getColor();
        String reason= currentUser.getReason();
        String dateOfViolation= currentUser.getDateOfViolation();
        String location= currentUser.getLocation();
        String time= currentUser.getTime();
        String nameOfIssuer= currentUser.getNameOfIssuer();
        
        this.getChildren().clear();
        
        this.addRow(0, ticketNumberLabel, ticketNumberTF);
        ticketNumberTF.setText(ticketN);
        this.addRow(1, licenseNumberLabel, licenseNumberTF);
        licenseNumberTF.setText(licenseN);
        this.addRow(2, stateLabel, stateTF);
        stateTF.setText(state);
        this.addRow(3, permitNumberLabel, permitNumberTF);
        permitNumberTF.setText(permitN);
        this.addRow(4, vehicleMakeAndModelLabel, vehicleMakeAndModelTF);
        vehicleMakeAndModelTF.setText(vehicleMakeAndModel);
        this.addRow(5, colorLabel, colorTF);
        colorTF.setText(color);
        this.addRow(6, reasonLabel, reasonTF);
        reasonTF.setText(reason);
        this.addRow(7, dateOfViolationLabel, dateOfViolationTF);
        dateOfViolationTF.setText(dateOfViolation);
        this.addRow(8, locationLabel, locationTF);
        locationTF.setText(location);
        this.addRow(9, timeLabel, timeTF);
        timeTF.setText(time);
        this.addRow(10, nameOfIssuerLabel, nameOfIssuerTF);
        nameOfIssuerTF.setText(nameOfIssuer);
        this.addRow(11, submitBtn);
        this.addRow(12, getViewBtn());
    }
    
    public void clearFields()
    {
        ticketNumberTF.clear();
        licenseNumberTF.clear();
        stateTF.clear();
        permitNumberTF.clear();
        vehicleMakeAndModelTF.clear();
        colorTF.clear();
        reasonTF.clear();
        dateOfViolationTF.clear();
        locationTF.clear();
        timeTF.clear();
        nameOfIssuerTF.clear();
    }
    
    
    /**
     * @return the ticketNumberLabel
     */
    public Label getTicketNumberLabel() {
        return ticketNumberLabel;
    }

    /**
     * @param ticketNumberLabel the ticketNumberLabel to set
     */
    public void setTicketNumberLabel(Label ticketNumberLabel) {
        this.ticketNumberLabel = ticketNumberLabel;
    }

    /**
     * @return the ticketNumberTF
     */
    public TextField getTicketNumberTF() {
        return ticketNumberTF;
    }

    /**
     * @param ticketNumberTF the ticketNumberTF to set
     */
    public void setTicketNumberTF(TextField ticketNumberTF) {
        this.ticketNumberTF = ticketNumberTF;
    }

    /**
     * @return the licenseNumberLabel
     */
    public Label getLicenseNumberLabel() {
        return licenseNumberLabel;
    }

    /**
     * @param licenseNumberLabel the licenseNumberLabel to set
     */
    public void setLicenseNumberLabel(Label licenseNumberLabel) {
        this.licenseNumberLabel = licenseNumberLabel;
    }

    /**
     * @return the licenseNumberTF
     */
    public TextField getLicenseNumberTF() {
        return licenseNumberTF;
    }

    /**
     * @param licenseNumberTF the licenseNumberTF to set
     */
    public void setLicenseNumberTF(TextField licenseNumberTF) {
        this.licenseNumberTF = licenseNumberTF;
    }

    /**
     * @return the stateLabel
     */
    public Label getStateLabel() {
        return stateLabel;
    }

    /**
     * @param stateLabel the stateLabel to set
     */
    public void setStateLabel(Label stateLabel) {
        this.stateLabel = stateLabel;
    }

    /**
     * @return the stateTF
     */
    public TextField getStateTF() {
        return stateTF;
    }

    /**
     * @param stateTF the stateTF to set
     */
    public void setStateTF(TextField stateTF) {
        this.stateTF = stateTF;
    }

    /**
     * @return the permitNumberLabel
     */
    public Label getPermitNumberLabel() {
        return permitNumberLabel;
    }

    /**
     * @param permitNumberLabel the permitNumberLabel to set
     */
    public void setPermitNumberLabel(Label permitNumberLabel) {
        this.permitNumberLabel = permitNumberLabel;
    }

    /**
     * @return the permitNumberTF
     */
    public TextField getPermitNumberTF() {
        return permitNumberTF;
    }

    /**
     * @param permitNumberTF the permitNumberTF to set
     */
    public void setPermitNumberTF(TextField permitNumberTF) {
        this.permitNumberTF = permitNumberTF;
    }

    /**
     * @return the vehicleMakeAndModelLabel
     */
    public Label getVehicleMakeAndModelLabel() {
        return vehicleMakeAndModelLabel;
    }

    /**
     * @param vehicleMakeAndModelLabel the vehicleMakeAndModelLabel to set
     */
    public void setVehicleMakeAndModelLabel(Label vehicleMakeAndModelLabel) {
        this.vehicleMakeAndModelLabel = vehicleMakeAndModelLabel;
    }

    /**
     * @return the vehicleMakeAndModelTF
     */
    public TextField getVehicleMakeAndModelTF() {
        return vehicleMakeAndModelTF;
    }

    /**
     * @param vehicleMakeAndModelTF the vehicleMakeAndModelTF to set
     */
    public void setVehicleMakeAndModelTF(TextField vehicleMakeAndModelTF) {
        this.vehicleMakeAndModelTF = vehicleMakeAndModelTF;
    }

    /**
     * @return the colorLabel
     */
    public Label getColorLabel() {
        return colorLabel;
    }

    /**
     * @param colorLabel the colorLabel to set
     */
    public void setColorLabel(Label colorLabel) {
        this.colorLabel = colorLabel;
    }

    /**
     * @return the colorTF
     */
    public TextField getColorTF() {
        return colorTF;
    }

    /**
     * @param colorTF the colorTF to set
     */
    public void setColorTF(TextField colorTF) {
        this.colorTF = colorTF;
    }

    /**
     * @return the reasonLabel
     */
    public Label getReasonLabel() {
        return reasonLabel;
    }

    /**
     * @param reasonLabel the reasonLabel to set
     */
    public void setReasonLabel(Label reasonLabel) {
        this.reasonLabel = reasonLabel;
    }

    /**
     * @return the reasonTF
     */
    public TextField getReasonTF() {
        return reasonTF;
    }

    /**
     * @param reasonTF the reasonTF to set
     */
    public void setReasonTF(TextField reasonTF) {
        this.reasonTF = reasonTF;
    }

    /**
     * @return the dateOfViolationLabel
     */
    public Label getDateOfViolationLabel() {
        return dateOfViolationLabel;
    }

    /**
     * @param dateOfViolationLabel the dateOfViolationLabel to set
     */
    public void setDateOfViolationLabel(Label dateOfViolationLabel) {
        this.dateOfViolationLabel = dateOfViolationLabel;
    }

    /**
     * @return the dateOfViolationTF
     */
    public TextField getDateOfViolationTF() {
        return dateOfViolationTF;
    }

    /**
     * @param dateOfViolationTF the dateOfViolationTF to set
     */
    public void setDateOfViolationTF(TextField dateOfViolationTF) {
        this.dateOfViolationTF = dateOfViolationTF;
    }

    /**
     * @return the locationLabel
     */
    public Label getLocationLabel() {
        return locationLabel;
    }

    /**
     * @param locationLabel the locationLabel to set
     */
    public void setLocationLabel(Label locationLabel) {
        this.locationLabel = locationLabel;
    }

    /**
     * @return the locationTF
     */
    public TextField getLocationTF() {
        return locationTF;
    }

    /**
     * @param locationTF the locationTF to set
     */
    public void setLocationTF(TextField locationTF) {
        this.locationTF = locationTF;
    }

    /**
     * @return the timeLabel
     */
    public Label getTimeLabel() {
        return timeLabel;
    }

    /**
     * @param timeLabel the timeLabel to set
     */
    public void setTimeLabel(Label timeLabel) {
        this.timeLabel = timeLabel;
    }

    /**
     * @return the timeTF
     */
    public TextField getTimeTF() {
        return timeTF;
    }

    /**
     * @param timeTF the timeTF to set
     */
    public void setTimeTF(TextField timeTF) {
        this.timeTF = timeTF;
    }

    /**
     * @return the nameOfIssuerLabel
     */
    public Label getNameOfIssuerLabel() {
        return nameOfIssuerLabel;
    }

    /**
     * @param nameOfIssuerLabel the nameOfIssuerLabel to set
     */
    public void setNameOfIssuerLabel(Label nameOfIssuerLabel) {
        this.nameOfIssuerLabel = nameOfIssuerLabel;
    }

    /**
     * @return the nameOfIssuerTF
     */
    public TextField getNameOfIssuerTF() {
        return nameOfIssuerTF;
    }

    /**
     * @param nameOfIssuerTF the nameOfIssuerTF to set
     */
    public void setNameOfIssuerTF(TextField nameOfIssuerTF) {
        this.nameOfIssuerTF = nameOfIssuerTF;
    }

    /**
     * @return the submitBtn
     */
    public Button getSubmitBtn() {
        return submitBtn;
    }

    /**
     * @param submitBtn the submitBtn to set
     */
    public void setSubmitBtn(Button submitBtn) {
        this.submitBtn = submitBtn;
    }

    /**
     * @return the viewBtn
     */
    public Button getViewBtn() {
        return viewBtn;
    }

    /**
     * @param viewBtn the viewBtn to set
     */
    public void setViewBtn(Button viewBtn) {
        this.viewBtn = viewBtn;
    }
    
}

