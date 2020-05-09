package enumy.zadanie;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public static List<Product> retrieveFruits(List<Product> products) {
        List <Product> fruits = new ArrayList<>();

        for (Product product : products) {
            if(product.getProductType() == ProductType.OWOCE) {
                fruits.add(product);
            }
        }

        return fruits;
    }
}
