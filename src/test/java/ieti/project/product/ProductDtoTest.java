package ieti.project.product;

import ieti.project.product.dto.ProductDto;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;

import static org.mockito.Mockito.mock;

@SpringBootTest
public class ProductDtoTest {


    @Test
    void AllGetterAndSetterAreGood(){
        ProductDto productDto = new ProductDto();
        productDto.setProductName("empanada");
        productDto.setPrice(5.0);
        productDto.setDescription("Deliciosas empanadas de carne");
        productDto.setSalesPrice(8.0);
        productDto.setStock(8);


        Assert.assertEquals(productDto.getProductName(),"empanada");
        Assert.assertEquals(productDto.getDescription(),"Deliciosas empanadas de carne");
        Assert.assertEquals(productDto.getSalesPrice(),8,0);
        Assert.assertEquals(productDto.getPrice(),5,0);
        Assert.assertEquals(productDto.getStock(),8);

    }
}
