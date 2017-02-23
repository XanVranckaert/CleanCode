package be.cegeka.domain.Groceries;


import be.cegeka.domain.customer.Customer;

import java.util.Map;


public class ShoppingCartService {
    private ShoppingCartRepository shoppingCartRepository;

    public void addGroceries(GroceryItem groceryItem) {
        shoppingCartRepository.addGroceries(groceryItem);


    }

    public Map<Customer,GroceryItem> getAllGroceries() {
        return shoppingCartRepository.allGroceries();
    }
}
