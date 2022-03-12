package ahmadirfaanhibatullah.spring.core;

import ahmadirfaanhibatullah.spring.core.data.Bar;
import ahmadirfaanhibatullah.spring.core.data.Foo;
import ahmadirfaanhibatullah.spring.core.data.MultiFoo;
import ahmadirfaanhibatullah.spring.core.repository.CategoryRepository;
import ahmadirfaanhibatullah.spring.core.repository.CustomerRepository;
import ahmadirfaanhibatullah.spring.core.repository.ProductRepository;
import ahmadirfaanhibatullah.spring.core.service.CategoryService;
import ahmadirfaanhibatullah.spring.core.service.CustomerService;
import ahmadirfaanhibatullah.spring.core.service.ProductService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ComponentTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
    }

    @AfterEach
    void tearDown() {
        applicationContext.close();
    }

    @Test
    void testComponentScan() {
        ProductService productService1 = applicationContext.getBean(ProductService.class);
        ProductService productService2 = applicationContext.getBean("productService", ProductService.class);


        assertSame(productService1, productService2);
    }

    @Test
    void testConstructorDependencyInjectionTest() {
        ProductService productService = applicationContext.getBean(ProductService.class);
        ProductRepository productRepository = applicationContext.getBean(ProductRepository.class);

        assertSame(productService.getProductRepository(), productRepository);

    }

    @Test
    void testSetterDependencyInjectionTest() {
        CategoryService categoryService = applicationContext.getBean(CategoryService.class);
        CategoryRepository categoryRepository = applicationContext.getBean(CategoryRepository.class);

        assertSame(categoryService.getCategoryRepository(), categoryRepository);

    }

    @Test
    void testFieldDependencyInjectionTest() {
        CustomerService customerService = applicationContext.getBean(CustomerService.class);
        CustomerRepository normalCustomerRepository = applicationContext.getBean("normalCustomerRepository", CustomerRepository.class);
        CustomerRepository premiumCustomerRepository = applicationContext.getBean("premiumCustomerRepository", CustomerRepository.class);

        assertSame(customerService.getNormalCustomerRepository(), normalCustomerRepository);
        assertSame(customerService.getPremiumCustomerRepository(), premiumCustomerRepository);

    }

    @Test
    void testObjectProvider() {
        MultiFoo multiFoo = applicationContext.getBean(MultiFoo.class);
        assertEquals(3, multiFoo.getFoos().size());

    }
}