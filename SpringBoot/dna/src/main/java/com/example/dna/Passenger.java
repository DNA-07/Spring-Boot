package com.example.dna;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Passenger
{
    @Id
    int passengerId;
    String passengerName;
    String startingpoint;
    String destination;
    String mblno;
    public Passenger(){

    }
    public Passenger(int passengerId, String passengerName, String startingpoint, String destination, String mblno)
    {
        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.startingpoint = startingpoint;
        this.destination = destination;
        this.mblno = mblno;
    }
    public int getPassengerId() {
        return passengerId;
    }
    public void setPassengerId(int passengerId) {
        this.passengerId = passengerId;
    }
    public String getPassengerName() {
        return passengerName;
    }
    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
    public String getstartingpoint() {
        return startingpoint;
    }
    public void setstartingpoint(String startingpoint) {
        this.startingpoint = startingpoint;
    }
    public String getdestination() {
        return destination;
    }
    public void setdestination(String destination) {
        this.destination = destination;
    }
    public String getmblno() {
        return mblno;
    }
    public void setmblno(String mblno) {
        this.mblno = mblno;
    }
}

