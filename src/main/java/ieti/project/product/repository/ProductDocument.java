package ieti.project.product.repository;

import ieti.project.product.dto.ProductDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.Date;

@Document
@NoArgsConstructor
@Getter
public class ProductDocument {
    @Id
     int id;
    @Indexed(unique = true)
     String productName;
     String description;
     Double price;
     int stock;
     Date createdAt;


    public ProductDocument(ProductDto productDto) {

        this.productName = productDto.getProductName();
        this.description = productDto.getDescription();
        this.price = productDto.getPrice();
        this.stock = productDto.getStock();
        this.createdAt = new Date();
    }

    public void update(ProductDto productDto){
        productName = productDto.getProductName();
        description = productDto.getDescription();
        price = productDto.getPrice();
        stock = productDto.getStock();
    }
}
