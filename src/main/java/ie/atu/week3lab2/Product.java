package ie.atu.week3lab2;

import com.sun.jdi.DoubleValue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {

    @NotBlank(message = "Name can not be blank!")
    private String productName;

    @NotNull(message = "Price must not be null!")
    @Positive(message = "Price must be positive!")
    private double price;

}
