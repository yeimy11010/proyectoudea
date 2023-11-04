package proyecto.udea.proyecto.udea.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import proyecto.udea.proyecto.udea.backend.entity.Product;
import proyecto.udea.proyecto.udea.backend.entity.Seller;
import proyecto.udea.proyecto.udea.backend.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    /*
    @PostMapping("/addProduct")
    public Product saveProduct(@PathVariable Integer id, @RequestBody Product product) {
        return productService.saveProduct(product);
    }*/

    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return productService.getProducts();
    }

    @PostMapping("/addProduct")
    public RedirectView saveProduct(@ModelAttribute Product product, Model model) {
        model.addAttribute(product);
        productService.saveProduct(product);
        return new RedirectView("/sellers");
    }

    @PostMapping("/product/update")
    public RedirectView updateProduct(@ModelAttribute Product product) {
        productService.updateProduct(product);
        return new RedirectView("/sellers");
    }
    @GetMapping("/product/{id}")
    public Product findById (@PathVariable  Integer id) {
        return productService.getProductById(id);
    }


    @PostMapping("/product/delete/{id}")
    public RedirectView deleteProduct(@PathVariable Integer id){
        productService.deleteProduct(id);
        return new RedirectView("/sellers");
    }
}
