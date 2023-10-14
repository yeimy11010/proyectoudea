package proyecto.udea.proyecto.udea.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sellers")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Long numIdentity;
    @Column
    private String name;
    @Column
    private String city;
    @Column
    private String address;
    @Column
    private Long phone;
    @Column
    private String email;


    public Integer getId() {
        return id;
    }

    public Long getNumIdentity() {
        return numIdentity;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getAddress() {
        return address;
    }

    public Long getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumIdentity(Long numIdentity) {
        this.numIdentity = numIdentity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
