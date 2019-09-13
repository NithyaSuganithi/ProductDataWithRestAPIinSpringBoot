package com.product.controller;

/**
*This class will be used as controller to serve the POST request
*
* @author Nithya
* @version 1.0
* @since   2019-09-08
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.product.bean.Product;
import com.product.bean.ProductDataInsertion;
import com.product.bean.ProductInsertionResponse;

@Controller
public class ProductInsertionController {


	  @RequestMapping(method = RequestMethod.POST, value="/insert/product")
	  @ResponseBody
	  public ProductInsertionResponse registerStudent(@RequestBody Product product) {
	  ProductInsertionResponse prodInsRes = new ProductInsertionResponse();           
	  ProductDataInsertion.getInstance().add(product);
	        //We are setting the below value just to reply a message back to the caller
		  prodInsRes.setProductID(product.getProductID());
		  prodInsRes.setProductName(product.getProductName());
		  prodInsRes.setProductModelNum(product.getProductModelNum());
		  prodInsRes.setProductType(product.getProductType());
		  prodInsRes.setProductMetaData(product.getProductMetaData());
		  prodInsRes.setProductPrice(product.getProductPrice());	
		  prodInsRes.setProductDescription(product.getProductDescription());
		  prodInsRes.setProductStatus("Successful");
	        
		  return prodInsRes;
	}
}
