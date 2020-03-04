package com.cts.project.restController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.project.bean.StockPrice;
import com.cts.project.repo.StockPriceRepo;

@CrossOrigin(origins="*")
@RestController
public class StockPriceRestController {
	
	@Autowired
	StockPriceRepo stockPriceRepo;
	
	@GetMapping("/stockPrice")
	public List<StockPrice> getstockPrice() {
		return stockPriceRepo.findAll();
	}

	@GetMapping("/stockPrice/{id}")
	public StockPrice getStockPriceById(@PathVariable int id) {

		Optional<StockPrice> stockPriceList = stockPriceRepo.findById(id);
		StockPrice stockPrice = stockPriceList.get();
		return stockPrice;
		
	}

	@PostMapping("/stockPrice")
	public StockPrice saveStockPrice(@RequestBody StockPrice stockPrice) {
		StockPrice newStockPrice = stockPriceRepo.save(stockPrice);
		return newStockPrice;
	}

	@DeleteMapping("/stockPrice/{id}")
	public void deleteStockPrice(@PathVariable int id) {

		stockPriceRepo.deleteById(id);
	}

	@PutMapping("/stockPrice")
	public StockPrice updateStockPrice(@RequestBody StockPrice stockPrice) {
		StockPrice updateStockPrice = stockPriceRepo.save(stockPrice);
		return updateStockPrice;
	}



}
