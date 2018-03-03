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

import java.util.ArrayList;

/**
 *
 * @author osiel
 */
public class ParkingTicketCitationSystem_Model {
    ArrayList<ParkingTicketCitationSystem> citationDB = new ArrayList<>();
    ParkingTicketCitationSystem currentCitation = new ParkingTicketCitationSystem();
    
    public void setCurrentUser(ParkingTicketCitationSystem currentCitation)
    {
        this.currentCitation = currentCitation;
        citationDB.add(currentCitation);
    }
    
    public ParkingTicketCitationSystem getCurrentUser()
    {
        return currentCitation;
    }
    
    
}
