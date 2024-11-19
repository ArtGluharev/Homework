import java.util.ArrayList;
import java.util.List;

public class Car {
    String model;
    String transmission;
    String color;
    String country;
    int Doors;
    int releaseDate;


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String country() {
        return country;
    }

    public void country(String constructorName) {
        this.country = constructorName;
    }

    public int getDoors() {
        return Doors;
    }

    public void setDoors(int doors) {
        Doors = doors;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Car(String model, String transmission, String color, String country, int Doors, int releaseDate) {
        this.model = model;
        this.transmission = transmission;
        this.color = color;
        this.Doors = Doors;
        this.releaseDate = releaseDate;
        this.country = country;
    }

    public String getCarInfo() {
        return "Автомобиль: " + model + ", " + transmission + ", " + color + ", " + country + ", " + Doors + ", " + releaseDate;
    }

}
