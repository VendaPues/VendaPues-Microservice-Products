package ieti.project.product.model;

import ieti.project.product.dto.ProductDto;
import lombok.*;
import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Product extends BaseEntity  {

    private String productName;
    private String description;
    private Double price;
    private Double salesPrice;
    private int stock;
    private Double tax;
    private String imageUrl;


    public Product(ProductDto productDto) {
        this.productName = productDto.getProductName();
        this.description = productDto.getDescription();
        this.salesPrice = productDto.getSalesPrice();
        this.price = productDto.getPrice();
        this.stock = productDto.getStock();
        this.tax = productDto.getTax();
        this.imageUrl = productDto.getImageUrl();

    }

    public void setProductDto(ProductDto productDto) {
        this.productName = productDto.getProductName();
        this.description = productDto.getDescription();
        this.price = productDto.getPrice();
        this.salesPrice = productDto.getSalesPrice();
        this.stock = productDto.getStock();
        this.tax = productDto.getTax();
        this.imageUrl = productDto.getImageUrl();
    }
}
