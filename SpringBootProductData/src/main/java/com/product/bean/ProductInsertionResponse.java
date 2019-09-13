package com.product.bean;

/**
*This class will be used to reply a response back to the client application
*
* @author Nithya
* @version 1.0
* @since   2019-09-08
*/

public class ProductInsertionResponse {
	
	
	String productID;
	String productName;
	String productModelNum;
	String productType;
	String productMetaData;
	String productPrice;
	String productDescription;
	String productStatus;
	
	
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductModelNum() {
		return productModelNum;
	}
	public void setProductModelNum(String productModelNum) {
		this.productModelNum = productModelNum;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductMetaData() {
		return productMetaData;
	}
	public void setProductMetaData(String productMetaData) {
		this.productMetaData = productMetaData;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

}
