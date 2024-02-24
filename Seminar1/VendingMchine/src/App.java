import java.util.ArrayList;
import java.util.List;

import domen.Bottle;
import domen.HotDrink;
import domen.Product;
import services.CoinDispenser;
import services.Display;
import services.Holder;
import services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(
                1, "chips", 120.3, 2);
        Product product2 = new Product(
                2, "chocolate", 80.6, 4);
        Product product3 = new Product(
                3, "nuts", 55, 3);
        Product bottle1 = new Bottle(
                4, "Cola", 58, 6, 0.33);
        Product hotDrink1 = new HotDrink(
            5, "cofee", 75, 8, 90); 
        Product hotDrink2 = new HotDrink(
            6, "tea", 35.20, 9, 98);    
            
            List<Product> ourList = new ArrayList();
            ourList.add(product1);
            ourList.add(product2);
            ourList.add(product3);
            ourList.add(bottle1);
            ourList.add(hotDrink1);
            ourList.add(hotDrink2);

        Holder holder = new Holder();
        Display display = new Display();
        CoinDispenser coinDispenser = new CoinDispenser();

        VendingMachine machine = new VendingMachine(
                holder, display, coinDispenser, ourList);

        for (Product item : machine.getProducts()) {
            System.out.println(item);
        }

    }

}
