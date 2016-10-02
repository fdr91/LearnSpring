package com.mkyong.stock.dao;

import com.mkyong.stock.model.Stock;

/**
 * Created by Fedor on 9/29/2016.
 */
public interface StockDao {
    void save(Stock stock);
    void update(Stock stock);
    void delete(Stock stock);
    Stock findByStockCode(String stockCode);
}