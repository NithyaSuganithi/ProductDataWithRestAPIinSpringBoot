package com.product.controller;

/**
*This class will be used as controller to serve the DELETE request
*
* @author Nithya
* @version 1.0
* @since   2019-09-10
*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.product.bean.ProductDataInsertion;

import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductDeletionController {
	
	@RequestMapping(method = RequestMethod.DELETE, value="/delete/product/{productIDVal}")
	@ResponseBody
	public String deleteStudentRecord(@PathVariable("productIDVal") String productIDVal) {
	 
	    return ProductDataInsertion.getInstance().deleteProductData(productIDVal);
	}


}
