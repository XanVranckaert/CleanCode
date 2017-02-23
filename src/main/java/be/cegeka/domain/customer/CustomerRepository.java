package be.cegeka.domain.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public Customer getCustomerByName(String name) {
        Customer returnCustomer = null;
        for (Customer customer:customers) {
            if(customer.getName().equals(name)) {
                returnCustomer = customer;
            }
        }
        return returnCustomer;
    }

    public Customer getCustomerByLoyaltyCard(String barCode) {
        Customer returnCustomer = null;
        for (Customer customer:customers) {
            if(customer.getLoyaltyCard().getBarCode().equals(barCode)) {
                returnCustomer = customer;
            }
        }
        return returnCustomer;
    }
}
