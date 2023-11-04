package proyecto.udea.proyecto.udea.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.udea.proyecto.udea.backend.entity.Seller;
import proyecto.udea.proyecto.udea.backend.repository.SellerRepository;

import java.util.List;

@Service
public class SellerService {

    @Autowired
    private SellerRepository sellerRepository;

    public List<Seller> getSellers() {
        return sellerRepository.findAll();
    }

    public Seller saveSeller(Seller seller) {
        return sellerRepository.save(seller);
    }

    public List<Seller> saveSellers(List<Seller> sellers) {
        return sellerRepository.saveAll(sellers);
    }

    public Seller updateSeller(Seller seller) {

        Seller existingSeller = sellerRepository.findById(seller.getId()).orElse(null);
        existingSeller.setName(seller.getName());
        existingSeller.setNumIdentity(seller.getNumIdentity());
        existingSeller.setCity(seller.getCity());
        existingSeller.setAddress(seller.getAddress());
        existingSeller.setPhone(seller.getPhone());
        existingSeller.setEmail(seller.getEmail());

        return sellerRepository.save(existingSeller);
    }

    public Seller getSellerById(Integer id) {
        return sellerRepository.findById(id).orElse(null);
    }

    public void deleteSeller(Integer id){
        sellerRepository.deleteById(id);
    }


}
