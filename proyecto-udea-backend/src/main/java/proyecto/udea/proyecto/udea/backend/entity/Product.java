package proyecto.udea.proyecto.udea.backend.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(columnDefinition = "DATETIME")
    private java.util.Date updateDate;
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
    @Column
    private int idSeller;


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

    public int getIdSeller() {
        return idSeller;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdSeller(int idSeller) {
        this.idSeller = idSeller;
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
