package ieti.project.product.repository;

import ieti.project.product.dto.ProductDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;

@Document
@NoArgsConstructor
@Getter
@Setter
public class ProductDocument {
    @Id
    String id;
    @Indexed(unique = true)
    String productName;
    String description;
    Double price;
    Double salesPrice;
    int stock;
    Double tax;
    String imageUrl;
    Date createdAt;


    public ProductDocument(ProductDto productDto) {

        this.productName = productDto.getProductName();
        this.description = productDto.getDescription();
        this.price = productDto.getPrice();
        this.salesPrice = productDto.getSalesPrice();
        this.stock = productDto.getStock();
        this.tax = productDto.getTax();
        this.imageUrl = productDto.getImageUrl();
        this.createdAt = new Date();
    }

    public void update(ProductDto productDto) {
        productName = productDto.getProductName();
        description = productDto.getDescription();
        price = productDto.getPrice();
        salesPrice = productDto.getSalesPrice();
        tax = productDto.getTax();
        imageUrl = productDto.getImageUrl();
        stock = productDto.getStock();
    }
}
