package Array;



class Car{
    String colour;
    String Name;
    int price;
}

public class CarClass {
    public static void main(String[] args) {
        Car C1 = new Car();
        C1.colour = "Red";
        C1.Name = "Audi";
        C1.price = 4500000;

        Car C2 = new Car();
        C2.colour = "Black";
        C2.Name = "BMW";
        C2.price = 4000000;

        Car C3 = new Car();
        C3.colour = "White";
        C3.Name = "Fortuner";
        C3.price = 5500000;

        Car C4 = new Car();
        C4.colour = "navy Blue";
        C4.Name = "mercedes";
        C4.price = 6500000;
        Car[] cars = new Car[4];

        cars[0] = C1;
        cars[1] = C2;
        cars[2] = C3;
        cars[3] = C4;
        //for (Car : cars) {
        for ( Car car : cars) {
            System.out.println(car.colour + " - " + car.Name + " : " + car.price);
        }


    }
}
