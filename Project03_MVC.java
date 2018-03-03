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
package main;

import ParkingTicketCitationSystem.ParkingTicketCitationSystem_Controller;
import ParkingTicketCitationSystem.ParkingTicketCitationSystem_Model;
import ParkingTicketCitationSystem.ParkingTicketCitationSystem_View;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author osiel
 */
public class Project03_MVC extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        ParkingTicketCitationSystem_View root = new ParkingTicketCitationSystem_View();
        ParkingTicketCitationSystem_Model parkingTicketCitationSystem_Model = new ParkingTicketCitationSystem_Model();
        ParkingTicketCitationSystem_Controller parkingTicketCitationSystem_Controller = new ParkingTicketCitationSystem_Controller(parkingTicketCitationSystem_Model, root);
        
        Scene scene = new Scene(root, 700, 600);
        
        primaryStage.setTitle("Parking Ticket Citation System--MVC");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

