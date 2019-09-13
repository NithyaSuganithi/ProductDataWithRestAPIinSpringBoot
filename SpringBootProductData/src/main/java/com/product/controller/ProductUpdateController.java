package com.product.controller;


/**
*This class will be used as controller to serve the PUT request
*
* @author Nithya
* @version 1.0
* @since   2019-09-10
*/


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.product.bean.Product;
import com.product.bean.ProductDataInsertion;


@Controller
public class ProductUpdateController {


		@RequestMapping(method = RequestMethod.PUT, value="/update/product")
		@ResponseBody
		public String upDateProduct(@RequestBody Product product) {

		    return ProductDataInsertion.getInstance().upDateProduct(product);
		}
}
