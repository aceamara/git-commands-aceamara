package org.example;

public class airplane2 {

    private String flightName ="";
    private double departureTime=0;
    private double arrivalTime=0;
    private int flightsInProgress=0;

    public airplane2(String flightName, double depatureTime,double arrivalTime, int flightsInProgress){

        this.flightName=flightName;
        this.departureTime=depatureTime;
        this.arrivalTime=arrivalTime;
        this.flightsInProgress=flightsInProgress;

    }

    public String getFlightName(){
        return flightName;
    }

    public double getDepartureTime(){
     return departureTime;
    }

    public double getArrivalTime(){
        return arrivalTime;
    }
    public int getFlightsInProgress(){
        return flightsInProgress;
    }

    public void setDepartureTime(double departureTime){
        this.departureTime= departureTime;
    }

    public void setFlightsInProgress(int flightsInProgress){
        this.flightsInProgress=flightsInProgress;
    }

    public void setFlightName(String flightName) {
        this.flightName=flightName;
    }
   public void setArrivalTime(double arrivalTime){
        this.arrivalTime=arrivalTime;
   }

 }



