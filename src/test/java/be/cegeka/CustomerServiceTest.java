package be.cegeka;

import be.cegeka.domain.customer.Customer;
import be.cegeka.domain.customer.CustomerRepository;
import be.cegeka.domain.customer.CustomerService;
import be.cegeka.domain.customer.LoyaltyCard;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.ArgumentMatchers.refEq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CustomerServiceTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private CustomerService customerService;

    @Mock
    private CustomerRepository customerRepository;

    Customer customer;

    @Before
    public void setUp(){
        customer = new Customer("Xan");
    }

    @Test
    public void serviceAddCustomer_ShouldCall_RepoAddCustomer(){
        customerService.addCustomer("Xan");
        verify(customerRepository).addCustomer(refEq(customer));
    }

    @Test
    public void serviceGetAllCustomers_ShouldGetAllCustomersFromRepo(){
        customerService.addCustomer("Xan");
        customerService.addCustomer("Marijn");
        customerService.addCustomer("Bart");

        Assertions.assertThat(customerService.getAllCustomers().toString().equals("Xan,Marijn,Bart"));
    }

    @Test
    public void serviceGetCustomerByName(){
        when(customerRepository.getCustomerByName("Marijn")).thenReturn(new Customer("Marijn"));
        customerService.addCustomer("Marijn");
        Customer result=customerService.getCustomerByName("Marijn");
        Assertions.assertThat(result.getName().equals("Marijn"));
    }

    @Test
    public void serviceGetCustomerByLoyaltyCard(){
        when(customerRepository.getCustomerByLoyaltyCard("BarcodeMarijn")).thenReturn(new Customer("Marijn",new LoyaltyCard("BarcodeMarijn",0)));
        customerService.addCustomerWithLoyaltyCard("Marijn","BarcodeMarijn");
        Customer result=customerService.getCustomerByLoyaltyCard("BarcodeMarijn");
        Assertions.assertThat(result.getName().equals("Marijn"));
        Assertions.assertThat(result.getLoyaltyCard().getBarCode().equals("BarcodeMarijn"));
        Assertions.assertThat(result.getLoyaltyCard().getBonusPoints()==0);

    }

}
