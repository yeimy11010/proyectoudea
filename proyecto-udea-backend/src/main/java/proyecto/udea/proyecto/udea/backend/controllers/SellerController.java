package proyecto.udea.proyecto.udea.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.udea.proyecto.udea.backend.entity.Seller;
import proyecto.udea.proyecto.udea.backend.service.SellerService;

import java.util.List;

@RestController
public class SellerController {


    @Autowired
    private SellerService sellerService;

    @PostMapping("/addSeller")
    public Seller saveSeller(@RequestBody Seller seller) {
        return sellerService.saveSeller(seller);
    }

    @GetMapping("/sellers")
    public List<Seller> findAllSellers() {
        return sellerService.getSellers();
    }

    @PostMapping("/addSellers")
    public List<Seller> saveSellers (@RequestBody List<Seller> sellers) {
        return sellerService.saveSellers(sellers);
    }

    @PutMapping("/updateSeller")
    public Seller updateSeller(@RequestBody Seller seller) {
        return sellerService.updateSeller(seller);
    }

    @GetMapping("/seller/{id}" )
    public Seller findByID(@PathVariable Integer id) {
        return sellerService.getSellerById(id);
    }

    @DeleteMapping("/deleteSeller/{id}")
    public String deleteSeller(@PathVariable Integer id) {
        return sellerService.deleteSeller(id);
    }


}
