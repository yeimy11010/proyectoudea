package proyecto.udea.proyecto.udea.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyecto.udea.proyecto.udea.backend.entity.Product;
import proyecto.udea.proyecto.udea.backend.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }

    public Product updateProduct(Product product) {
        Product existingProduct = productRepository.findById(product.getId()).orElse(null);
        existingProduct.setQuantityAvailable(product.getQuantityAvailable());
        existingProduct.setQuantitySold(product.getQuantitySold());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setContent(product.getContent());
        existingProduct.setIdSeller(product.getIdSeller());

        return productRepository.save(existingProduct);

    }

    public Product getProductById (Integer id) {
        return productRepository.findById(id).orElse(null);
    }

    public String deleteProduct (Integer id) {

        Product toDelete = productRepository.findById(id).orElse(null);
        String descriptionProduct = toDelete.getDescription();
        productRepository.deleteById(id);

        return "Has eliminado el producto: " + descriptionProduct + " con ID: " + id;
    }

    public List<Product> getProductsBySellerId(Integer id) {
        return productRepository.findProductsByIdSeller(id);
    }

}
