package org.example;

public class house2 {

    //variables
    private int roomNum = 0;
    private String houseColour = "";
    private double houseHeight = 0;
    private int houseLevels = 0;
    private double houseWidth = 0;

    public house2(int roomNum, String houseColour, double houseHeight, int houseLevels, double houseWidth) {

        this.roomNum = roomNum;
        this.houseColour = houseColour;
        this.houseHeight = houseHeight;
        this.houseLevels = houseLevels;
        this.houseWidth = houseWidth;

    }

    public int getRoomNum() {
        return roomNum;

    }

    public  String getHouseColour() {
        return houseColour;
    }

    public double getHouseHeight() {
        return houseHeight;
    }

    public double getHouseWidth() {
        return houseWidth;
    }

    public void setHouseColour(String houseColour){
    this.houseColour=houseColour;

}




}
