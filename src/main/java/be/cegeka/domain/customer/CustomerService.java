package be.cegeka.domain.customer;

import java.util.List;


public class CustomerService {

    private CustomerRepository customerRepository;

    public void addCustomer(String name) {
        Customer customer = new Customer(name);
        customerRepository.addCustomer(customer);
    }

    public void addCustomerWithLoyaltyCard(String name, String barCode) {
        Customer customer = new Customer(name, new LoyaltyCard(barCode,0));
        customerRepository.addCustomer(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }

    public Customer getCustomerByName(String name){
        return customerRepository.getCustomerByName(name);
    }

    public LoyaltyCard getLoyaltyCardForCustomer(String name){
        return customerRepository.getCustomerByName(name).getLoyaltyCard();
    }

    public Customer getCustomerByLoyaltyCard(String barCode){
        return customerRepository.getCustomerByLoyaltyCard(barCode);
    }

}
