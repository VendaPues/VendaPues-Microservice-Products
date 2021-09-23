package ieti.project.product;

import ieti.project.product.dto.ProductDto;
import ieti.project.product.model.Product;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    void AllGetterAndSetterAreGood(){
        Product product = new Product();
        product.setProductName("empanada");
        product.setPrice(5.0);
        product.setDescription("Deliciosas empanadas de carne");
        product.setSalesPrice(8.0);
        product.setStock(8);


        Assert.assertEquals(product.getProductName(),"empanada");
        Assert.assertEquals(product.getDescription(),"Deliciosas empanadas de carne");
        Assert.assertEquals(product.getSalesPrice(),8,0);
        Assert.assertEquals(product.getPrice(),5,0);
        Assert.assertEquals(product.getStock(),8);

    }
}
