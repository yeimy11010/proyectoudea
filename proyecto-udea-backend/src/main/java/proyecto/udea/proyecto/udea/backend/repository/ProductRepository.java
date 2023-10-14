package proyecto.udea.proyecto.udea.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.udea.proyecto.udea.backend.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {



}
