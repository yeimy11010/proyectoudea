package proyecto.udea.proyecto.udea.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;
import proyecto.udea.proyecto.udea.backend.entity.Seller;
import proyecto.udea.proyecto.udea.backend.service.SellerService;

import java.util.List;

@RestController
public class SellerController {


    @Autowired
    private SellerService sellerService;

    @PostMapping("/addSeller")
    public RedirectView saveStudent(@ModelAttribute Seller seller, Model model) {
        model.addAttribute(seller);
        sellerService.saveSeller(seller);
        return new RedirectView("/sellers");
    }

    /*
    @GetMapping("/sellers")
    public List<Seller> findAllSellers() {
        return sellerService.getSellers();
    }*/

    @PostMapping("/addSellers")
    public List<Seller> saveSellers (@RequestBody List<Seller> sellers) {
        return sellerService.saveSellers(sellers);
    }

    @PostMapping("/seller/update")
    public RedirectView updateStudent(@ModelAttribute Seller seller) {
        sellerService.updateSeller(seller);
        return new RedirectView("/sellers");
    }

    @PostMapping("/seller/delete/{id}")
    public RedirectView deleteSeller(@PathVariable Integer id){
        sellerService.deleteSeller(id);
        return new RedirectView("/sellers");
    }

    @GetMapping("/seller/{id}" )
    public Seller findByID(@PathVariable Integer id) {
        return sellerService.getSellerById(id);
    }


}
