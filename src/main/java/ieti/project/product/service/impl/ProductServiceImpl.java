package ieti.project.product.service.impl;

import ieti.project.product.dto.ProductDto;
import ieti.project.product.repository.ProductDocument;
import ieti.project.product.repository.ProductRepository;
import ieti.project.product.service.IProductService;
import ieti.project.product.service.ProductServiceException;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@NoArgsConstructor
@Service
public class ProductServiceImpl implements IProductService<ProductDocument> {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public ProductDocument create(ProductDto productDto) throws ProductServiceException {
        ProductDocument document = new ProductDocument(productDto);
        try {
            return productRepository.save(document);
        }catch (Exception e){
            throw  new ProductServiceException(e.getMessage());
        }
    }

    @Override
    public ProductDocument findById(String id) throws ProductServiceException {
        ProductDocument result = productRepository.findById(id).orElse(null);
        if (result!=null){
            return result;
        }
        throw new ProductServiceException("Product Not Found");
    }

    @Override
    public List<ProductDocument> all() throws ProductServiceException {
        try{
            return (List<ProductDocument>) productRepository.findAll();
        }catch (Exception e){
            throw new ProductServiceException(e.getMessage());
        }
    }

    @Override
    public boolean deleteById(String id) throws ProductServiceException {
        try {
            boolean flag = false;
            ProductDocument result = productRepository.findById(id).orElse(null);
            if (result!= null){
                productRepository.deleteById(id);
                flag = true;
            }
            return flag;
        }catch (Exception e){
            throw new ProductServiceException(e.getMessage());
        }
    }
    @Override
    public ProductDocument update(ProductDto productDto, String id) throws ProductServiceException {
        try {
            ProductDocument result = productRepository.findById(id).orElse(null);
            if (result != null) {
                result.update(productDto);
            }
            return productRepository.save(result);
        } catch (Exception e) {
            throw new ProductServiceException(e.getMessage());
        }
    }


}
