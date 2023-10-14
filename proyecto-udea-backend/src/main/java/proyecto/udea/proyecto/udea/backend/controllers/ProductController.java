package proyecto.udea.proyecto.udea.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.udea.proyecto.udea.backend.entity.Product;
import proyecto.udea.proyecto.udea.backend.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public Product saveProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return productService.getProducts();
    }

    @PostMapping("/addProducts")
    public List<Product> saveProducts(@RequestBody List<Product> products) {
        return productService.saveProducts(products);
    }

    @PutMapping("/updateProduct")
    public Product updateProduct (@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @GetMapping("/product/{id}")
    public Product findById (@PathVariable  Integer id) {
        return productService.getProductById(id);
    }

    @DeleteMapping ("/deleteProduct/{id}")
    public String deleteProduct (@PathVariable Integer id){
        return productService.deleteProduct(id);
    }


}
