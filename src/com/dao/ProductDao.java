package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.ProductBean;
import com.util.DbConnection;

public class ProductDao {

	public ArrayList<ProductBean> getAllproducts() {
		// id name price qty
		ArrayList<ProductBean> products = new ArrayList<ProductBean>();

		try {
			Connection con = DbConnection.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from products");

			ResultSet rs = pstmt.executeQuery(); // 5 row

			while (rs.next()) {// 1st row

				ProductBean p = new ProductBean(); // productId name price qty category
				p.setProductId(rs.getInt("productId"));
				p.setName(rs.getString("name"));
				p.setQty(rs.getInt("qty"));
				p.setCategory(rs.getString("category"));
				p.setPrice(rs.getInt("price"));

				products.add(p);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return products;
	}
}
