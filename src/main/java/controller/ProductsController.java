package controller;

import br.com.caelum.vraptor.Controller;
import model.Product;
import model.dao.ProductDao;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductsController {

    @Inject
    private ProductDao dao;

    public List<Product> list() {
        return dao.listAll();
    }
    public void form(){}
    public void add(Product product){
        dao.add(product);
    }
}
