package ie.atu.week6;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    private ProductService myProduct;

    public ProductController(ProductService myProduct) {
        this.myProduct = myProduct;
    }

    @PostMapping("/newProduct")
    public List<Product> newProduct(@Valid @RequestBody Product product)
    {
        //business logic to add this to a database
        //return list of all products from the database
        return myProduct.addProduct(product);
    }
    @GetMapping("/getProducts")
    public List<Product>getProducts(Product product){
        return myProduct.getProduct(product);
    }

    @PutMapping("/putProduct")
    public List<Product> putProduct(@Valid @RequestBody Product product) {
        return myProduct.putProduct(product);
    }

    @PutMapping("/deleteProduct/")
    public List<Product> deleteProduct(@Valid @RequestBody Product product) {
        return myProduct.deleteProduct(product);
    }
}
