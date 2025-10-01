package ie.atu.week3lab2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/product")
@RestController
public class ProductController {

    List<Product> products = new ArrayList<>();


    @GetMapping("/hello")
    public String Hello(){
        return "Hello Customer";
    }


    @GetMapping("/getproducts")
    public List<Product> getProduct(){

        Product myProduct = new Product("Laptop", 1299);
        return products;
    }

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        products.add(product);
        return product;
    }



}
