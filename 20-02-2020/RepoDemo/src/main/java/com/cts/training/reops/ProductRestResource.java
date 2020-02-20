package com.cts.training.reops;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cts.training.model.Product;

@RepositoryRestResource(path = "products", collectionResourceRel = "products")
public interface ProductRestResource extends PagingAndSortingRepository<Product, Integer> {

	List<Product> findByDescription(@Param("ds") String ds);
}
