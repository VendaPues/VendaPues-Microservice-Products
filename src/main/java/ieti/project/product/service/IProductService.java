package ieti.project.product.service;

import ieti.project.product.dto.ProductDto;
import ieti.project.product.repository.ProductDocument;

import java.util.List;

public interface IProductService<T> {
    T create(ProductDto productDto) throws ProductServiceException;

    T findById( String id) throws ProductServiceException;

    List<T> all() throws ProductServiceException;

    boolean deleteById(String id) throws ProductServiceException;

    ProductDocument update(ProductDto productDto, String id) throws ProductServiceException;

    boolean insertProductInList(int idProduct, int idUser);
}
