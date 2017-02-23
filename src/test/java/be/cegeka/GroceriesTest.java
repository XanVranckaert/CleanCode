package be.cegeka;


import be.cegeka.domain.Groceries.GroceryItem;
import be.cegeka.domain.Groceries.ShoppingCartRepository;
import be.cegeka.domain.Groceries.ShoppingCartService;
import be.cegeka.domain.customer.Customer;
import be.cegeka.domain.customer.CustomerRepository;
import be.cegeka.domain.customer.CustomerService;
import be.cegeka.domain.customer.ShoppingCart;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class GroceriesTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private CustomerService customerService;
    private ShoppingCartService shoppingCartService;

    @Mock
    private CustomerRepository customerRepository;
    private ShoppingCartRepository shoppingCartRepository;

    Customer customer;
    ShoppingCart shoppingCart;

    @Before
    public void setUp(){
        customer = new Customer("Xan");
    }

    @Test
    public void testSaveTheGroceriesByDay(){

        shoppingCartService.addGroceries("apple");
        shoppingCartService.addGroceries("pineapple");
        shoppingCartService.addGroceries("tomato");

        Map<Customer,GroceryItem> customerGroceryItem = shoppingCartService.getAllGroceries();

        Assertions.assertThat(shoppingCartService.getAllGroceries().size() == 3 );

    }

}
/*

public void getAllCustomers_GetsCustomersFromRepo(){
        customerService.addCustomer("Marijn");
        customerService.addCustomer("Matthias");
        customerService.addCustomer("Bart");
        Set<Customer> customers = customerService.getAllCustomers();

        Assertions.assertThat(customerService.getAllCustomers().size()==3);
    }

    @Test
    public void serviceGetCustomerByName(){
        when(customerRepository.getCustomerByName("Marijn")).thenReturn(new Customer("Marijn"));
        customerService.addCustomer("Marijn");
        Customer result=customerService.getCustomerByName("Marijn");
        Assertions.assertThat(result.getName().equals("Marijn"));
    }

    @Test
    public void serviceGetCustomerByLoyaltyCard(){)
        when(customerRepository.getCustomerByLoyaltyCard("BarcodeMarijn")).thenReturn(new Customer("Marijn",new LoyaltyCard("BarcodeMarijn",0)));
        customerService.addCustomerWithLoyaltyCard("Marijn","BarcodeMarijn");
        Customer result=customerService.getCustomerByLoyaltyCard("BarcodeMarijn");
        Assertions.assertThat(result.getName().equals("Marijn"));
        Assertions.assertThat(result.getLoyaltyCard().getBarCode().equals("BarcodeMarijn"));
        Assertions.assertThat(result.getLoyaltyCard().getBonusPoints()==0);

    }

 */