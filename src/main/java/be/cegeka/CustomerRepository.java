package be.cegeka;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xanv on 23/02/2017.
 */
public class CustomerRepository {
    List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
