package org.example;

public class person {
    private String name;
    private int age;
    private String favColour;

    public void setName(String name){
    this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public void setFavColour(String favColour){
        this.favColour=favColour;
    }

    public String getFavColour() {
        return favColour;
    }
}
