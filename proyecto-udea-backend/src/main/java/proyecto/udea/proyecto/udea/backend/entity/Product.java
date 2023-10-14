package proyecto.udea.proyecto.udea.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private int quantityAvailable;
    @Column
    private String description;
    @Column
    private String content;
    @Column
    private double price;
    @Column
    private int quantitySold;


    public Integer getId() {
        return id;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public String getDescription() {
        return description;
    }

    public String getContent() {
        return content;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }
}
