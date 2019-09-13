package com.product.bean;

/**
*This is the class to add/modify/delete product data
*
* @author Nithya
* @version 1.0
* @since   2019-09-08
*/

import java.util.ArrayList;
import java.util.List;

public class ProductDataInsertion {
	
	 private List<Product> productDataRecords;
	    private static ProductDataInsertion dataIns = null;
	    private ProductDataInsertion(){
	    	productDataRecords = new ArrayList<Product>();
	    }
	    
	   
	  public static ProductDataInsertion getInstance() {
	        if(dataIns == null) {
	        	dataIns = new ProductDataInsertion();
	              return dataIns;
	            }
	            else {
	                return dataIns;
	            }
	    }
	 public void add(Product prodData) {
	    	productDataRecords.add(prodData);
	    }
	 
	 
	public String upDateProduct(Product prodData) {
	for(int i=0; i<productDataRecords.size(); i++)
	        {
				Product data = productDataRecords.get(i);
	            if(data.getProductID().equals(prodData.getProductID())) {
	            	productDataRecords.set(i, prodData);//update the new record
	              return "Update successful";
	            }
	        }
	return "Update un-successful";
	}
	
	
	public String deleteProductData(String productId) {
	for(int i=0; i<productDataRecords.size(); i++)
	        {
				Product prodData = productDataRecords.get(i);
	            if(prodData.getProductID().equals(productId)){
	            	productDataRecords.remove(i);//update the new record
	              return "Delete successful";
	            }
	        }
	return "Delete un-successful";
	}
	
	
	    public List<Product> getProductRecords() {
	    return productDataRecords;
	    }

}
