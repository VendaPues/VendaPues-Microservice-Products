package ieti.project.product.controller;

import ieti.project.product.dto.ProductDto;
import ieti.project.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    IProductService productService;



    @GetMapping
    public ResponseEntity<?> all(){
        try {
            return new ResponseEntity<>(productService.all(), HttpStatus.ACCEPTED);
        }catch (Exception e){
            return new ResponseEntity<>("Not Found", HttpStatus.NOT_FOUND);
        }

    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById (@PathVariable String id){
        try {
            return new ResponseEntity<>(productService.findById(id), HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>("Product with id: "+ id + "not found.", HttpStatus.NOT_FOUND);
        }

    }

    @PostMapping
    public ResponseEntity<?> create (@RequestBody  ProductDto productDto){
        try {
            productService.create(productDto);
            return new ResponseEntity<>("Product "+ productDto.getProductName()+"create", HttpStatus.CREATED);
        }catch (Exception e) {
            return new ResponseEntity<>("Product nor created", HttpStatus.CONFLICT);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable String id, @RequestBody ProductDto productDto){
        try {
            productService.update(productDto, id);
            return new ResponseEntity<>("Product " + productDto.getId() + " update.", HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>("Product with id " + productDto.getId()+ " not found.", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> DeleteById(@PathVariable String id) {
        try {
            productService.findById(id);
            productService.deleteById(id);

            return new ResponseEntity<>("Product with id" + id + " delete.", HttpStatus.ACCEPTED);
        } catch (Exception e) {
            return new ResponseEntity<>("Product with id" + id + " not found.", HttpStatus.NOT_FOUND);
        }

    }

}
