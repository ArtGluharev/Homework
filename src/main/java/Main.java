import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var suzuki = new Suzuki("Suzuki","Manual","Green","Japan",5,1999);
        System.out.println(suzuki.getModel() + " " + " - " + suzuki.getColor());

        var volvo = new Volvo("","","","",3,2007,"");
        volvo.setColor("Black");
        System.out.println("Цвет вольво: " + " " + volvo.getColor());
        volvo.setBodyType("Sedan");
        System.out.println("Тип кузова вольво: " + " " + volvo.getBodyType());

        var toyota = new Toyota("","","","",5,2001,5);
        toyota.setColor("Green");
        toyota.setModel("Toyota");
        System.out.println("Цвет Тайоты: " + " " + toyota.getColor());

        List<Car> checkreleaseCars = new ArrayList<>();
        checkreleaseCars.add(suzuki);
        checkreleaseCars.add(volvo);
        checkreleaseCars.add(toyota);
        for (Car car: checkreleaseCars){
            if (car.getReleaseDate() < 2006){
                System.out.println("Ваш автомобиль" + " " + car.getModel() + " " + car.getReleaseDate() + " " + "года" + " " + "- устарел");
            }

            String valueColor = "Green";

            if (car.getColor() == valueColor){
                car.setColor("Red");
            }
            System.out.println(car.getModel() + " " + car.getColor());
        }


            ///a sadasdasd
    }

}

