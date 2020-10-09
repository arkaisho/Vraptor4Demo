package controller;

import br.com.caelum.vraptor.Controller;
import model.Product;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductsController {
    public List<Product> list() {
        return new ArrayList<Product>();
    }
}
