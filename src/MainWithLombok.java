public class MainWithLombok {
    public static void main(String[] args) {
        CarWithLombok car1 = new CarWithLombok("Golf", "Volkswagen", 2022, 25000.0, "blue", 5);

        System.out.println(car1);

        System.out.println("Model: " + car1.getModel());
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Price: " + car1.getPrice());
        System.out.println("Color: " + car1.getColor());
        System.out.println("Quantity: " + car1.getQuantity());

        car1.setColor("red");
        car1.setPrice(23500.0);
        car1.setYear(2023);

        System.out.println(car1);

        CarWithLombok car2 = new CarWithLombok("Golf", "Volkswagen", 2023, 23500.0, "red", 5);

        System.out.println(car2);
        System.out.println("car1 == car2: " + (car1 == car2));
        System.out.println("car1.equals(car2): " + car1.equals(car2));
        System.out.println("car1.hashCode(): " + car1.hashCode());
        System.out.println("car2.hashCode(): " + car2.hashCode());
    }
}