package ieti.project.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface ProductRepository extends MongoRepository<ProductDocument, String> {

    List<ProductDocument> findUsersByNameLikeOrLastNameLike(String name, String lastName);

    List<ProductDocument> findUsersByCreatedAtAfter(Date startDate);

}
