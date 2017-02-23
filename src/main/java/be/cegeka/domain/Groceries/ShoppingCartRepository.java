package be.cegeka.domain.Groceries;


import be.cegeka.domain.customer.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShoppingCartRepository {
    private GroceryItem groceryItem;
    private List<GroceryItem> groceryItems = new ArrayList<>();
    public void addGroceries(GroceryItem groceryItem) {
        groceryItems.add(groceryItem);
    }

    public Map<Customer,GroceryItem> allGroceries() {
        return null;
    }
}
