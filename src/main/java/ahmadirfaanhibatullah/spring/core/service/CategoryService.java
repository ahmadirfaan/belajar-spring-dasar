package ahmadirfaanhibatullah.spring.core.service;

import ahmadirfaanhibatullah.spring.core.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: CategoryService.java, v 0.1 2022‐03‐13 05.00 Ahmad Irfaan Hibatullah Exp $$
 */
@Component
public class CategoryService {

    private CategoryRepository categoryRepository;

    /**
     * Setter method for property categoryRepository.
     *
     * @param categoryRepository value to be assigned to property categoryRepository
     */
    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    /**
     * Getter method for property categoryRepository.
     *
     * @return property value of categoryRepository
     */
    public CategoryRepository getCategoryRepository() {
        return categoryRepository;
    }
}