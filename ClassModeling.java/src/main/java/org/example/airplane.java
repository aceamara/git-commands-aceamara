package org.example;

public class airplane {

    private String planeNumber = "";
    private double flightDeparture= 0;
    private double flightArrival=0;
    private String flightOrigin= "";
    private String flightDestination="";

    public airplane(String planeNumber,double flightDeparture,double flightArrival,String flightOrigin,String flightDestination){

        this.planeNumber=planeNumber;
        this.flightDeparture=flightDeparture;
        this.flightArrival=flightArrival;
        this.flightOrigin=flightOrigin;
        this.flightDestination=flightDestination;
    }

    public String getPlaneNumber(){
        return planeNumber;

    }

    public double getFlightDeparture(){
        return flightDeparture;
    }

    public double getFlightArrival(){
        return flightArrival;
    }

    public String getFlightOrigin(){
        return flightOrigin;
    }

   public String getFlightDestination(){
        return flightDestination;
   }



}

