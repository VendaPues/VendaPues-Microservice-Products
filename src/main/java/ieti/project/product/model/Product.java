package ieti.project.product.model;

import ieti.project.product.dto.ProductDto;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Product {

    @Id
    private int id;
    private String productName;
    private String description;
    private Double price;
    private int stock;
    private Date createdAt;

    public Product(ProductDto productDto, int id, Date createdAt) {
        this.id = id;
        this.productName = productDto.getProductName();
        this.description = productDto.getDescription();
        this.price = productDto.getPrice();
        this.stock = productDto.getStock();
        this.createdAt = createdAt;
    }

    public void setProductDto(ProductDto productDto) {
        this.productName = productDto.getProductName();
        this.description = productDto.getDescription();
        this.price = productDto.getPrice();
        this.stock = productDto.getStock();

    }
}
