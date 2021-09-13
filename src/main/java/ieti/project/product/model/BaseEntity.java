package ieti.project.product.model;

import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;


@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@MappedSuperclass
@ToString
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date createdAt = new Date();

}