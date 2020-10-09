package model.dao;

import model.Product;

import javax.enterprise.context.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
public class ProductDao {
    public List<Product> listAll() {
        return new ArrayList<Product>();
    }

    public void add(Product product) {
    }
}
