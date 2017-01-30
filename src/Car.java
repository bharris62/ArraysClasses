/**
 * Created by BHarris on 1/30/17.
 * 4 wheel car class, no motorcycles in this one.  Takes in various information about the car, and calculates gas mileage
 * for highway rounded to integer.
 */
public class Car {
    private int numberOfWheels;
    private double gasMileageHighway;
    private double gasMileagecity;
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year){
        this.numberOfWheels = 4;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void calculateHighwayMileage(int milesDriven, int tankSize){
        this.gasMileageHighway = milesDriven / tankSize;
    }


    public String toString(){
        return "You Drive a " + this.year + " " + this.brand + " " + this.model + " with " +
                this.gasMileageHighway + " miles to the gallon";
    }


}
