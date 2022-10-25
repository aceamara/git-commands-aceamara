package org.example;

public class house {

    private int houseNum = 0;
    private String streetName = "";
    private String suburb = "";




    public house(int houseNum, String streetName, String suburb) {

        this.houseNum = houseNum;
        this.streetName = streetName;
        this.suburb = suburb;

    }

public int getHouseNum() {
    return houseNum;

}

public String getStreetName() {
        return streetName;
    }

    public String getSuburb() {
        return suburb;
    }

public void setStreetName(String streetName){
        this.streetName=streetName;
}

public void setHouseNum(int houseNum){
        this.houseNum= houseNum;
}

public void setSuburb(String suburb) {
        this.suburb=suburb;
}



}