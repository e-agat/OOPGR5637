package services;

import java.util.List;

import domen.Product;



 /**
  * Класс для наполнения VendingMachine
  */

public class VendingMachine {
    private Holder holder;
    private Display display;
    private CoinDispenser coinDispenser;
    private List<Product> products;

    
    public VendingMachine(Holder holder, Display display, CoinDispenser coinDispenser, List<Product> products) {
        this.holder = holder;
        this.display = display;
        this.coinDispenser = coinDispenser;
        this.products = products;
    }


    public Holder getHolder() {
        return holder;
    }


    public void setHolder(Holder holder) {
        this.holder = holder;
    }


    public Display getDisplay() {
        return display;
    }


    public void setDisplay(Display display) {
        this.display = display;
    }


    public CoinDispenser getCoinDispenser() {
        return coinDispenser;
    }


    public void setCoinDispenser(CoinDispenser coinDispenser) {
        this.coinDispenser = coinDispenser;
    }


    public List<Product> getProducts() {
        return products;
    }

/**
 * @apiNote добавление продукта в аппарат
 * @param products объект добавляемого продукта
 */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        if (product.getPrice() <= 0) {
            product.setPrice(100);   
        }
        this.products.add(product);

        
    }
}
