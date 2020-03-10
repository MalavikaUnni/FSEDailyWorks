package com.cts.project.stockpriceservice;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public interface StockPriceService {
	
	
	public List<StockPrice> getAllStockPrices();
	public StockPrice getStockPriceById(int id);
	public StockPrice saveStockPrice(StockPrice stockPrice);
	public void deleteStockPrice(int id);
	public StockPrice updateStockPrice(StockPrice stockPrice);
	public ImportSummary addStockPricesFromExcelSheet(MultipartFile file) throws Exception;

}
