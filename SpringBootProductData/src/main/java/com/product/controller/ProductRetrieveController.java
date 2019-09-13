package com.product.controller;


/**
*This class will be used as controller to serve the GET request
*
* @author Nithya
* @version 1.0
* @since   2019-09-08
*/

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.product.bean.Product;
import com.product.bean.ProductDataInsertion;

@Controller
public class ProductRetrieveController {
	
	  @RequestMapping(method = RequestMethod.GET, value="/product/getAllProducts")
	  @ResponseBody
	  public List<Product> getProductRecords() {
	  return ProductDataInsertion.getInstance().getProductRecords();
	  }

}
