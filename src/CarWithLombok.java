import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class CarWithLombok {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;
}