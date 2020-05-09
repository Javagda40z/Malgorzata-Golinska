package enumy.zadanie;

import java.util.Arrays;
import java.util.List;

public class ProductItems {
    public static void main(String[] args) {

        Product product1 = new Product("kiwi", 12, 3.4, ProductType.OWOCE);
        Product product2 = new Product("banany", 7, 1.2,ProductType.OWOCE);
        Product product3 = new Product("papryka", 4, 0.3, ProductType.WARZYWA);
        Product product4 = new Product("papaja", 9, 0.03, ProductType.OWOCE);
        Product product5 = new Product("masło", 11, 0.5, ProductType.NABIAL);

        List <Product> fruits = ProductService.retrieveFruits(Arrays.asList(product1, product2, product3, product4, product5));
        for (Product item : fruits) {
            System.out.println(item.getName() + " " + item.getProductType() + " " + item.getWeight() + " " + item.getPrice());
        }

    }

}
