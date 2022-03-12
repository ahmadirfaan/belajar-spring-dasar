package ahmadirfaanhibatullah.spring.core.service;



import ahmadirfaanhibatullah.spring.core.repository.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;
/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: ProductService.java, v 0.1 2022‐03‐13 04.47 Ahmad Irfaan Hibatullah Exp $$
 */
@Component
@AllArgsConstructor
public class ProductService {

    @Getter
    private ProductRepository productRepository;

//    public ProductService(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }

    //jika terdapat dua constructor maka harus menggunakan annotasi autowired untuk spring dapat mengetahui
    //default constructor mana

    //   @Autowired
    //    public ProductService(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }

    //    public ProductService(ProductRepository productRepository, String name) {
//        this.productRepository = productRepository;
//    }
}