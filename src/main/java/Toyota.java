public class Toyota extends Car{
    int passengers;

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public Toyota(String model, String transmission, String color, String country, int Doors, int releaseDate, int passengers) {
        super(model, transmission, color, country, Doors, releaseDate);
        this.passengers = passengers;
    }

}
