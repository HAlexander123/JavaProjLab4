public class Main {
    public static void main(String[] args) {
        Car car = new Car("Golf", "Volkswagen", 2022, 25000.0, "blue", 5);

        System.out.println(car.toString());

        car.sell();

        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        car.setColor("red");
        car.setPrice(23500.0);
        car.setYear(2023);

        System.out.println(car.toString());
    }
}