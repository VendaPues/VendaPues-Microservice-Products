package ieti.project.product.dto;


import ieti.project.product.model.BaseEntity;
import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Builder
public class ProductDto extends BaseEntity implements Serializable {

    private String productName;
    private String description;
    private Double price;
    private Double salesPrice;
    private int stock;
    private Double tax;
    private String imageUrl;



}
