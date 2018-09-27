package com.ly.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ly.bean.Stock;

@Repository
public class StockDao extends BaseDao {

	public void save(Stock stock) {
		this.getSession().save(stock);
	}

	public Stock getStock(Map<String, String> map) {
		List param = new ArrayList();
		List vals = new ArrayList();
		List spliter = new ArrayList();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			   String key = entry.getKey().toString();
			   String value = entry.getValue().toString();
			  // System.out.println("key=" + key + " value=" + value);
			   param.add(key);
			   vals.add(value);
			   spliter.add("=");
		}
		
		List  stocks = this.queryManyWhere("Stock",param,vals,spliter);
		
		if(stocks!=null&&stocks.size()>0){
			return (Stock) stocks.get(0);
		}else{
			return null;
		}
		
	}

}
