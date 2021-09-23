package ieti.project.product;

import ieti.project.product.controller.ProductController;
import ieti.project.product.model.Product;
import ieti.project.product.repository.ProductDocument;
import ieti.project.product.service.IProductService;
import ieti.project.product.service.ProductServiceException;
import ieti.project.product.service.impl.ProductServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.stubbing.OngoingStubbing;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.mockito.Mockito.mock;


class ProductServiceTest {

    @Test
    public void productDocumentSetAndGetNameProductFuncionalOK() throws ProductServiceException {
        ProductDocument productDocument = new ProductDocument();
        productDocument.setProductName("Empanada");
        String productName = productDocument.getProductName();
        Assert.assertEquals(productName,"Empanada");
    }

}
