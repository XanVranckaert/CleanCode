package be.cegeka.domain.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {
    List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
