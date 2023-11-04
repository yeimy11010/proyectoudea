package proyecto.udea.proyecto.udea.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import proyecto.udea.proyecto.udea.backend.entity.Product;
import proyecto.udea.proyecto.udea.backend.entity.Seller;
import proyecto.udea.proyecto.udea.backend.service.ProductService;
import proyecto.udea.proyecto.udea.backend.service.SellerService;

import java.util.List;

@Controller
public class FrontController {

    @Autowired
    SellerService sellerService;

    @Autowired
    ProductService productService;

    @GetMapping("/sellers")
    public String seller(Model model) {
        List<Seller> sellers = sellerService.getSellers();
        model.addAttribute("sellers", sellers);
        return "seller";
    }

    @GetMapping("/seller/newSeller")
    public String newSeller(Model model){
        model.addAttribute("sellers", new Seller());
        return "newSeller";
    }

    @GetMapping("/seller/edit/{id}")
    public String editSeller(@PathVariable Integer id, Model model) {
        Seller seller = sellerService.getSellerById(id);
        if (seller != null) {
            model.addAttribute("seller", seller);
            return "editSeller";
        } else {
            return "redirect:/sellers";
        }
    }

    @GetMapping("/seller/{id}/products")
    public String productsBySeller(@PathVariable Integer id, Model modelp, Model models) {
        List<Product> products = productService.getProductsBySellerId(id);
        modelp.addAttribute("products", products);
        Seller seller = sellerService.getSellerById(id);
        models.addAttribute("seller", seller);
        return "product";
    }

    @GetMapping("/seller/{id}/products/newProduct")
    public String newProduct(@PathVariable Integer id, Model modelp, Model models){
        modelp.addAttribute("products", new Product());
        Seller seller = sellerService.getSellerById(id);
        models.addAttribute("seller", seller);
        return "newProduct";
    }

    @GetMapping("/product/edit/{id}")
    public String editProduct(@PathVariable Integer id, Model model) {
        Product product = productService.getProductById(id);
        if (product != null) {
            model.addAttribute("product", product);
            return "editProduct";
        } else {
            return "redirect:/sellers";
        }
    }

}
