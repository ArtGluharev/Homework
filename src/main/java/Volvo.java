public class Volvo extends Car{
    String bodyType;
    public Volvo(String model, String transmission, String color, String country, int Doors, int releaseDate, String bodyType) {
        super(model, transmission, color, country, Doors, releaseDate);
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }
}
