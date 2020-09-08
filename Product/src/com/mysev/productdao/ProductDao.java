package com.mysev.productdao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.mysev.dbutil.DbConnection;
import com.mysev.model.Product;

public class ProductDao {
	public String saveProduct(Product product)
	{

	try{
	Connection con= DbConnection.getConnect();
	String sql="insert into products values(?,?,?,?,?,?)";
	PreparedStatement stat=con.prepareStatement(sql);

	stat.setInt(1, product.getProdId());
	stat.setString(2, product.getProdName());
	stat.setFloat(3, product.getProdPrice());
	stat.setDate(4, new java.sql.Date(product.getMfd().getTime()));
	stat.setString(5, product.getColour());
	stat.setDate(6, new java.sql.Date(product.getExpDate().getTime()));


	int res= stat.executeUpdate();
	if(res>0)
	return "Product Created";


	}
	catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	}
	return "cannot create product";
	}

}
