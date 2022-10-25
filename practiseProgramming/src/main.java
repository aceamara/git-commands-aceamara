public class Main {
    public static void main(String[] args) {

        Car myCar = new Car();

        System.out.println(myCar.model);
        System.out.println(myCar.make);


}}
//we can put the classes in different files or under the main class,
//it just needs to be outside of the scope of the main class {}
public class car {

    String make= "Chevrolet";
    String model="Corvette";
    int year= 2020;
    String color="Blue";
    double price= 50000.00;

    //defining methods- drive and break
    //this is the actions the object can take

    void drive() {
        System.out.println("You drive the car");

    }
    void brake(){
        System.out.printlln("You step on the break");

    }






}
