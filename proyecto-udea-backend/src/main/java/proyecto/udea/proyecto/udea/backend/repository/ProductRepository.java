package proyecto.udea.proyecto.udea.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.udea.proyecto.udea.backend.entity.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    List<Product> findProductsByIdSeller(Integer idSeller);

}
