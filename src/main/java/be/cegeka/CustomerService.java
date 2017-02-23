package be.cegeka;

/**
 * Created by xanv on 23/02/2017.
 */
public class CustomerService {
    private CustomerRepository customerRepository;

    public void addCustomer(String name) {
        Customer customer = new Customer(name);
        customerRepository.addCustomer(customer);
    }
}
